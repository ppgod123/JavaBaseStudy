package com.aj.Day07;

import com.aj.Day06.Pupil;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTester {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        /**
          获取类字节码方式一
         *
         */
       Class<Pupil> clazz = Pupil.class;
        /**
         * 获取类字节码方式二
         */
       Class<Dependency> clazz1 = (Class<Dependency>) Class.forName("com.aj.Day07.Dependency");
        /***
         * 创建类对象
         */
        Pupil pupil= clazz.newInstance();
        /**
         * 获取对象所有方法
         */
        Method[] methods = clazz.getMethods();
        for (Method method:methods) {
            System.out.println(method.getName());
        }
        /**
         * 获取对象指定方法
         */
         Method method = clazz.getMethod("setName", String.class);
         method.invoke(pupil,"张三");
         Method method1 = clazz.getMethod("getName");
          Object val= method1.invoke(pupil);
        System.out.println("name:"+val.toString());

    }
}
