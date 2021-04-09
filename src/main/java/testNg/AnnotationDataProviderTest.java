package testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AnnotationDataProviderTest {

    @DataProvider(name="testMethodDataProvider")
    public Object[][] testMethodDataProvider() {

        return new Object[][]{{"value1-1", "value2-1"}, {"value1-2", "value2-2"}, {"value1-3", "value2-3"}};

    }

    @Test(dataProvider="testMethodDataProvider")
    public void test(String arg1, String arg2) {
        System.out.println("use @DataProvider to fill method argument : arg1 = " + arg1 + " , arg2 = " + arg2);
    }

}