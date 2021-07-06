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
package club.xiaoandx.entity;

/**
 * <p> 用户实体 </p>
 * @version V1.0.0
 * @ClassName:User
 * @author: WEI.ZHOU
 * @date: 2021/4/20 20:41
 */
public class User {

    /**
     * 用户编号
     */
    private String uid;

    /**
     * 姓名
     */
    private String uname;

    /**
     * 学号
     */
    private String studentid;

    /**
     * 用户修改密码
     */
    private String upassword;

    /**
     * 权限id
     */
    private Integer rid;

    /**
     * 默认密码
     */
    private String dpassword;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getDpassword() {
        return dpassword;
    }

    public void setDpassword(String dpassword) {
        this.dpassword = dpassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", uname='" + uname + '\'' +
                ", studentid='" + studentid + '\'' +
                ", upassword='" + upassword + '\'' +
                ", rid=" + rid +
                ", dpassword='" + dpassword + '\'' +
                '}';
    }
}