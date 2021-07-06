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
 * <p> 就业信息 </p>
 * @version V1.0.0
 * @ClassName:InternShip
 * @author: WEI.ZHOU
 * @date: 2021/6/9 15:23
 */
public class InternShip {
    /**
     * 学号
     */
    private Integer sid;

    /**
     * 姓名
     */
    private String sname;

    /**
     * 就业状态 1考研 2考公 3实习 4其它
     */
    private Integer status;

    /**
     * 是否离校
     */
    private Integer isleaving;

    /**
     * 公司名称
     */
    private String companyname;

    /**
     * 公司地点
     */
    private String companyplace;

    /**
     * 公司联系方式
     */
    private String contactinformation;

    /**
     * 薪资
     */
    private String salary;


    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsleaving() {
        return isleaving;
    }

    public void setIsleaving(Integer isleaving) {
        this.isleaving = isleaving;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getCompanyplace() {
        return companyplace;
    }

    public void setCompanyplace(String companyplace) {
        this.companyplace = companyplace;
    }

    public String getContactinformation() {
        return contactinformation;
    }

    public void setContactinformation(String contactinformation) {
        this.contactinformation = contactinformation;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "InternShip{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", status=" + status +
                ", isleaving=" + isleaving +
                ", companyname='" + companyname + '\'' +
                ", companyplace='" + companyplace + '\'' +
                ", contactinformation='" + contactinformation + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
