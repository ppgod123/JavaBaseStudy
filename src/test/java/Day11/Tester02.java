package Day11;

import org.testng.annotations.Test;

public class Tester02 {
    @Test(groups = {"g3"})
    public void test09(){
        System.out.println("Tester01.test09()");
    }
    @Test(groups = {"g3"})
    public void test10(){
        System.out.println("Tester01.test10()");
    }
    @Test(groups = {"g3"})
    public void test11(){
        System.out.println("Tester01.test11()");
    }
    @Test
    public void test12(){
        System.out.println("Tester01.test12()");
    }
}
