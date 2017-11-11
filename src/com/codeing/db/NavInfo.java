package com.codeing.db;

import com.codeing.bean.Nav;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NavInfo {
    private static PreparedStatement PRER = null;
    private static ResultSet READ = null;

    //	创建实例
    private static DBClass db = new DBClass();

    public static List<Nav> getAllStudents() {
        //	list对象
        List<Nav> list = new ArrayList<Nav>();
        String sql = "select id,title,url from tb_nav";
        Connection conn = db.getConnection();
        Nav student = null;
        //	执行sql语句
        try {
            PRER = conn.prepareStatement(sql);
            READ = PRER.executeQuery();
            student = new Nav();
            while (READ.next()) {
                //	获取数据
                int id = READ.getInt("id");
                String name = READ.getString("title");
                String url = READ.getString("url");
                System.out.println(name+ "--" +url);
                student.setId(id);
                student.setName(name);
                student.setUrl(url);
                //	把数据加载到集合中
                list.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //	关闭数据库
            db.getCloseDB();
        }
        return list;
    }

    public static void main(String[] args) {
        getAllStudents();
    }
}
