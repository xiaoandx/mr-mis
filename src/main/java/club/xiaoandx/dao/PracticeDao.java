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

import club.xiaoandx.entity.InternShip;
import club.xiaoandx.entity.vo.SearchVo;

import java.util.ArrayList;
import java.util.List;

/**
 * <p> 实习数据库操作 </p>
 * @version V1.0.0
 * @ClassName:PracticeDao
 * @author: WEI.ZHOU
 * @date: 2021/6/12 10:30
 */
public class PracticeDao extends BaseDao {

    public static int getPracticeCount(int i) {
        String sql = "SELECT COUNT(*) FROM internship";
        int count = selectToInt(sql);
        return count;
    }

    public static List<InternShip> findAllPracticeToPage(int stat, int limitNumber) {
        String sql = "SELECT sid,sname,`status`,isleaving,companyName,companyPlace," +
                "contactInformation,salary FROM internship LIMIT ?,?";
        List<InternShip> internShips= select(InternShip.class, sql, stat,limitNumber);
        if(internShips.size() ==0 || internShips.isEmpty()){
            internShips = new ArrayList<>();
        }
        return internShips;
    }

    public static InternShip findPracticeById(Integer sid) {
        String sql = "SELECT sid,sname,`status`,isleaving,companyName,companyPlace," +
                "contactInformation,salary FROM internship WHERE sid = ?";
        List<InternShip> internShips = select(InternShip.class, sql, sid);
        if(internShips.size() == 0 || internShips.isEmpty()){
            internShips = new ArrayList<>();
            return  new InternShip();
        }
        return internShips.get(0);
    }


    public static int updateInternShipById(InternShip internShip) {
        String sql = "UPDATE internship SET sname=?,`status`=?,isleaving=?,companyName=?," +
                "companyPlace=?,contactInformation=?,salary=? WHERE sid = ?";
        int status = updata(sql, internShip.getSname(),internShip.getStatus(),
                internShip.getIsleaving(),internShip.getCompanyname(),
                internShip.getCompanyplace(),internShip.getContactinformation(),
                internShip.getSalary(),internShip.getSid());
        return status;
    }

    public static int deleteInternShipById(Integer sid) {
        String sql = "DELETE FROM internship WHERE sid = ?";
        int status = updata(sql, sid);
        return status;
    }

    public static int insertPractice(InternShip internShip) {
        String sql = "INSERT INTO internship (sid,sname,`status`,isleaving,companyName," +
                "companyPlace,contactInformation,salary) VALUES (?,?,?,?,?,?,?,?);";
        int status = updata(sql,internShip.getSid(),internShip.getSname(),internShip.getStatus(),
                internShip.getIsleaving(),internShip.getCompanyname(),
                internShip.getCompanyplace(),internShip.getContactinformation(),internShip.getSalary());
        return status;
    }

    public static List<InternShip> findSearchPractice(int stat, int limitNumber, SearchVo searchVo) {
        String sql = "SELECT sid,sname,`status`,isleaving,companyName,companyPlace,contactInformation,salary " +
                "FROM internship WHERE  1=1 ";
        List<InternShip>  practices = null;
        if(searchVo.getUsername() != "" && !searchVo.getUsername().equals("null")){
            sql += "AND sname = ? ";
            if(searchVo.getSid() != 0 && searchVo.getSid() != 101){
                sql += "AND sid = ? LIMIT ?,?";
                practices = select(InternShip.class, sql,searchVo.getUsername(),
                        searchVo.getSid(),stat,
                        limitNumber);
            }else {
                sql += " LIMIT ?,?";
                practices = select(InternShip.class, sql,searchVo.getUsername(),stat,
                        limitNumber);
            }
        }else{
            if(searchVo.getSid() != 0 && searchVo.getSid() != 101){
                sql += "AND sid = ?  LIMIT ?,?";
                practices = select(InternShip.class, sql,searchVo.getSid() ,stat,
                        limitNumber);
            }
        }
        if(practices.size() == 0 || practices.isEmpty()){
            practices = new ArrayList<>();
        }
        return practices;
    }

    public static int getPracticeCountBySearch(SearchVo searchVo) {
        String sql = "SELECT COUNT(*) " +
                "FROM internship WHERE 1=1 ";
        int  practiceCount = 0;
        if(searchVo.getUsername() != "" && !searchVo.getUsername().equals("null")){
            sql += "AND sname = ? ";
            if(searchVo.getSid() != 0 && searchVo.getSid() != 101){
                sql += "AND sid = ? ";
                return selectToInt( sql,searchVo.getUsername(),
                        searchVo.getSid());
            }else {
                return selectToInt(sql,searchVo.getUsername());
            }
        }else{
            if(searchVo.getSid() != 0 && searchVo.getSid() != 101){
                sql += "AND sid = ? ";
                return selectToInt(sql,searchVo.getSid() );
            }
        }
        return practiceCount;
    }
}
