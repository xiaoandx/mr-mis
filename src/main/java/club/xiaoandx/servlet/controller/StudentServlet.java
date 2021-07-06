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

import club.xiaoandx.entity.StudentInfo;
import club.xiaoandx.entity.vo.ResultVo;
import club.xiaoandx.entity.vo.SearchVo;
import club.xiaoandx.service.StudentService;
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
 * <p> 学生信息操作Servlet </p>
 * @version V1.0.0
 * @ClassName:StudentServlet
 * @author: WEI.ZHOU
 * @date: 2021/6/10 20:55
 */
public class StudentServlet extends BaseServlet {

    /**
     * <p> 分页查询学生信息 </p>
     * @title: findAllStudentInfo
     * @date: 2021/6/12 21:51
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param request
     * @param response
     * @return: void
     * @throws:
     **/
    public void findAllStudentInfo(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String,Object> data = null;
        String page = request.getParameter("page");
        String limit = request.getParameter("limit");
        if(page.isEmpty() || limit.isEmpty()){
            data = StudentService.findAllStudentInfo(1,10);
        }
        data = StudentService.findAllStudentInfo(Integer.valueOf(page),
                Integer.valueOf(limit));
        String s = JSONUtil.objectToJson(data);
        PrintWriter writer = response.getWriter();
        writer.append(s);
    }

    /**
     * <p> 查找指定学生信息 </p>
     * @title: findStuInfoById
     * @date: 2021/6/12 21:51
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param request
     * @param response
     * @return: void
     * @throws:
     **/
    public void findStuInfoById(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");
        StudentInfo studentInfo = StudentService.findStuInfoById(id);
        String s = JSONUtil.objectToJson(studentInfo);
        PrintWriter writer = response.getWriter();
        writer.append(s);
    }

    /**
     * <p> 更新学生信息 </p>
     * @title: updateStuInfoById
     * @date: 2021/6/12 21:51
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param request
     * @param response
     * @return: void
     * @throws:
     **/
    public void updateStuInfoById(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String, Object> result = new HashMap<>();
        StudentInfo newStudentInfo = DataHandleUtil.postRequestJsonToObject(request,
                StudentInfo.class);
        int status = StudentService.updateStuInfoById(newStudentInfo);
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
     * <p> 删除学生信息 </p>
     * @title: deleteStuInfById
     * @date: 2021/6/12 21:52
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param request
     * @param response
     * @return: void
     * @throws:
     **/
    public void deleteStuInfById(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");
        int status = StudentService.deleteStuInfById(Integer.valueOf(id));
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
     * <p>  插入学生信息 </p>
     * @title: insertStuInfo
     * @date: 2021/6/12 21:52
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param request
     * @param response
     * @return: void
     * @throws:
     **/
    public void insertStuInfo(HttpServletRequest request, HttpServletResponse response) throws IOException {
        StudentInfo studentInfo = DataHandleUtil.postRequestJsonToObject(request,
                StudentInfo.class);
        int status = StudentService.insertStuInfo(studentInfo);
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
     * <p> 搜索学生信息 </p>
     * @title: search
     * @date: 2021/6/12 21:52
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
            username = new String(request.getParameter("username").getBytes("ISO-8859-1"),
                    "UTF-8");
        }catch (RuntimeException r){
            username = "null";
        }
        try {
           sid = request.getParameter("sid");
        }catch (RuntimeException r){
            sid = "101";
        }
        SearchVo searchVo = new SearchVo();
        searchVo.setUsername(username);
        searchVo.setSid(Integer.valueOf((null == sid)?"101":sid));
        Map<String,String> reqData = new HashMap<>();
        if(page.isEmpty() || limit.isEmpty()){
            data = StudentService.findSearchStudentInfo(1,10,searchVo);
        }
        data = StudentService.findSearchStudentInfo(Integer.valueOf(page),
                Integer.valueOf(limit),searchVo);
        String s = JSONUtil.objectToJson(data);
        PrintWriter writer = response.getWriter();
        writer.append(s);
    }
}
