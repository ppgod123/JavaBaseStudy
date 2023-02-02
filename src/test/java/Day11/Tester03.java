package Day11;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tester03 {
    /**
     * 数据提供者传参（使用默认方法名调用）
     * @param name
     * @param age
     * @param sex
     */
    @Test(dataProvider = "test14")
    public void test13(String name,int age,String sex){
        System.out.println("name:"+name+"\tage:"+age+"\tsex:"+sex);
    }

    /**
     * 数据提供者传参（使用别名调用）
     * @param name
     * @param age
     * @param sex
     * @param weight
     */
    @Test(dataProvider = "aa")
    public void test13(String name,int age,String sex,int weight){
        System.out.println("name:"+name+"\tage:"+age+"\tsex:"+sex+"\tweight:"+weight);
    }

    /**
     * 数据提供者
     * @return
     */
    @DataProvider
    public Object[][] test14(){
        Object[][] datas ={
                           {"张三",18,"男"},
                           {"李四",29,"女"}
                          };
        return datas;
    }

    /**
     * 数据提供者-起别名
     * @return
     */
    @DataProvider(name = "aa")
    public Object[][] test15(){
        Object[][] datas= {
                            {"张三",18,"男",188},
                            {"李四",29,"女",199}
                           };
        return  datas;
    }
}
