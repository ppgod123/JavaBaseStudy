package com.aj.Day09;

import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) {
        JdbcDemo jdbcDemo = new JdbcDemo();
        jdbcDemo.query();
    }
    public void query(){
        String sql = "select id,user_name,account_id from zy_user where id=?";
        String url = "jdbc:mysql://59.202.54.12:18084/yqgk_cs?autoReconnect=true&autoReconnectForPools=true&useUnicode=true&characterEncoding=utf8";
        String username = "root@szzj_yqfktest_221018#zwy_hz_220331:100001";
        String password = "68I,SStRyXR7KfcUGUq;5";
        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1,10);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
               String id =  resultSet.getObject("id").toString();
               String name =  resultSet.getObject("user_name").toString();
               String score =  resultSet.getObject("account_id").toString();
                System.out.println(id);
                System.out.println(name);
                System.out.println(score);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
