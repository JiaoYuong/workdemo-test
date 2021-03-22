package inface;

public class RunCumperTest {


    public static void NumberBaseTest(NumberBaseTest numberBaseTest, int num1, int num2) {
        int result = numberBaseTest.NumberBaseTest(num1,num2);
        System.out.println(result);
    }

    public static void main(String[] args) {
      RunCumperTest.NumberBaseTest(new AddOrther(),20,1);
    }
}
