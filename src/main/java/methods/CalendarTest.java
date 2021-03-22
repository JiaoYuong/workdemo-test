package methods;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author JiaoYuong
 * @date 2020/12/21 10:41
 */
public class CalendarTest {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();

        int month = localDate.getMonthValue();

        int today = localDate.getDayOfMonth();

        localDate = localDate.minusDays(today -1);

        DayOfWeek dayOfWeek = localDate.getDayOfWeek();

        int weekvalue = dayOfWeek.getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1;i < weekvalue;i++){
            System.out.print("    ");
        }
        while (localDate.getMonthValue() == month){
            System.out.printf("%3d",localDate.getDayOfMonth());
            if (localDate.getDayOfMonth() == today){
                System.out.print("*");

            }else {
                System.out.print(" ");
            }
            localDate = localDate.plusDays(1);
            if (localDate.getDayOfWeek().getValue() == 1){
                System.out.println();
            }
        }
        if (localDate.getDayOfWeek().getValue() != 1){
            System.out.println();
        }
    }
}
