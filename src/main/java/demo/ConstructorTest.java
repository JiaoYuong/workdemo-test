package demo;

public class ConstructorTest {
    public static void main(String[] args) {
        Employee [] employee = new Employee[3];

        employee[0] = new Employee("JiaoYuong",100);
        employee[1] = new Employee(200);
        employee[2] = new Employee();


        for (Employee e : employee){
            System.out.println("name :" + e.getName() + "  salary :" + e.getSlary() + "  id : " + e.getId());
        }
    }
}
