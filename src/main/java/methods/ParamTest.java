package methods;

public class ParamTest {
    public static void main(String[] args) {
//        System.out.println("测试基本数据类型是否被修改");
//
//        double precent = 10;
//        System.out.println("原始：" + precent);
//        tripleValue(precent);
//        System.out.println("执行后：" + precent);
//

        /**+
         * 对象引用修改值
         */
//
//        System.out.println("测试开始");
//        Employee harry = new Employee("Harry", 50000);
//        System.out.println("Before: salary=" + harry.getSalary());
//        tripleSalary(harry);
//        System.out.println("After: salary=" + harry.getSalary());



        System.out.println("swap");
        Employee a = new Employee("Alice", 70000);
        Employee b = new Employee("Bob", 60000);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    /**
     *
     */
//    public static void tripleSalary(Employee x) // works
//    {
//        x.raiseSalary(200);
//        System.out.println("End of method: salary=" + x.getSalary());
//
//    }
    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x=" + x.getName());
        System.out.println("End of method: y=" + y.getName());
    }


/**
 * 使precent值扩大三倍
 */

//public static void tripleValue(double x){
//
//    x = x * 3;
//    System.out.println(x);
//}

}