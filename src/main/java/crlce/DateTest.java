package crlce;

import java.time.LocalDate;

/**
 * @author JiaoYuong
 * @date 2020/12/18 10:04
 */
public class DateTest {
    public static void LocalData(){
       LocalDate newYear =  LocalDate.of(2020,11,18);
       int year = newYear.getYear();
//        System.out.println(year);
        int month = newYear.getMonthValue();
//        System.out.println(month);
        int day = newYear.getDayOfMonth();
        System.out.println(day);


       LocalDate aThousandDaysLater = newYear.plusDays(13);
       month = aThousandDaysLater.getMonthValue();
        year = aThousandDaysLater.getYear();
        day = aThousandDaysLater.getDayOfMonth();
//        System.out.println(year);
//        System.out.println(month);
        System.out.println(day);

    }
    public static void main(String[] args) {
        LocalData();
    }
}
