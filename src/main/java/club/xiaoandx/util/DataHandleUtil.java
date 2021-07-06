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
package club.xiaoandx.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;

/**
 * <p> 数据处理工具类 </p>
 * @version V1.0.0
 * @ClassName:DataHandleUtil
 * @author: WEI.ZHOU
 * @date: 2021/6/9 15:05
 */
public class DataHandleUtil {

    /**
     * <p> 前端get URL传参请求json转Map </p>
     * @title: requestJsonToMap
     * @date: 2021/6/9 15:03
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param request
     * @return: java.util.Map<java.lang.String,java.lang.String>
     * @throws: IOException IO操作异常
     **/
    public static Map<String, String> getRequestJsonToMap(HttpServletRequest request) {
        Map<String, String> resutDataMap = null;
        StringBuffer json = new StringBuffer();
        String line = null;
        try {
            BufferedReader reader = request.getReader();
            while((line = reader.readLine()) != null) {
                json.append(line);
            }
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
        String[] s1=json.toString().split("&");
        resutDataMap = new HashMap<>();
        for (int i = 0; i<s1.length;i++){
            String[] keyAndValue = s1[i].split("=");
            resutDataMap.put(keyAndValue[0],keyAndValue[1]);
        }
        return resutDataMap;
    }

    /**
     * <p> 前端json传参转java实体对象 </p>
     * @title: postRequestJsonToObject
     * @date: 2021/6/9 16:50
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param request
     * @param beanType
     * @return: T
     **/
    public static <T> T postRequestJsonToObject(HttpServletRequest request, Class<T> beanType){
        StringBuffer json = new StringBuffer();
        String line = null;
        try {
            BufferedReader reader = request.getReader();
            while((line = reader.readLine()) != null) {
                json.append(line);
            }
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
        T t = JSONUtil.jsonToPojo(json.toString(),beanType);
        return t;
    }

    /**
     * <p> java 对象转json字符串 </p>
     * @title: objectToJsonString
     * @date: 2021/6/9 15:58
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param response
     * @param rest          转换对象
     * @return: java.lang.String
     * @throws: JsonProcessingException  转换异常
     **/
    public static String objectToJsonString(HttpServletResponse response, Object rest) {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = null;
        try {
            jsonString = mapper.writerWithDefaultPrettyPrinter()
                    .writeValueAsString(rest);
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json; charset=utf-8");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonString;
    }
}
