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
package club.xiaoandx.service;

import club.xiaoandx.dao.HomeDao;
import club.xiaoandx.dao.StudentDao;
import club.xiaoandx.entity.StudentInfo;
import club.xiaoandx.entity.vo.SearchVo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p> 学生相关业务操作 </p>
 * @version V1.0.0
 * @ClassName:StudentService
 * @author: WEI.ZHOU
 * @date: 2021/6/10 20:59
 */
public class StudentService {

    public static Map<String, Object> findAllStudentInfo(int page, int limit) {
        Map<String,Object> data = new HashMap<>();
        data.put("code", 0);
        data.put("msg", "");
        int studentCount = HomeDao.getCountByStatusBy(0);
        int stat = (page - 1)*10;
        List<StudentInfo> studentInfos = StudentDao.findAllStudentInfo(stat,limit);
        data.put("count",studentCount);
        data.put("data",studentInfos);
        return data;
    }

    public static StudentInfo findStuInfoById(String id) {
        StudentInfo studentInfo = StudentDao.findStuInfoById(Integer.valueOf(id));
        return studentInfo;
    }

    public static int updateStuInfoById(StudentInfo newStudentInfo) {
        if(null == newStudentInfo || 0 == newStudentInfo.getId()){
            return 0;
        }
        return StudentDao.updateStuInfoById(newStudentInfo);
    }

    public static int deleteStuInfById(Integer id) {
        if(id == 0 || null == id){
            return 0;
        }
        return StudentDao.deleteStuInfById(id);
    }

    public static int insertStuInfo(StudentInfo studentInfo) {
        StudentInfo hasStudentInfo = StudentDao.findStuInfoById(studentInfo.getId());
        if (null == studentInfo){
            return 0;
        }
        if(null == hasStudentInfo.getId()){
            return StudentDao.insertStuInfo(studentInfo);
        }else{
            return  0;
        }
    }

    public static Map<String, Object> findSearchStudentInfo(int page, int limit,
                                                            SearchVo stu) {
        Map<String,Object> data = new HashMap<>();
        data.put("code", 0);
        int stat = (page - 1)*10;
        int studentCount = HomeDao.getCountBySearch(stu);
        List<StudentInfo> studentInfos = StudentDao.findSearchStudentInfo(stat,limit,stu);
        data.put("count",studentCount);
        data.put("data",studentInfos);
        if(studentInfos.size()==0){
            data.put("msg", "search error");
        }
        data.put("msg", "search success");
        return data;
    }
}
