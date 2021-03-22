package demo;

public class DemoOpear {
    public static void main(String[] args) {
        String str ="java";
//        System.out.println(str + 20 + 30);
//        System.out.println(20 + 30 + str);
//


        //自增自减运算符
        /**
         * 1、单独使用 ：前++和后++无任何区别
         * 2、混合使用：A:若是前++；变量立马+1，然后拿着结果进行使用；
         * B:若是后++。首先使用变量本来的数值，然后再让+1
         * 只有变量才可以使用自增自减运算，常量布可以；
         */
//        int num1 = 3,num2 = 1;
//
//
//        System.out.println(num2++);
//        System.out.println(num2);
//        System.out.println(num1 +10 );
//        num1++;
//        ++num1;
//        System.out.println(num1 +10 );
//

        /**
         * 赋值运算符
         * 复合运算符：+=；-=；/=；%=
         */

        int a = 3;
        int b = 4;

        a +=5;//a= a+5
        System.out.println(a > 7);


        /**
         * 逻辑运算符
         * 与 $$   全都是TRUE，才是TRUE，否则：FALSE
         * 或 ||     至少一个是TRUE,就是TRUE,全都是FALSE，才是FALSE
         * 非 !   本来是TRUE,变成FALSE，本来是FALSE，变成TRUE
         */
    }
}
