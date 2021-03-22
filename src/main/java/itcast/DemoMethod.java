package itcast;

public class DemoMethod {
    public static void main(String[] args) {
        sum(10,20);
        System.out.println(sum(2,3));
    }
    public static int sum (int a, int b){
        int result = a + b;
        return result;

    }
}
