package ss5.ex4;

import ss5.ex3.Time;

public class TestTime {
    public static void main(String[] args) {
        //test constructor and toString
        Time_2 t1 = new Time_2();
        System.out.println(t1);
        Time_2 t2 = new Time_2();
        System.out.println(t2);

        //test setter and getter
        t1.setSecond(4);
        t1.setMinute(5);
        t1.setHour(6);
        System.out.println(t1); //run toString to inspect the modified instance

        System.out.println("Hour: " + t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSecond());

        t1.setTime(58,59,23);
        System.out.println(t1);
        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond().nextSecond());
    }
}
