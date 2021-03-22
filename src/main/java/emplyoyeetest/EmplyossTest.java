package emplyoyeetest;

/**
 * @author JiaoYuong
 * @date 2020/12/21 14:00
 */
public class EmplyossTest {
    public static void main(String[] args) {

        Emplyoss[] staff = new Emplyoss[3];

        staff[0] = new Emplyoss("aiCheck",100,1994,8,16);
        staff[1] = new Emplyoss("qi",200,1995,6,16);
        staff[2] = new Emplyoss("JiaoYuong",300,1994,10,14);

        for (Emplyoss e : staff){
            if (e.getSalary() > 110){
                e.raiseSalary(5);
            }
            if (e.equals(staff[0])){
                e.setName("122+ 4.3.2 多个源文件的使用");
            }
        }

        for (Emplyoss e : staff){
            System.out.println("name="+e.getName() +
                    ",salary="+e.getSalary() +
                    ",hisDay="+e.getHireDay());
        }
    }
}
