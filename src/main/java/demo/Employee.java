package demo;

import java.util.Random;

public class Employee {

    private static int nextId;

    private int id;

    private String name = "";

    private double slary;

   /**
    *@Author:JiaoYuong
    *Description:静态初始化块
    *@Date: 2021/1/21  11:22
   */
   static {
       Random random = new Random();

       nextId = random.nextInt(3);
   }

   /**
    *@Author:JiaoYuong
    *Description:对象初始化块
    *@Date: 2021/1/21  11:24
   */

   {
       id = nextId;
       nextId++;

   }


   /**
    *@Author:JiaoYuong
    *Description:三个重载构造函数;1、带俩个参数的
    *@Date: 2021/1/21  11:25
   */

   public Employee(String Aname,double Asalary){

       name =Aname;
       slary = Asalary;

   }
   /**
    *@Author:JiaoYuong
    *Description:三个重载构造函数;1、带一个参数的
    *@Date: 2021/1/21  13:46
   */
   public Employee(double Bsalary){
        this("asdfg" + nextId,Bsalary);
   }

   /**
    *@Author:JiaoYuong
    *Description:默认构造参数
    *@Date: 2021/1/21  13:52
   */

   public Employee(){

    }

    public String getName() {
        return name;
    }

    public double getSlary() {
        return slary;
    }

    public int getId() {
        return id;
    }
}
