package com.codeing.db;

//  导入sql包
import java.sql.*;

public class DBClass {
    //	桥接
    private static String DRIVER = "com.mysql.jdbc.Driver";
    //	数据库地址
    private static String DBService = "qdm217834368.my3w.com";
    //	数据库名称
    private static String DBNAME = "qdm217834368_db";
    //	请求地址
    private static String URL = "jdbc:mysql://"+ DBService +":3306/"+ DBNAME +"";
    //	数据库帐号和密码
    private static String USERNAME = "qdm217834368";
    private static String PASSWORD = "xiuxian123";
    //	新建连接
    private static Connection CONN = null;

    /**
     *
     * (打开数据库)
     * 方法名：getConnection
     * 创建人：cainiao
     * 时间：2017年10月31日-下午10:07:57
     * 手机:1564545646464 void
     * @return
     * @exception
     * @since  1.0.0
     */
    public Connection getConnection() {
        try {
            try {
                Class.forName(DRIVER);
            } catch (Exception e) {
                e.printStackTrace();
            }
            CONN = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return CONN;
    }

    /**
     *
     * (关闭数据)
     * 方法名：getClose
     * 创建人：cainiao
     * 时间：2017年10月31日-下午10:06:48
     * 手机:1564545646464 void
     * @exception
     * @since  1.0.0
     */
    public void getCloseDB() {
        try {
            this.CONN.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DBClass db = new DBClass();
        db.getConnection();
    }

}