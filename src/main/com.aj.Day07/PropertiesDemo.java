import java.io.*;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        String path = "src/main/resources/log4j.properties";
        parseProperties(path);
    }

    /**
     * 解析properties配置文件
     * @param path
     * @throws IOException
     */
    public static void parseProperties(String path) throws IOException {
        Properties properties = new Properties();
        File file = new File(path);
        InputStream inputStream = new FileInputStream(file);
        properties.load(inputStream);
        System.out.println(properties.getProperty("log4j.appender.D.File"));
    }
}
