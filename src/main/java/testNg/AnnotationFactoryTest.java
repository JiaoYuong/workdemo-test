package testNg;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class AnnotationFactoryTest {

    private  String param;

    public AnnotationFactoryTest(String param) {
        this.param = param;
    }

    @Test
    public void test(){
        System.out.println("SimpleTest.param = " + param);
    }

    @Factory
    public Object[] getSimpleTest() {
        return new Object[]{ new SimpleTest("one"), new SimpleTest("two")};
    }

}
