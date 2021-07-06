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
package club.xiaoandx.util;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

/**
 * <p> Jdbc连接对象 </p>
 * 这个类就是为我们得到Connection所服务的,这里我们使用的是单例模式<br>
 * 后面我们只需要调用静态方法getConnection()就能直接得到一个Connection了
 *
 * @version V1.0.0
 * @ClassName:UserDao
 * @author: WEI.ZHOU
 * @date: 2021/4/20 18:41
 */
public class DBHelper {
    public static final String driver = "com.mysql.jdbc.Driver";
    public static final String url = "jdbc:mysql://127.0.0.1:3306/dn_javaweb?characterEncoding=utf8&useSSL=true";
    public static final String username = "dn_xiaoandx";
    public static final String password = "dn_javaweb123";
    public static Connection con = null;

    static {
        try {
            //得到DriverManager，在下面建立连接时使用
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        if (con == null) {
            try {
                //建立连接,使用的参数就是上面我们所定义的字符串常量。
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return con;
    }

    /**
     * <p> 关闭数据库连接对象 </p>
     * @title: close
     * @date: 2021/4/20 22:52
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @return: void
     **/
    public static void close() throws SQLException {
        con.close();
    }
}