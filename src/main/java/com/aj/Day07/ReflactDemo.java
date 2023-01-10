package com.aj.Day07;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflactDemo {
    public static void main(String[] args) throws DocumentException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        String path = "D:\\JavaBaseStudy\\pom.xml";
        List<Dependency> dependencies= parseXml1(path);
        for (Dependency depen: dependencies) {
            System.out.println(depen);
        }
        //System.out.println(toUpperCaseFirstOne("assdsdsds"));
    }

    /***
     * 通过对象接收方式解析xml文件
     * @param path
     * @return
     * @throws DocumentException
     */
    public static List<Dependency> parseXml(String path) throws DocumentException {
        SAXReader saxReader = new SAXReader();
        File file = new File(path);
        Document document = saxReader.read(file);
        Element root = document.getRootElement();
        Element root1 = root.element("dependencies");
        List<Element> elements = root1.elements();
        List<Dependency> dependencies = new ArrayList<Dependency>();
        for (Element ele: elements) {
           String groupId = ele.elementText("groupId");
           String artifactId = ele.elementText("artifactId");
           String version = ele.elementText("version");
           Dependency dependency = new Dependency(groupId,artifactId,version);
            System.out.println(dependency);
           dependencies.add(dependency);
        }
        System.out.println("================================================================");
        return dependencies;
    }
    /***
     * 通过反射方式解析xml文件
     */
    public static List<Dependency> parseXml1(String path) throws DocumentException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        SAXReader saxReader = new SAXReader();
        File file = new File(path);
        Document document = saxReader.read(file);
        Element root = document.getRootElement();
        Element root1 = root.element("dependencies");
        List<Element> elements = root1.elements();
        List<Dependency> dependencies = new ArrayList<Dependency>();
        Class<Dependency>dependency = Dependency.class;
        for (Element ele: elements) {
            Dependency dependency1 = dependency.newInstance();
            List<Element> elements01 = ele.elements();
            for (Element element: elements01) {
                     String elementName = element.getName();
                     String upperelementName = toUpperCaseFirstOne(elementName);
                     String methodName = "set"+ upperelementName;
                     Method method = dependency.getMethod(methodName,String.class);
                     method.invoke(dependency1,element.getText());
            }
            dependencies.add(dependency1);
        }
        System.out.println("================================================================");
        return dependencies;
    }
    public static String toUpperCaseFirstOne(String s){
        if (Character.isUpperCase(s.charAt(0))){
            return s;
        }else{
            return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
        }

    }
}
