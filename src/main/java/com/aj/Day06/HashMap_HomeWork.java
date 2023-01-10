package com.aj.Day06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMap_HomeWork {
    private static String apple = "haha";
    public static void main(String[] args) {
        HashMap<String,ArrayList<Pupil>> hashMap= new HashMap<>();
        ArrayList<Pupil> list = new ArrayList<Pupil>();
        String class1= "七年级一班";
        String class2= "七年级二班";
        ArrayList<Pupil> list1 = new ArrayList<Pupil>();
        Pupil pupil= new Pupil("陈近南",48,"男");
//        pupil.setName("韦小宝");
//        pupil.setAge(99);
//        pupil.setGender("男");
        Pupil pupil1= new Pupil();
        pupil1.setName("韦小宝");
        pupil1.setAge(98);
        pupil1.setGender("男");
        Pupil pupil2= new Pupil();
        pupil2.setName("韦小宝");
        pupil2.setAge(97);
        pupil2.setGender("男");
        Pupil pupil3= new Pupil();
        pupil3.setName("韦小宝");
        pupil3.setAge(96);
        pupil3.setGender("男");
        list.add(pupil);
        list.add(pupil1);
        list1.add(pupil2);
        list1.add(pupil3);
        hashMap.put(class1,list);
        hashMap.put(class2,list1);
        Set<String> keys= hashMap.keySet();
        for (String key: keys) {
            ArrayList<Pupil> pupils = hashMap.get(key);
            System.out.println("班级:"+key);
            for (Pupil pup: pupils) {
                System.out.println(pup.toString());
            }
        }
        sayhello1();
    }
    public void sayhello(){
        System.out.println("非静态方法");
    }
    public static void sayhello1(){
        System.out.println("静态方法");
        System.out.println(apple);
    }

}
