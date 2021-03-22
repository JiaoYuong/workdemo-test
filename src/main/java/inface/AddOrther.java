package inface;

public class AddOrther implements NumberBaseTest {
    @Override
    public int NumberBaseTest(int num1, int num2) {
        if (num1 > num2){
            return num2 + num1;
        }else {
            return num1 + num2;
        }

    }
}
