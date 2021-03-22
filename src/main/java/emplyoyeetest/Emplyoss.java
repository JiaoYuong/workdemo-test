package emplyoyeetest;

import java.time.LocalDate;

/**
 * @author JiaoYuong
 * @date 2020/12/21 13:52
 */
public class Emplyoss {

    private String name;

    private double salary;

    private LocalDate hireDay;

    public Emplyoss(String n,double s,int year,int month,int today){
                name = n;
                salary = s;
                hireDay = LocalDate.of(year,month,today);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
            this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
    double raise = salary * byPercent/20;
    salary = salary +raise;
    }
}
