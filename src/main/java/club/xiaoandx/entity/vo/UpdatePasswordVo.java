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
 * <p> 修改密码数据实体 </p>
 * @version V1.0.0
 * @ClassName:UpdatePasswordVo
 * @author: WEI.ZHOU
 * @date: 2021/6/10 17:14
 */
public class UpdatePasswordVo {
    private String uid;
    private String oldPassword;
    private String newPassword;
    private String againPassword;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getAgainPassword() {
        return againPassword;
    }

    public void setAgainPassword(String againPassword) {
        this.againPassword = againPassword;
    }

    @Override
    public String toString() {
        return "UpdatePasswordVo{" +
                "uid='" + uid + '\'' +
                ", oldPassword='" + oldPassword + '\'' +
                ", newPassword='" + newPassword + '\'' +
                ", againPassword='" + againPassword + '\'' +
                '}';
    }
}
