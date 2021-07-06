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
package club.xiaoandx.dao;

import club.xiaoandx.entity.StudentInfo;
import club.xiaoandx.entity.vo.SearchVo;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>  </p>
 *
 * @version V1.0.0
 * @ClassName:StudentDao
 * @author: WEI.ZHOU
 * @date: 2021/6/10 21:04
 */
public class StudentDao extends BaseDao{

    public static List<StudentInfo> findAllStudentInfo(int stat,int limitNumber) {
        String sql = "SELECT id,username,sex,sid,city,cellphone,birthData,`status`,classid,dormid" +
                " FROM studentinfo LIMIT ?,?";
        List<StudentInfo> studentInfos = select(StudentInfo.class, sql,stat,limitNumber);
        if(studentInfos.size() == 0 || studentInfos.isEmpty()){
            studentInfos = new ArrayList<>();
        }
        return studentInfos;
    }

    public static StudentInfo findStuInfoById(Integer id) {
        String sql = "SELECT id,username,sex,sid,city,cellphone,birthData,`status`,classid,dormid " +
                "FROM studentinfo WHERE id = ?";
        List<StudentInfo> studentInfos = select(StudentInfo.class, sql, id);
        if(studentInfos.size() == 0 || studentInfos.isEmpty()){
            studentInfos = new ArrayList<>();
            return new StudentInfo();
        }
        return studentInfos.get(0);
    }

    public static int updateStuInfoById(StudentInfo newStudentInfo) {
        String sql = "UPDATE studentinfo SET username=?,sex=?,city=?,cellphone=?," +
                "birthData=?,sId=?,`status`=?,classid=?,dormid=?  WHERE id=?";
        int status = updata(sql, newStudentInfo.getUsername(),newStudentInfo.getSex(),
                newStudentInfo.getCity(),newStudentInfo.getCellphone(),
                newStudentInfo.getBirthdata(),newStudentInfo.getSid(),newStudentInfo.getStatus(),
                newStudentInfo.getClassid(),newStudentInfo.getDormid(),newStudentInfo.getId());
        return status;
    }

    public static int deleteStuInfById(Integer id) {
        String sql = "DELETE FROM studentinfo AS s WHERE s.id =?";
        int status = updata(sql, id);
        return status;
    }

    public static int insertStuInfo(StudentInfo studentInfo) {
        String sql = "INSERT INTO studentinfo (username,sex,city,cellphone,birthData,sid,`status`," +
                "classid,dormid) VALUES (?,?,?,?,?,?,?,?,?);";
        int status = updata(sql, studentInfo.getUsername(),studentInfo.getSex(),
                studentInfo.getCity(),studentInfo.getCellphone(),studentInfo.getBirthdata(),
                studentInfo.getSid(),studentInfo.getStatus(),studentInfo.getClassid(),
                studentInfo.getDormid());
        return status;
    }

    public static List<StudentInfo> findSearchStudentInfo(int stat, int limitNumber, SearchVo stu) {
        String sql = "SELECT id,username,sex,sid,city,cellphone,birthData,`status`,classid,dormid" +
                " FROM studentinfo WHERE  1=1 ";
        List<StudentInfo> studentInfos = null;
        if(stu.getUsername() != "" && !stu.getUsername().equals("null")){
            sql += "AND username = ? ";
            if(stu.getSid() != 0 && stu.getSid() != 101){
                sql += "AND sid = ? LIMIT ?,?";
                studentInfos = select(StudentInfo.class, sql,stu.getUsername(),
                        stu.getSid(),stat,
                        limitNumber);
            }else {
                sql += " LIMIT ?,?";
                studentInfos = select(StudentInfo.class, sql,stu.getUsername(),stat,
                        limitNumber);
            }
        }else{
            if(stu.getSid() != 0 && stu.getSid() != 101){
                sql += "AND sid = ?  LIMIT ?,?";
                studentInfos = select(StudentInfo.class, sql,stu.getSid() ,stat,
                            limitNumber);
            }
        }

        if(studentInfos.size() == 0 || studentInfos.isEmpty()){
            studentInfos = new ArrayList<>();
        }
        return studentInfos;
    }
}
