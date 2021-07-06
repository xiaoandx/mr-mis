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

import club.xiaoandx.entity.User;
import club.xiaoandx.entity.vo.UpdatePasswordVo;

import java.util.List;

/**
 * <p> 登录dao </p>
 * @version V1.0.0
 * @ClassName:LoginDao
 * @author: WEI.ZHOU
 * @date: 2021/6/9 16:18
 */
public class LoginDao extends BaseDao{
    /**
     * <p> 用户登录 </p>
     * @title: login
     * @date: 2021/6/9 16:19
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param username
     * @return: User
     * @throws:
     **/
    public static User login(String username) {
        String sql = "SELECT * FROM `user` WHERE uName=? ";
        List<User> users = select(User.class, sql, username);
        if(users.isEmpty()){
            return new User();
        }
        return users.get(0);
    }

    public static int updatePassword(UpdatePasswordVo updatePasswordVo) {
        String sql = "UPDATE `user` SET upassword = ?, dpassword = ? WHERE uid = ?";
        int status = updata(sql,updatePasswordVo.getNewPassword(), "",updatePasswordVo.getUid());
        return status;
    }

    public static User refreshLogin(UpdatePasswordVo updatePasswordVo) {
        String sql = "SELECT * FROM `user` WHERE uid=? AND upassword=?";
        List<User> users = select(User.class, sql, updatePasswordVo.getUid(),updatePasswordVo.getNewPassword());
        if(users.isEmpty()){
            return new User();
        }
        return users.get(0);
    }
}
