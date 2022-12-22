import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * 常用字符串处理方法练习
 */
public class StringTest {
    /**
     * 判断字符串是否相等
     */
    public static void main(String[] args) {
        String a = "qwwqeqweqeqeqwadfsdfsdgdhfghdyjyuiyuo";
        String b = "fgjhhjjlkiopyuwerqszxvamnbthrserghmgmt";
        String c = "Abcc";
        String d = "abcc";
        String e = "浙江省-杭州市-滨江区-阿里中心3号楼4楼";
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.contains("d"));
        System.out.println(a.indexOf("d"));
        System.out.println(a.lastIndexOf("d"));
        System.out.println(a.isEmpty());
        System.out.println(a.substring(5,9));
        System.out.println(a.substring(7));
        System.out.println(a.toUpperCase());
        System.out.println(c.toLowerCase());
        System.out.println(a.length());
        String[] strings=e.split("-");
        for (String string: strings) {
            System.out.println(string);
        }
        System.out.println(a.charAt(11));
    }
}
