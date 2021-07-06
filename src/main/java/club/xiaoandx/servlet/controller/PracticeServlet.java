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

import club.xiaoandx.entity.InternShip;
import club.xiaoandx.entity.vo.ResultVo;
import club.xiaoandx.entity.vo.SearchVo;
import club.xiaoandx.service.PracticeService;
import club.xiaoandx.servlet.BaseServlet;
import club.xiaoandx.util.DataHandleUtil;
import club.xiaoandx.util.JSONUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * <p> 实习信息 </p>
 * @version V1.0.0
 * @ClassName:PracticeServlet
 * @author: WEI.ZHOU
 * @date: 2021/6/12 10:26
 */
public class PracticeServlet extends BaseServlet {

    /**
     * <p> 分页查询所有的实习信息 </p>
     * @title: findAllPracticeToPage
     * @date: 2021/6/12 21:06
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param request
     * @param response
     * @return: void
     **/
    public void findAllPracticeToPage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String,Object> data = null;
        String page = request.getParameter("page");
        String limit = request.getParameter("limit");
        if(page.isEmpty() || limit.isEmpty()){
            data = PracticeService.findAllPracticeToPage(1,5);
        }
        data = PracticeService.findAllPracticeToPage(Integer.valueOf(page),
                Integer.valueOf(limit));
        String s = JSONUtil.objectToJson(data);
        PrintWriter writer = response.getWriter();
        writer.append(s);
    }

    /**
     * <p> 查询指定学生的实习就业信息  </p>
     * @title: findPracticeById
     * @date: 2021/6/12 21:08
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param request
     * @param response
     * @return: void
     * @throws:     IO操作异常
     **/
    public void findPracticeById(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String sid = request.getParameter("sid");
        InternShip internShip = PracticeService.findPracticeById(sid);
        String s = JSONUtil.objectToJson(internShip);
        PrintWriter writer = response.getWriter();
        writer.append(s);
    }

    /**
     * <p> 更新指定学生的就业信息 </p>
     * @title: updateStuInfoById
     * @date: 2021/6/12 21:08
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param request
     * @param response
     * @return: void
     * @throws:
     **/
    public void updateStuInfoById(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String, Object> result = new HashMap<>();
        InternShip internShip = DataHandleUtil.postRequestJsonToObject(request,
                InternShip.class);
        int status = PracticeService.updateInternShipById(internShip);
        if(status != 0){
            result.put("status",0);
            result.put("message","update success");
            String json = DataHandleUtil.objectToJsonString(response,result);
            PrintWriter writer = response.getWriter();
            writer.append(json);
        }else {
            result.put("status", -1);
            result.put("message", "update error");
            String json = DataHandleUtil.objectToJsonString(response, result);
            PrintWriter writer = response.getWriter();
            writer.append(json);
        }
    }

    /**
     * <p> 删除指定用户的就业信息 </p>
     * @title: deleteInternShipById
     * @date: 2021/6/12 21:09
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param request
     * @param response
     * @return: void
     * @throws:
     **/
    public void deleteInternShipById(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String sid = request.getParameter("sid");
        int status = PracticeService.deleteInternShipById(Integer.valueOf(sid));
        if(status != 0){
            String json = DataHandleUtil.objectToJsonString(response,new ResultVo(0,"success",
                    null));
            PrintWriter writer = response.getWriter();
            writer.append(json);
        }else {
            String json = DataHandleUtil.objectToJsonString(response,new ResultVo(-1,"error",
                    null));
            PrintWriter writer = response.getWriter();
            writer.append(json);
        }
    }

    /**
     * <p> 插入学生毕业信息 </p>
     * @title: insertPractice
     * @date: 2021/6/12 21:10
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param request
     * @param response
     * @return: void
     * @throws:
     **/
    public void insertPractice(HttpServletRequest request, HttpServletResponse response) throws IOException {
        InternShip internShip = DataHandleUtil.postRequestJsonToObject(request,
                InternShip.class);
        int status = PracticeService.insertPractice(internShip);
        if(status != 0){
            String json = DataHandleUtil.objectToJsonString(response,new ResultVo(0,"success",
                    null));
            PrintWriter writer = response.getWriter();
            writer.append(json);
        }else {
            String json = DataHandleUtil.objectToJsonString(response,new ResultVo(-1,"error",
                    null));
            PrintWriter writer = response.getWriter();
            writer.append(json);
        }
    }

    /**
     * <p> 学生毕业信息搜索 </p>
     * @title: search
     * @date: 2021/6/12 21:17
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param request
     * @param response
     * @return: void
     * @throws:
     **/
    public void search(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String,Object> data = null;
        String page = request.getParameter("page");
        String limit = request.getParameter("limit");
        String username ;
        String sid;
        try {
            username = new String(request.getParameter("sname").getBytes("ISO-8859-1"),
                    "UTF-8");
        }catch (RuntimeException | UnsupportedEncodingException r){
            username = "null";
        }
        try {
            sid = request.getParameter("sid");
        }catch (RuntimeException r){
            sid = "101";
        }
        SearchVo searchVo = new SearchVo();
        searchVo.setUsername(username);
        searchVo.setSid(Integer.valueOf((null == sid)? "101" : sid ));
        Map<String,String> reqData = new HashMap<>();
        if(page.isEmpty() || limit.isEmpty()){
            data = PracticeService.findSearchPractice(1,5,searchVo);
        }
        data = PracticeService.findSearchPractice(Integer.valueOf(page),
                Integer.valueOf(limit),searchVo);
        String s = JSONUtil.objectToJson(data);
        PrintWriter writer = response.getWriter();
        writer.append(s);
    }
}
