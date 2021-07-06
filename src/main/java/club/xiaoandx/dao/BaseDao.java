package club.xiaoandx.dao;

import club.xiaoandx.util.JDBCUtil;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * <p> 数据库操作JDBC方法封装 </p>
 * @ClassName: BaseDao
 * @date: 2021/4/23 19:23
 * @author: WEI.ZHOU
 * @version: v1.0.0
 **/
public class BaseDao {

    /**
     * <p> 数据操作-增删改 </p>
     * @title: updata
     * @date: 2021/4/23 19:24
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param sql   执行SQL
     * @param pam   可变参数
     * @return: int 操作结果(0 失败，非0成功)
     **/
    public static int updata(String sql, Object... pam) {
        int operationResult = 0;
        try {
            Connection conn = JDBCUtil.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            for (int i = 0; i < pam.length; i++) {
                Object p = pam[i];
                preparedStatement.setObject(1 + i, p);
            }
            operationResult = preparedStatement.executeUpdate();
            JDBCUtil.close(null,preparedStatement, conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return operationResult;
    }

    /**
     * <p> 获取数据库完整查询对象数据 </p>
     * @title: select
     * @date: 2021/4/23 19:26
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param cls   保存数据对象实体的Java反射对象
     * @param sql   查询SQL
     * @param pam   可变参数
     * @return: T   T
     **/
    public static <T extends List<?>> T select(Class<?> cls, String sql, Object... pam) {
        List<Object> data = new ArrayList<Object>();
        try {
            Connection conn = JDBCUtil.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            for (int i = 0; i < pam.length; i++) {
                preparedStatement.setObject(1 + i, pam[i]);
            }
            ResultSet query = preparedStatement.executeQuery();
            while (query.next()) {
                Object o = cls.newInstance();
                Field[] declaredFields = cls.getDeclaredFields();
                for (Field f : declaredFields) {
                    String name = f.getName();
                    f.setAccessible(true);
                    Object object = query.getObject(name);
                    f.set(o, object);
                }
                data.add(o);
            }
            JDBCUtil.close(null,preparedStatement, conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) data;
    }

    /**
     * <p> 使用聚合函数查询 </p>
     * @title: selectToInt
     * @date: 2021/4/23 19:29
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param sql   查收SQL
     * @param pam   可变参数
     * @return: int 数量
     **/
    public static int selectToInt(String sql, Object... pam) {
        int res = 0;
        try {
            Connection conn = JDBCUtil.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            for (int i = 0; i < pam.length; i++) {
                preparedStatement.setObject(1 + i, pam[i]);
            }
            ResultSet query = preparedStatement.executeQuery();

            while (query.next()) {
                res = query.getInt(1);
            }
            JDBCUtil.close(query,preparedStatement, conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}
