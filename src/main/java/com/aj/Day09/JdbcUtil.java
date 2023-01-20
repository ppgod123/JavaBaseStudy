package com.aj.Day09;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class JdbcUtil {
    /**
     * 静态代码块
     */
    public static Properties properties = new Properties();
    static {
        InputStream inputStream = null;
        System.out.println("开始解析配置文件！！！！！");
        try {
            inputStream = new FileInputStream(new File("src/main/resources/jdbc.properties"));
            properties.load(inputStream);
            //System.out.println(properties.getProperty("JDBC.driver"));

            //System.out.println(properties.getProperty("JDBC.autoCommit"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param sql
     * @param values  可变参数
     */
    public Map<String,Object> query(String sql, Object ...values) {
        Map<String,Object> columnLabelAndvalues = new HashMap<String,Object>();
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            /**
             * 配置查询参数
             */
            for (int i = 0; i < values.length; i++) {
                preparedStatement.setObject(i+1,values[i]);
            }
            ResultSet resultSet = preparedStatement.executeQuery();
            /**
             * 获取查询结果字段
             */
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            /**
             *统计查询结果参数数量
             */
            int paracount = resultSetMetaData.getColumnCount();
            while (resultSet.next()){
//               String id =  resultSet.getObject("id").toString();
//               String name =  resultSet.getObject("user_name").toString();
//               String score =  resultSet.getObject("account_id").toString();
                for (int i = 0; i < paracount; i++) {
                    String columnLabel= resultSetMetaData.getColumnLabel(i+1);
                    String columnvalue= resultSet.getObject(columnLabel).toString();
                    //System.out.println(columnvalue);
                    columnLabelAndvalues.put(columnLabel,columnvalue);
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return columnLabelAndvalues;
    }

    /**
     * 获取数据库链接信息
     * @return
     * @throws SQLException
     */
    private Connection getConnection() throws SQLException {
        String url = null;
        String username = null;
        String password = null;
        url = properties.getProperty("JDBC.url");
        username = properties.getProperty("JDBC.username");
        password = properties.getProperty("JDBC.password");
        Connection connection = DriverManager.getConnection(url,username,password);
        return connection;
    }
}
