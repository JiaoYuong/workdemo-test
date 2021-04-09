package testNg;

import org.testng.annotations.*;

public class TestNg_Demo2 {


    @BeforeClass
    public void setUp(){
        System.out.println("启动测试的前提条件准备，一般放在这个方法中");
    }
    @AfterClass
    public void tearDown(){
        System.out.println("测试运行结束后的步骤，一般恢复到测试开始之前的状态");
    }

    @DataProvider(name = "test")
    public Object[][]  test(){
        return new Object[][]{{"1","2"},{"3","4"}};
    }

    @Test(dataProvider = "test")
    public void test1(String a,String b){
        System.out.println("使用detaprovider进行参数传递");
        System.out.println("a = " + a + "b = "+ b);
    }
    @Parameters(value = {"param1", "param2"})
    @Test()
    public void test2(String c,String d){
        System.out.println("使用Parameters进行参数传递");
        System.out.println("c :"+ c + "d :"+ d);
    }
}
