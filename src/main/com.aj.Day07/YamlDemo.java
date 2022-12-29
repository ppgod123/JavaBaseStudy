import org.yaml.snakeyaml.Yaml;

public class YamlDemo {
    public static void main(String[] args) {
        String path = "src/main/resources/Yaml.yml";
        parseYaml(path);

    }

    public static void  parseYaml(String path){
        Yaml yaml = new Yaml();
        yaml.load(path);

    }
}
