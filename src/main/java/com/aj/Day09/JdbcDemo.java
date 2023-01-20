package com.aj.Day09;

import java.io.*;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JdbcDemo {
    public static void main(String[] args) {
        String sql1 = "select id,user_name,account_id,ding_employee_code,dhhm from zy_user where id=? or user_name =?";
        String sql2 = "select id,per_key,per_name from zy_system_permission where id=?";
        //JdbcDemo jdbcDemo = new JdbcDemo();
        JdbcUtil jdbcUtil= new JdbcUtil();
        Object [] values1 = {"10","冯爱军"};
        Object [] values2 = {"6"};
        System.out.println("第一条sql查询结果：");
        Map<String,Object> columnLabelAndvalues1= jdbcUtil.query(sql1,values1);
        Set<String> keys = columnLabelAndvalues1.keySet();
        for (String key: keys) {
            System.out.println("Key:"+key+"\t"+"Value:"+columnLabelAndvalues1.get(key));
        }
        System.out.println("第二条sql查询结果：");
        //jdbcDemo.query(sql1,values2);
        Map<String,Object> columnLabelAndvalues2= jdbcUtil.query(sql2,values2);
        Set<String> keys1 = columnLabelAndvalues2.keySet();
        for (String key: keys1) {
            System.out.println("Key:"+key+"\tValue:"+columnLabelAndvalues2.get(key));
        }
    }


}
