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

import club.xiaoandx.entity.vo.ResultVo;
import club.xiaoandx.entity.vo.StudentCountVo;
import club.xiaoandx.entity.vo.UpdatePasswordVo;
import club.xiaoandx.service.HomeService;
import club.xiaoandx.service.LoginService;
import club.xiaoandx.servlet.BaseServlet;
import club.xiaoandx.util.DataHandleUtil;
import club.xiaoandx.util.JSONUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * <p> 首页servlet </p>
 * @version V1.0.0
 * @ClassName:HomeServlet
 * @author: WEI.ZHOU
 * @date: 2021/6/9 17:48
 */
public class HomeServlet extends BaseServlet {

    /**
     * <p> 获取用户菜单 </p>
     * @title: getMenu
     * @date: 2021/6/9 19:57
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param request
     * @param response
     * @return: void
     **/
    public void getMenu(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String rid = request.getParameter("rid");
        Map<String,Object> menus = HomeService.getMenuByRid(rid);
        String s = JSONUtil.objectToJson(menus);
        PrintWriter writer = response.getWriter();
        writer.append(s);
    }

    /**
     * <p> 获取学生实习统计数据 </p>
     * @title: getStudentCount
     * @date: 2021/6/10 21:00
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param request
     * @param response
     * @return: void
     * @throws:
     **/
    public void getStudentCount(HttpServletRequest request, HttpServletResponse response) throws IOException {
        StudentCountVo studentCountVo = HomeService.getCountByStatus();
        Map<String, Object> result = new HashMap<>();
        if(studentCountVo != null){
            request.getSession().setAttribute("studentCount",studentCountVo);
        }else{
            result.put("status",-1);
            result.put("message","data is 0");
            String json = DataHandleUtil.objectToJsonString(response,result);
            PrintWriter writer = response.getWriter();
            writer.append(json);
        }
    }

    /**
     * <p> 修改密码  </p>
     * @title: updatePassword
     * @date: 2021/6/10 17:45
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param request
     * @param response
     * @return: void
     * @throws:
     **/
    public void updatePassword(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ResultVo resultVo = new ResultVo();
        UpdatePasswordVo updatePasswordVo = DataHandleUtil.postRequestJsonToObject(request,
                UpdatePasswordVo.class);
        ResultVo result = LoginService.updatePassword(updatePasswordVo);
        if(null != result.getData()){
            request.getSession().setAttribute("loginUser",result.getData());
        }
        String json = DataHandleUtil.objectToJsonString(response,result);
        PrintWriter writer = response.getWriter();
        writer.append(json);
    }

}
