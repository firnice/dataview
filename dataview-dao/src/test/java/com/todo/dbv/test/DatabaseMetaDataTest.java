package com.todo.dbv.test;

import com.dbv.common.ConnectionDB;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by firnice on 15/2/14.
 */
public class DatabaseMetaDataTest {
    public static void main(String[] args) {

//        String url ="jdbc:oracle:thin:@10.1.126.78:1521:wmdb";
//        String user = "ec";
//        String password = "Ec";

//        jdbc.driver=org.h2.Driver
//
//        jdbc.url=jdbc:h2:~/ideaProjects/h2db/test;AUTO_SERVER=TRUE
//        jdbc.username=sa
//        jdbc.password=

        try {
            ConnectionDB connectionDB = new ConnectionDB();

            DatabaseMetaData databaseMetaData = connectionDB.getConnection().getMetaData();

            /**
             * http://dlc-cdn.sun.com/jdk/jdk-api-localizations/jdk-api-zh-cn/publish/1.6.0/html/zh_CN/api/java/sql/DatabaseMetaData.html#getColumns%28java.lang.String,%20java.lang.String,%20java.lang.String,%20java.lang.String%29
             */
            ResultSet rs1 = databaseMetaData.getTables("TEST", "PUBLIC", "TEST", null);
            while (rs1.next()) {
                System.out.println();
                System.out.println("数据库名:" + rs1.getString(1));
                System.out.println("表名: " + rs1.getString(3));
                System.out.println("类型: " + rs1.getString(4));
                ResultSet rs2 = databaseMetaData.getColumns("TEST", "PUBLIC", "TEST", null);
                while (rs2.next()) {
                    System.out.println();
//                    System.out.println("表类别: " + rs2.getString(1));
//                    System.out.println("表名称: " + rs2.getString(3));
//                    System.out.println("列名称: " + rs2.getString(4));
//                    System.out.println("列的大小: " + rs2.getString(7));
//                    System.out.println("是否允许使用 NULL: " + rs2.getString(11));
//                    System.out.println("列的注释: " + rs2.getString(12));

                    for (int i = 1; i < 18; i++) {
                        System.out.println("管他是啥[ " + i + "]:" + rs2.getString(i));
                    }
                    System.out.println(rs2.getString("IS_NULLABLE"));
                }
            }
            rs1.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
