package com.aj.Day07;

import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class YamlDemo {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "src/main/resources/Yaml.yml";
        parseYaml(path);
    }

    public static void  parseYaml(String path) throws FileNotFoundException {
        Map<String,Map<String, Object>>map = new HashMap<>();
        File file = new File(path);
        InputStream inputStream = new FileInputStream(file);
        Yaml yaml = new Yaml();
        map = (Map<String, Map<String, Object>>) yaml.load(inputStream);
        System.out.println("map的值为："+map);
        Set<String> keys = map.keySet();
        System.out.println(keys);
        for (String key:keys) {
            //Map<String, Object> stringObjectMap = map.get(key);
            System.out.println("Key:"+key+"\t"+"Value:"+map.get(key));
        }
    }

}
