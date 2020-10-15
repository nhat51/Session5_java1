package ss5.ex3;

public class Time {
    int second,minute,hour;
    public Time(int second,int minute, int hour){
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }
    public Time(){
        second =0;
        minute = 0;
        hour = 0;
    }

    @Override
    public String toString() {
        return "Time{" + "second=" + second + ", minute=" + minute + ", hour=" + hour + '}';
    }

    //the public getter/setter for the private variable
    public int getSecond(){return this.second;}
    public int getMinute(){return this.minute;}
    public int getHour(){return this.hour;}

    public int setSecond(int second){return this.second = second; }
    public int setMinute(int minute){return this.minute = minute; }
    public int setHour(int hour){return this.hour = hour;}

    public void setTime(int second,int minute,int hour){
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public Time nextSecond(){
        second++;
        if (second >= 60){
            second = 0;
            minute++;
            if (minute >= 60){
                minute = 0;
                hour++;
                if (hour >= 24){
                    hour = 0;
                }
            }
        }
        return this; //return "this" instance, to support
    }
}
