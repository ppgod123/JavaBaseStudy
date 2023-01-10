package com.aj.Day06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Pupil> hashMap = new HashMap<String, Pupil>();
        Pupil pupil = new Pupil();
        pupil.setName("张三");
        pupil.setAge(18);
        pupil.setGender("男");
        Pupil pupil1 = new Pupil();
        pupil1.setName("张三");
        pupil1.setAge(18);
        pupil1.setGender("男");
        Pupil pupil2 = new Pupil();
        pupil2.setName("张三");
        pupil2.setAge(18);
        pupil2.setGender("男");
        hashMap.put("01",pupil);
        hashMap.put("02",pupil1);
        hashMap.put("03",pupil2);
        System.out.println(hashMap.size());
        System.out.println(hashMap.containsKey("03"));
        System.out.println(hashMap.containsValue(pupil2));
        hashMap.remove("03");
        System.out.println(hashMap.size());
        System.out.println(hashMap.containsKey("03"));
        System.out.println(hashMap.containsValue(pupil2));
        /**
         * 获取键值对遍历
         */
        Set<Map.Entry<String, Pupil>>entries = hashMap.entrySet();
        for (Map.Entry<String, Pupil> entry: entries) {
            System.out.println("Key:"+entry.getKey()+"\t"+"Value:"+entry.getValue()+"\t"+entry.getValue().getName()+"\t"+entry.getValue().getAge()+"\t"+entry.getValue().getGender());
        }
        /**
         * 获取键遍历
         */
        Set<String> keys = hashMap.keySet();
        for (String key:keys) {
            Pupil val = hashMap.get(key);
            System.out.println("Key:"+key+"\t"+"Value:"+val+"\t"+val.getName()+"\t"+val.getAge()+"\t"+val.getGender());
        }
    }
}
