/*
 * Copyright (c) 2021 WEI.ZHOU. All rights reserved.
 * The following code is only used for learning and communication, not for illegal and
 * commercial use.
 * If the code is used, no consent is required, but the author has nothing to do with any problems
 * and consequences.
 * In case of code problems, feedback can be made through the following email address.
 *
 *                        <xiaoandx@gmail.com>
 */
package club.xiaoandx.servlet.controller;

import club.xiaoandx.entity.User;
import club.xiaoandx.entity.vo.LoginVo;
import club.xiaoandx.service.LoginService;
import club.xiaoandx.servlet.BaseServlet;
import club.xiaoandx.util.CaptchaUtil;
import club.xiaoandx.util.DataHandleUtil;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * <p> 登录请求Servlet </p>
 * @ClassName:LoginServlet
 * @ClassName:LoginServlet
 * @author: WEI.ZHOU
 * @date: 2021/6/8 11:01
 */
public class LoginServlet extends BaseServlet {

    /**
     * <p> 登录认证 </p>
     * @title: login
     * @date: 2021/6/8 11:04
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param request
     * @param response
     * @return: void
     * @throws:
     **/
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Map<String, Object> result = new HashMap<>();
        LoginVo loginVo = DataHandleUtil.postRequestJsonToObject(request,
                LoginVo.class);
        HttpSession session = request.getSession();
        String checkCode = (String) session.getAttribute("code");
        if (loginVo.getCode().equals(checkCode)) {
            User loginUser = LoginService.login(loginVo.getUsername());

            boolean isPassWord =
                    (loginUser.getUpassword().equals(loginVo.getPassword()) ||
                            loginUser.getDpassword().equals(loginVo.getPassword()));

            if(null != loginUser && isPassWord){
                loginUser.setUpassword("");
                loginUser.setDpassword("");
                if(loginVo.getIsLogindata() == 1){
                    session.setMaxInactiveInterval(60*60*48);
                    session.setAttribute("loginUser",loginUser);
                    result.put("sessionId", session.getId());
                }
                result.put("status",1);
                result.put("message","success");
                session.setAttribute("loginUser",loginUser);
                String json = DataHandleUtil.objectToJsonString(response,result);
                PrintWriter writer = response.getWriter();
                writer.append(json);
            }else{
                result.put("status",-2);
                result.put("message","用户名密码错误");
                String json = DataHandleUtil.objectToJsonString(response,result);
                PrintWriter writer = response.getWriter();
                writer.append(json);
            }
        } else {
            result.put("status",-1);
            result.put("message","验证码错误");
            String json = DataHandleUtil.objectToJsonString(response,result);
            PrintWriter writer = response.getWriter();
            writer.append(json);
        }
    }

    /**
     * <p> 获取验证码 </p>
     * @title: captcha
     * @date: 2021/6/8 16:22
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param request
     * @param response
     * @return: void
     * @throws: IO 操作异常
     **/
    public void getCaptchar(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setHeader("Expires", "-1");
        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("Pragma", "-1");
        CaptchaUtil util = CaptchaUtil.Instance();
        String code = util.getString();
        request.getSession().setAttribute("code", code);
        ImageIO.write(util.getImage(), "jpg", response.getOutputStream());
    }

    /**
     * <p> 退出登录 </p>
     * @title: outLogin
     * @date: 2021/6/9 17:39
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param request
     * @param response
     * @return: void
     **/
    public void outLogin(HttpServletRequest request, HttpServletResponse response){
        System.out.println("退出登录------------>");
        request.getSession().removeAttribute("loginUser");
    }
}

