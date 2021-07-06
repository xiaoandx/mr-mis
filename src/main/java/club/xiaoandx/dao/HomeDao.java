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

import club.xiaoandx.entity.RoleMenu;
import club.xiaoandx.entity.vo.SearchVo;

import java.util.List;

/**
 * <p> 首页dao </p>
 * @version V1.0.0
 * @ClassName:HomeDao
 * @author: WEI.ZHOU
 * @date: 2021/6/9 18:26
 */
public class HomeDao extends BaseDao{

    public static List<RoleMenu> getMenuByRid(Integer rid) {
        String sql = "SELECT mid,title,icon,href,target,rid,layer FROM role_menu WHERE rid = ? " +
                "ORDER BY layer ASC";
        List<RoleMenu> menus = select(RoleMenu.class,sql,rid);
        return menus;
    }

    public static Integer getCountByStatusBy(int i) {
        String sql = "SELECT COUNT(*) FROM studentinfo ";
        if(i == 0){
            return selectToInt(sql);

        }else{
            sql += "  WHERE `status` = ? ";
            return selectToInt(sql,String.valueOf(i));
        }
    }

    public static Integer getCountBySearch(SearchVo stu) {
        String sql = "SELECT COUNT(*) FROM studentinfo WHERE 1=1 ";

        if (stu.getUsername() != "" && !stu.getUsername().equals("null")) {
            sql += "AND username = ? ";
            if (stu.getSid() != 0) {
                sql += "AND sid = ? ";
                return selectToInt(sql, stu.getUsername(), stu.getSid());
            } else {
                return selectToInt(sql, stu.getUsername());
            }
        } else {
            if (stu.getSid() != 0) {
                sql += "AND sid = ? ";
                return selectToInt(sql, stu.getSid());
            }
        }
        return selectToInt(sql);
    }
}
