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
 * @ClassName:LoginVo
 * @author: WEI.ZHOU
 * @date: 2021/6/9 16:37
 */
public class LoginVo {
    private String username;
    private String password;
    private String code;
    private Integer isLogindata;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getIsLogindata() {
        return isLogindata;
    }

    public void setIsLogindata(Integer isLogindata) {
        this.isLogindata = isLogindata;
    }

    @Override
    public String toString() {
        return "LoginVo{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", code='" + code + '\'' +
                ", isLogindata=" + isLogindata +
                '}';
    }
}
