import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ReflactDemo {
    public static void main(String[] args) throws DocumentException {
        String path = "D:\\JavaBaseStudy\\pom.xml";
        List<Dependency> dependencies= parseXml(path);
        for (Dependency depen: dependencies) {
            System.out.println(depen);
        }
    }
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
}
