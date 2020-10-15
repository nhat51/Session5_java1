package ss5.try_catch;

import ss5.ex4.Time_2;

public class Time {
    private int second; //valid range is [0,59]
    private int minute; //valid range is [0,59]
    private int hour;   //valid range is [0,23]

    public void setSecond(int second){
        if (second >= 0 && second <=59){
            this.second = second;
        }
        else {
           throw new IllegalArgumentException("invalid second");
        }
    }
    public void setMinute(int minute){
        if (minute >= 0 && minute <= 59){
            this.minute = minute;
        }else {
           throw new IllegalArgumentException("invalid minute");
        }
    }
    public void setHour(int hour){
        if (hour >= 0 && hour <= 23){
            this.hour = hour;
        }
        else {
            throw new IllegalArgumentException("invalid hour");
        }
    }
    public void setTime(int second,int minute,int hour){
        this.setSecond(second);
        this.setMinute(minute);
        this.setHour(hour);
    }
    public Time(int second,int minute,int hour){
        this.setTime(second,minute,hour);
    }
    public Time(){
        this.second = 0;
        this.minute = 0;
        this.hour = 0;
    }
    public int getSecond(){return this.second;}
    public int getMinute(){return this.minute;}
    public int getHour(){return  this.hour;}

    public String toString() {
        return "Time{" + "second=" + second + ", minute=" + minute + ", hour=" + hour + '}';
    }

    public Time nextSecond(){
        ++second;
        if (second == 60 ){
            second = 0;
            minute++;
            if (minute == 60){
                minute = 0;
                hour++;
                if (hour >= 23)
                    hour = 0;
            }
        }
        return this;
    }
}
