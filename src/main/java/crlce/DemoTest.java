package crlce;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 * @author JiaoYuong
 * @date 2020/11/6 14:39
 */
public class DemoTest {

    /**
     * @param
     * @return name
     * @author JiaoYuong
     * @date 2020/11/6 14:53
     */

    public void getInfo() {
//
        if (Double.NaN == Double.NaN) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public void getType() {
        char A = (char) -1;
        System.out.println(A);
    }

    public void Double() {
        double a = 11.0;
        int b = 0;
        System.out.println(a % b);
    }

    /**
     * @param
     * @return
     * @author JiaoYuong
     * @date 2020/11/13 11:06
     */
    public void Caculage() {
        int[] arges = {2, 5, 9, 1, 3, 8, 7};
        for (int i = 0; i < arges.length - 1; i++) {
            for (int j = i + 1; j < arges.length; j++) {
                if (arges[j] < arges[i]) {
                    int num = arges[i];
                    arges[i] = arges[j];
                    arges[j] = num;
                }
            }
            System.out.println(arges[i]);
        }
    }


    public enum Size {
        SMALL("小", 1), MEDIUM("中", 2), LARGE("大", 3), EXTRA_LARCE("超大", 4);
        private String name;
        private int index;

        //构造方法
        private Size(String name, int index) {
            this.name = name;
            this.index = index;
        }

        public static String getName(int index) {
            for (Size s : Size.values()) {
            }
            return null;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIndex() {
            return name;
        }

        public void setIndex(int index) {
            this.name = name;
        }
    }

    /**
     * @param Test方法
     * @return 提取字符串a从第几个字符并打印
     * @author JiaoYuong
     * @date 2020/11/16 17:50
     */
    public void Test() {
        String a = "JiaoYuong";
        String c = "jiaoYuong";
        String b = a.substring(0, 6);
//            int l = a.length();
//            System.out.println(l);
        if (c.compareTo(a) == 0) {
            System.out.println("t");
        } else {
            System.out.println("f");
        }
        /**
         * @author  JiaoYuong
         * @date  2020/11/18 13:04
         * @param []
         * @return 返回此 String 中从给定的 index 处偏移 codePointOffset 个代码点的索引
         */
        
        int index = c.offsetByCodePoints(4, 1);
        int cp = c.codePointAt(index);
        System.out.println(cp);

    }

    /**
     * @author JiaoYuong
     * @param Join；相当于分隔符操作；
     * @return S / M / L / XL
     * @date 2020/11/17 16:46
     */

    public void Join() {
        String all = String.join(" / ", "S", "M", "L", "XL");
        String[] all1 = new String[]{"S", "L", "M", "XL"};
        String.join("/", all1);
        System.out.println(all);
        System.out.println(String.join(" / ", all1));
    }

    public void String() {
        StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
        sBuffer.append(String.valueOf("aadasfasfa".toCharArray(),2,5));
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);
    }

    public void New(){
        String aaa =String.join("/","2","a","b");
        System.out.println(aaa);
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------");
        long name = scanner.nextLong(2);
//        String name1 = name.substring(1,3);
        System.out.println(name);

        System.out.println("java版本号：" + System.getProperty("java.version"));
    }
    public void Read (){
        String name = "Mar";
        int age = 10;
        String message = String.format("Hello, %s. Next year, you'll be %d",name,age);
        System.out.println(message);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(date);
        System.out.println(simpleDateFormat.format(date));

    }
    /**
     * @author  JiaoYuong
     * @date  2020/11/19 16:33
     * @param
     * @return 读取本地文件并返回
     */

    public void Scan() throws IOException {
        Scanner scanner = new Scanner(Paths.get("E:\\fileidea.txt"),"UTF-8");
        String zf = scanner.next();
        System.out.println(zf);
        System.out.println(System.getProperty("java.version"));
    }
/**
 * @author  JiaoYuong
 * @date  2020/12/2 14:04
 * @param 
 * @return Biglnteger 类实现了任意精度的整数运算， BigDecimal 实现了任意精度的浮点数运算
 */

    public void BigData(){
        Scanner in = new Scanner(System.in);
        System. out.print("How many numbers do you need to draw? ");
        int k = in.nextInt();
       System.out.print("What is the highest number you can draw? ");
        int n = in.nextInt();
        BigInteger lotteryOdds = BigInteger.valueOf(1);

        for (int i = 1; i <= k; i++)
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(
                    BigInteger.valueOf(i));

       System.out.println("Your odds are 1in " + lotteryOdds + ".Good luck!");
    }
    /**
     * @author  JiaoYuong
     * @date  2020/12/7 14:47
     * @param
     * @return 复制数组
     */
    public void CopyArrey(){
        int [] s = {2,3,5,7,8,9,6};
        int [] a;
        a = Arrays.copyOf(s,2*s.length);
        System.out.println(Arrays.toString(a));
        System.out.println(s.length);
        System.out.println(a.length);
    }
    public void Message(){
        String [] args1 = {"-g"};
        if (args1.length == 0 || args1[0].equals("-h")) {
            System.out.print("Hello,");
        }else if (args1[0].equals("-g")) {
            System.out.print("Goodbye ,");
        }
                // print the other command-line arguments
        for (int i = 0; i < args1.length; i ++){
            System.out.print(" " + args1[i]);
            System.out.println("!");
            int r = (int) (Math.random() * 5);
            System.out.println(r);
        }

}
    public static void main(String[] args) throws IOException {
        DemoTest demoTest = new DemoTest();
        demoTest.Message();
    }
}
