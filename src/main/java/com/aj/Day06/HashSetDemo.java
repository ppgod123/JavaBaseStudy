package com.aj.Day06;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Pupil> hashSet= new HashSet<Pupil>();
        Pupil pupil = new Pupil();
        pupil.setName("Faker");
        pupil.setAge(18);
        pupil.setGender("男");
        Pupil pupil1 = new Pupil();
        pupil1.setName("theshy");
        pupil1.setAge(19);
        pupil1.setGender("男");
        Pupil pupil2 = new Pupil();
        pupil2.setName("Miss");
        pupil2.setAge(28);
        pupil2.setGender("女");
        Pupil pupil3 = new Pupil();
        pupil3.setName("scout");
        pupil3.setAge(23);
        pupil3.setGender("男");
        //Pupil pupil4 = new Pupil();
        pupil3.setName("scout");
        pupil3.setAge(23);
        pupil3.setGender("女");
        hashSet.add(pupil);
        hashSet.add(pupil1);
        hashSet.add(pupil2);
        hashSet.add(pupil3);
        //hashSet.add(pupil4);

        /**
         * 增强for循环遍历
         */
        for (Pupil pup: hashSet) {
            System.out.print(pup.getName()+"\t");
            System.out.print(pup.getAge()+"\t");
            System.out.println(pup.getGender()+"\t");
        }
        hashSet.contains(pupil);
        hashSet.remove(pupil);
        hashSet.size();
        hashSet.isEmpty();
        hashSet.contains(pupil);

        System.out.println("===================================");
        /**
         * 转数组增强for循环遍历
         */
        Object[] objects = hashSet.toArray();//转数组
        for (Object obj: objects) {
           // System.out.println(obj);
            if (obj instanceof Pupil){
                Pupil pup =(Pupil) obj;
                System.out.print(pup.getName()+"\t");
                System.out.print(pup.getAge()+"\t");
                System.out.println(pup.getGender()+"\t");

            }
        }
        System.out.println("=========================================");
        hashSet.clear();
        /**
         *转迭代增强for循环遍历
         */
         Iterator<Pupil>iterator = hashSet.iterator();
         while (iterator.hasNext()){
             System.out.print(iterator.next().getName()+"\t");
         }
        System.out.println();
         Iterator<Pupil>iterator1 = hashSet.iterator();
         while (iterator1.hasNext()){
             System.out.print(iterator1.next().getAge()+"\t");
         }
        System.out.println();
         Iterator<Pupil>iterator2 = hashSet.iterator();
         while (iterator2.hasNext()){
             System.out.print(iterator2.next().getGender()+"\t");
         }
        System.out.println();

    }
}
