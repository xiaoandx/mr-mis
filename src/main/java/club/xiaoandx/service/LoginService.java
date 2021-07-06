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
package club.xiaoandx.service;

import club.xiaoandx.dao.LoginDao;
import club.xiaoandx.entity.User;
import club.xiaoandx.entity.vo.ResultVo;
import club.xiaoandx.entity.vo.UpdatePasswordVo;

/**
 * <p> 登录业务 </p>
 * @version V1.0.0
 * @ClassName:LoginService
 * @author: WEI.ZHOU
 * @date: 2021/6/9 16:04
 */
public class LoginService {

    public static User login(String username) {
        User loginUser = LoginDao.login(username);
        return loginUser;
    }

    public static ResultVo updatePassword(UpdatePasswordVo updatePasswordVo) {
        if(null != updatePasswordVo){
            int status = LoginDao.updatePassword(updatePasswordVo);
            if(status != 0){
                User loginUser = LoginDao.refreshLogin(updatePasswordVo);
                loginUser.setDpassword(""); loginUser.setUpassword("");
                return new ResultVo(0,"update success",loginUser);
            }
            return new ResultVo(-1,"update data error",null);
        }
        return new ResultVo(-1,"error data is null",null);
    }
}
