package testNg;

import org.testng.annotations.Test;

public class SimpleTest {

    private  String param;

    public SimpleTest(String param) {
        this.param = param;
    }


    @Test
    public void test(){
        System.out.println("SimpleTest.param = " + param);
    }
}
