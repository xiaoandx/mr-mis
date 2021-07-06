package club.xiaoandx.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.*;

/**
 * <p> JDBC连接数据库操作 </p>
 * @ClassName: JdbcUtil
 * @date: 2021/4/23 19:31
 * @author: WEI.ZHOU
 * @version: v1.0.0
 **/
public class JDBCUtil {

    private static DataSource dataSource = null;

    static {
        try {
            dataSource = new ComboPooledDataSource();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * <p> 获取数据库连接数据源对象 </p>
     * @title: getDataSource
     * @date: 2021/6/25 19:34
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @return: javax.sql.DataSource
     **/
    public static DataSource getDataSource() {
        return dataSource ;
    }

    /**
     * <p> 获取数据库连接对象 </p>
     * @title: getConnection
     * @date: 2021/6/25 19:34
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @return: java.sql.Connection
     **/
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    /**
     * <p> 关闭数据库连接 </p>
     * @title: close
     * @date: 2021/6/25 19:51
     * @author: WEI.ZHOU
     * @version: v1.0.0
     * @param resultSet
     * @param pst
     * @param connection
     * @return: void
     **/
    public static void close(ResultSet resultSet, PreparedStatement pst, Connection connection) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pst != null) {
            try {
                pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
