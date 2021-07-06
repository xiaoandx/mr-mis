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
 * <p> 学生信息 </p>
 * @version V1.0.0
 * @ClassName:StudentInfo
 * @author: WEI.ZHOU
 * @date: 2021/6/9 15:21
 */
public class StudentInfo {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 姓名
     */
    private String username;

    /**
     * 性别
     */
    private String sex;

    /**
     * 居住地
     */
    private String city;

    /**
     * 学号
     */
    private Integer sid;

    /**
     * 手机号
     */
    private String cellphone;

    /**
     * 出身日期
     */
    private String birthdata;

    /**
     * 就业状态
     */
    private Integer status;

    /**
     * 班级
     */
    private String classid;

    /**
     * 寝室
     */
    private String dormid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getBirthdata() {
        return birthdata;
    }

    public void setBirthdata(String birthdata) {
        this.birthdata = birthdata;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getDormid() {
        return dormid;
    }

    public void setDormid(String dormid) {
        this.dormid = dormid;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", city='" + city + '\'' +
                ", sid=" + sid +
                ", cellphone=" + cellphone +
                ", birthdata='" + birthdata + '\'' +
                ", status=" + status +
                ", classid='" + classid + '\'' +
                ", dormid='" + dormid + '\'' +
                '}';
    }
}
