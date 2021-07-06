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

import club.xiaoandx.dao.HomeDao;
import club.xiaoandx.entity.RoleMenu;
import club.xiaoandx.entity.vo.StudentCountVo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p> 首页业务代码 </p>
 * @version V1.0.0
 * @ClassName:HomeService
 * @author: WEI.ZHOU
 * @date: 2021/6/9 18:25
 */
public class HomeService {

    /**
     * <p> 系统菜单 </p>
     * @title: getMenuByRid
     * @date: 2021/6/9 19:57
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param rid
     * @return: java.util.Map<java.lang.String,java.lang.Object>
     **/
    public static Map<String,Object> getMenuByRid(String rid) {
        List<RoleMenu> menus = HomeDao.getMenuByRid(Integer.valueOf(rid));
        Map<String,Object> root = defaultMenu();
        List<Map> roleMenus = new ArrayList<>();
        for (RoleMenu i : menus){
            Map<String, Object> menu_zero = new HashMap<>();
            if(i.getLayer() == 0){
                menu_zero.put("title", i.getTitle());
                menu_zero.put("icon", i.getIcon());
                menu_zero.put("href", i.getHref());
                menu_zero.put("target", i.getTarget());
                List<Map> clid = new ArrayList<>();
                for (RoleMenu k : menus){
                    Map<String, Object> menu_one = new HashMap<>();
                    if(0< k.getLayer() && k.getLayer() <= 10){
                        menu_one.put("title", k.getTitle());
                        menu_one.put("icon", k.getIcon());
                        menu_one.put("href", k.getHref());
                        menu_one.put("target", k.getTarget());
                        List<Map> clid_Two = new ArrayList<>();
                        for(RoleMenu m : menus){
                            Map<String, Object> menu_two = new HashMap<>();
                            if((k.getLayer())*10 < m.getLayer() &&m.getLayer() < (k.getLayer() + 1)*10){
                                menu_two.put("title", m.getTitle());
                                menu_two.put("icon", m.getIcon());
                                menu_two.put("href", m.getHref());
                                menu_two.put("target", m.getTarget());
                                clid_Two.add(menu_two);
                            }
                            menu_one.put("child",clid_Two);
                        }
                        clid.add(menu_one);
                    }
                    menu_zero.put("child", clid);
                }
                roleMenus.add(menu_zero);
            }
        }
        root.put("menuInfo", roleMenus);
        return root;
    }

    protected static Map<String, Object> defaultMenu(){
        Map<String, Object> root = new HashMap<>();
        Map<String, Object> indexMenu = new HashMap<>();
        indexMenu.put("title", "首页");
        indexMenu.put("href","page/main.jsp");
        Map<String, Object> logoMenu = new HashMap<>();
        logoMenu.put("title", "实习就业");
        logoMenu.put("image","images/logo.png");
        logoMenu.put("href", "");
        root.put("homeInfo", indexMenu);
        root.put("logoInfo", logoMenu);
        return root;
    }

    public static StudentCountVo getCountByStatus() {
        StudentCountVo studentCountVo = new StudentCountVo();
        for(int i=0;i<=4;i++){
            switch (i){
                case 0:
                    studentCountVo.setAllCount(HomeDao.getCountByStatusBy(i));
                    break;
                case 1:
                    studentCountVo.setEntrance(HomeDao.getCountByStatusBy(i));
                    break;
                case 2:
                    studentCountVo.setKaoGong(HomeDao.getCountByStatusBy(i));
                    break;
                case 3:
                    studentCountVo.setInternship(HomeDao.getCountByStatusBy(i));
                    break;
                case 4:
                    studentCountVo.setOthers(HomeDao.getCountByStatusBy(i));
                    break;
            }
        }
        return studentCountVo;
    }
}
