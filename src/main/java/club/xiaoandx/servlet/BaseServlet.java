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
package club.xiaoandx.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * <p> Servlet抽象公共类 </p>
 * @version V1.0.0
 * @ClassName:BaseServlet
 * @author: WEI.ZHOU
 * @date: 2021/6/5 18:31
 */
public class BaseServlet extends HttpServlet {

    /**
     * @title: doGet
     * @date: 2021/6/5 18:33
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param request
     * @param response
     * @return: void
     **/
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("application/json; charset=utf-8");
            String methodName = request.getParameter("method");
            Class<? extends BaseServlet> clazz = this.getClass();
            Method method = clazz.getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            method.invoke(this, request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
