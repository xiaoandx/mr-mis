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
 * <p> 权限分类 </p>
 * @version V1.0.0
 * @ClassName:Role
 * @author: WEI.ZHOU
 * @date: 2021/6/9 15:12
 */
public class Role {

    private Integer rid;
    private String title;

    public void setRid(Integer rid) {
        this.rid = rid;
    }
    public Integer getRid() {
        return rid;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Role{" +
                "rid=" + rid +
                ", title='" + title + '\'' +
                '}';
    }
}