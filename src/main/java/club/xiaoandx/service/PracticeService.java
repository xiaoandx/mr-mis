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

import club.xiaoandx.dao.PracticeDao;
import club.xiaoandx.entity.InternShip;
import club.xiaoandx.entity.vo.SearchVo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p> 实习信息业务操作 </p>
 * @version V1.0.0
 * @ClassName:PracticeService
 * @author: WEI.ZHOU
 * @date: 2021/6/12 10:28
 */
public class PracticeService {

    public static Map<String, Object> findAllPracticeToPage(int page, int limit) {
        Map<String,Object> data = new HashMap<>();
        data.put("code", 0);
        data.put("msg", "");
        int practiceCount = PracticeDao.getPracticeCount(0);
        int stat = (page - 1)*5;
        List<InternShip> internShips = PracticeDao.findAllPracticeToPage(stat,limit);
        data.put("count",practiceCount);
        data.put("data",internShips);
        return data;
    }


    public static InternShip findPracticeById(String sid) {
        InternShip internShip = PracticeDao.findPracticeById(Integer.valueOf(sid));
        return internShip;
    }

    public static int updateInternShipById(InternShip internShip) {
        if(null == internShip || 0 == internShip.getSid()){
            return 0;
        }
        return PracticeDao.updateInternShipById(internShip);
    }

    public static int deleteInternShipById(Integer sid) {
        if(sid == 0 || null == sid){
            return 0;
        }
        return PracticeDao.deleteInternShipById(sid);
    }

    public static int insertPractice(InternShip internShip) {
        InternShip hasInternShip = PracticeDao.findPracticeById(internShip.getSid());
        if (null == internShip){
            return 0;
        }
        if(null == hasInternShip.getSid()){
            return PracticeDao.insertPractice(internShip);
        }else{
            return  0;
        }
    }

    public static Map<String, Object> findSearchPractice(int page, int limit,
                                                            SearchVo searchVo) {
        Map<String,Object> data = new HashMap<>();
        data.put("code", 0);
        int stat = (page - 1)*5;
        int studentCount = PracticeDao.getPracticeCountBySearch(searchVo);
        List<InternShip> internShips = PracticeDao.findSearchPractice(stat,limit,searchVo);
        data.put("count",studentCount);
        data.put("data",internShips);
        if(internShips.size()==0){
            data.put("msg", "search error");
        }
        data.put("msg", "search success");
        return data;
    }
}
