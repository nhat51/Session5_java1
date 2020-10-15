package ss5.ex1;

public class Date {
    private int year, month, day;
    //Construct the date
    public Date(int year,int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    //return the year
    public int getYear(){return this.year;}
    //return the month
    public int getMonth(){return  this.month;}
    //return the day
    public int getDay(){return  this.day;}
    //set the year. No input validation
    public void setYear(int year){this.year = year;}
    //set the month. No input validation
    public void setMonth(int month){this.month = month;}
    //set the day. No input validation
    public void setDay(int day){this.day = day;}

    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
    public void setDate(int year,int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
