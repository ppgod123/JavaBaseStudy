package com.aj.Day07;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        /**
         * 创建文件夹和文件
         */
        String pa ="C:\\Users\\Administrator\\Desktop\\7777\\韦小宝.txt";
        String path = "C:\\Users\\Administrator\\Desktop\\7777";
        File file1 = new File(path);
        File file2 = new File(pa);
        if(file1.exists()){
            file2.createNewFile();
            System.out.println(file2.isDirectory());
            System.out.println(file2.isFile());
        }else{
            file1.mkdirs();
            System.out.println(file1.isDirectory());
            System.out.println(file1.isFile());
            file2.createNewFile();
            System.out.println(file2.isDirectory());
            System.out.println(file2.isFile());
        };
        /**复制文件
         *
         */
        String path1 = "C:\\Users\\Administrator\\Desktop\\个人工作报告\\模板-2.pptx";
        String path2 = "C:\\Users\\Administrator\\Desktop\\模板-2-2.pptx";
        copyFile(path1,path2);
    }

    public  static void copyFile(String original,String destination) throws IOException {
        InputStream inputStream = new FileInputStream(new File(original));
        OutputStream outputStream = new FileOutputStream(new File(destination));
        byte [] bytes = new byte[2048];
        int size = 0;
        while ((size = inputStream.read(bytes))!=-1){
            outputStream.write(bytes,0,size);
            outputStream.flush();
        }
        if (inputStream!=null){
            inputStream.close();
        }
        if (outputStream!=null){
            outputStream.close();
        }
        System.out.println("文件复制成功！！！！");

    }



}
