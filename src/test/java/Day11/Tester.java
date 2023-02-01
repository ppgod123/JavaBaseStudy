package Day11;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @BeforeSuite @AfterSuite @BeforeTest @BeforeClass @BeforeMethod @AfterMethod
   @BeforeSuite：权限最大，最优先执行。
   @AfterSuite：与@BeforeSuite成对，最后执行。
   @BeforeTest：权限仅次于@BeforeSuite。
   @BeforeClass：权限仅次于@BeforeTest。
   @BeforeMethod：权限仅次于@BeforeClass，执行当前测试类之前，只在当前类生效。
   @AfterMethod：与@BeforeMethod成对，执行当前测试类之后，只在当前类生效
 */
public class Tester {
    @Test(dependsOnMethods = {"test02"})
    public void test01(){
       Calculator calculator = new Calculator();
       int actual = calculator.add(3,4);
       int expect = 7;
        Assert.assertEquals(actual,expect);
        System.out.println("Tester.test01()");
    }
    @Test
    public void test02(){
        Calculator calculator = new Calculator();
        int actual = calculator.add(3,4);
        int expect = 7;
        Assert.assertEquals(actual,expect);
        System.out.println("Tester.test02()");
    }
    @Test(enabled = true)
    public void test03(){
        Calculator calculator = new Calculator();
        int actual = calculator.add(3,4);
        int expect = 7;
        Assert.assertEquals(actual,expect);
        System.out.println("Tester.test03()");
    }
    @Test(enabled = false,timeOut = 1)
    public void test04(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Tester.test04()");
        }
    }
}
