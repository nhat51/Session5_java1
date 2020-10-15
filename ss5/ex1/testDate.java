package ss5.ex1;

import ss5.ex1.Date;

public class testDate {
    public static void main(String[] args) {
        //test constructor and toString()
        Date d1 = new Date(2020,2,8);
        System.out.println(d1);

        //test setter and getter
        d1.setYear(2020);
        d1.setMonth(2);
        d1.setDay(8);
        System.out.println(d1);

        System.out.println("the year is: " + d1.getYear());
        System.out.println("the month is: " + d1.getMonth());
        System.out.println("the day is: " + d1.getDay());

        d1.setDate(2020,2,8);
        System.out.println(d1);
    }
}
