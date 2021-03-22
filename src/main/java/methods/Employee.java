package methods;

import java.util.Random;

public class Employee {


    private static int nextld;
    private int id = assignld();

    private int assignld() {

        int r = nextld;
        nextld++;
        return r;
    }


    private String name;
        private double salary;

        public Employee(String n, double s) {

            name = n;
            salary = s;
        }

    public String getName() {
        return name;
    }

    public double getSalary(){
            return salary;
    }


    public void raiseSalary ( double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary = + raise;
    }

static {
            Random random = new Random();
            int ID = random.nextInt(1000);
        }




}
