package Day11;

import com.beust.jcommander.Parameter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tester01 {
    @Test
    public void test05(){
        System.out.println("Tester01.test05()");
    }
    @Test(groups = {"g2"})
    public void test06(){
        System.out.println("Tester01.test06()");
    }
    @Test
    @Parameters(value = {"browserType"})
    public void test07(String browserType){
        System.out.println("browserType:"+browserType);
        System.out.println("Tester01.test07()");
    }
    @Test(enabled = false)
    public void test08(){
        System.out.println("Tester01.test08()");
    }
}
