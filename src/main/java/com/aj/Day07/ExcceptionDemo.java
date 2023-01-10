package com.aj.Day07;

import java.io.*;
import java.util.Properties;

public class ExcceptionDemo {
    public static void main(String[] args) throws IOException {
        String filePath = "src/main/resource/log4j.properties";
        loadProperties(filePath);
    }
    public static void loadProperties(String filePath) {
        Properties properties = null;
        //准备文件
        File file = new File(filePath);
        //准备文件流
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            properties = new Properties();
            properties.load(inputStream);
        } catch (FileNotFoundException e) {
            //System.out.println(e.getMessage());
           // e.printStackTrace();
            System.out.println("路径文件不存在！！！！");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (inputStream !=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else{
                System.out.println("inputStream为空！！！");

            }
        }
        System.out.println(properties.getProperty("log4j.rootLogger"));

    }

}
