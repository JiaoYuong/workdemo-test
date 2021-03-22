package demo;


public class Demo {
    public static void main(String[] arges) {
//        int a =0;
//        for (int i =1;i <= 100;i++){
//            if (i % 2 ==0){
//                a += i;
//            }
//        }
//        System.out.println(a);
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}