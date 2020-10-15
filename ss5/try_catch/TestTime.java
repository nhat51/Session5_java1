package ss5.try_catch;

public class TestTime {
    public static void main(String[] args) {
        int hour = 22,minute =58,second = 58;
        Time t12;
        try{
            t12 = new Time(second, minute, hour);
            //if input is invalid, throw exception. Skip the rest, go to catch
            System.out.println("valid input");
        }catch (IllegalArgumentException ex){
            ex.printStackTrace();
            System.out.println("error input.Set to the defaul value");
            t12 = new Time();
        }
        System.out.println("Time is" + t12);
        System.out.println("Life goes on....");
    }
}
