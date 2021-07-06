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
 * <p>  </p>
 *
 * @version V1.0.0
 * @ClassName:SearchVo
 * @author: WEI.ZHOU
 * @date: 2021/6/11 19:56
 */
public class SearchVo {
    /**
     * 姓名
     */
    private String username;

    /**
     * 学号
     */
    private Integer sid;

    private Integer page;

    private Integer limit;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "SearchVo{" +
                "username='" + username + '\'' +
                ", sid=" + sid +
                ", page=" + page +
                ", limit=" + limit +
                '}';
    }
}
