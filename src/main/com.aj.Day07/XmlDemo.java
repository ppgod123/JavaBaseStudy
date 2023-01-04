import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class XmlDemo {
    public static void main(String[] args) throws DocumentException {
        String path = "D:\\JavaBaseStudy\\pom.xml";
        parseXml(path);
    }
    public static void parseXml(String path) throws DocumentException {
        SAXReader saxReader = new SAXReader();
        File file = new File(path);
        Document document = saxReader.read(file);
        Element root = document.getRootElement();
        Element root1 = root.element("dependencies");
        List<Element>elements = root1.elements();
        int i = 0;
        for (Element ele: elements) {
            i++;
            System.out.println("这是pom第"+i+"个依赖包信息：");
            System.out.println(ele.element("groupId").getText());
            System.out.println(ele.element("artifactId").getText());
            System.out.println(ele.element("version").getText());
        }
    }
    /**
     * 第二种遍历方式
     */

}
