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
package club.xiaoandx.entity.vo;

/**
 * <p> 学生就业情况统计 </p>
 * @version V1.0.0
 * @ClassName:StudentCountVo
 * @author: WEI.ZHOU
 * @date: 2021/6/9 20:10
 */
public class StudentCountVo {
    private Integer allCount;
    private Integer entrance;
    private Integer kaoGong;
    private Integer internship;
    private Integer others;

    public Integer getAllCount() {
        return allCount;
    }

    public void setAllCount(Integer allCount) {
        this.allCount = allCount;
    }

    public Integer getEntrance() {
        return entrance;
    }

    public void setEntrance(Integer entrance) {
        this.entrance = entrance;
    }

    public Integer getKaoGong() {
        return kaoGong;
    }

    public void setKaoGong(Integer kaoGong) {
        this.kaoGong = kaoGong;
    }

    public Integer getOthers() {
        return others;
    }

    public void setOthers(Integer others) {
        this.others = others;
    }

    public Integer getInternship() {
        return internship;
    }

    public void setInternship(Integer internship) {
        this.internship = internship;
    }

    @Override
    public String toString() {
        return "StudentCountVo{" +
                "allCount=" + allCount +
                ", entrance=" + entrance +
                ", kaoGong=" + kaoGong +
                ", internship=" + internship +
                ", others=" + others +
                '}';
    }
}
