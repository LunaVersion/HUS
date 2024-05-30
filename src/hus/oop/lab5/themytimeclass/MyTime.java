package hus.oop.lab5.themytimeclass;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;
    public MyTime(){

    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return  hour + ":" + minute + ":" + second;
    }

    public MyTime nextHour() {
        int nextHour = (this.hour + 1) % 24;
        return new MyTime(nextHour, this.minute, this.second);
    }

    public MyTime nextMinute() {
        int nextMinute = this.minute;
        int nextHour = this.hour;

        if (this.minute == 59) {
            nextMinute = 0;
            nextHour = (this.hour + 1) % 24;
        } else {
            nextMinute++;
        }

        return new MyTime(nextHour, nextMinute, this.second);
    }

    public MyTime nextSecond() {
        int nextSecond = this.second;
        int nextMinute = this.minute;
        int nextHour = this.hour;

        if (this.second == 59) {
            nextSecond = 0;
            if (this.minute == 59) {
                nextMinute = 0;
                nextHour = (this.hour + 1) % 24;
            } else {
                nextMinute++;
            }
        } else {
            nextSecond++;
        }

        return new MyTime(nextHour, nextMinute, nextSecond);
    }

    public MyTime previousHour() {
        int previousHour = (this.hour - 1 + 24) % 24;
        return new MyTime(previousHour, this.minute, this.second);
    }

    public MyTime previousMinute() {
        int previousMinute = this.minute;
        int previousHour = this.hour;

        if (this.minute == 0) {
            previousMinute = 59;
            previousHour = (this.hour - 1 + 24) % 24;
        } else {
            previousMinute--;
        }

        return new MyTime(previousHour, previousMinute, this.second);
    }

    public MyTime previousSecond() {
        int previousSecond = this.second;
        int previousMinute = this.minute;
        int previousHour = this.hour;

        if (this.second == 0) {
            previousSecond = 59;
            if (this.minute == 0) {
                previousMinute = 59;
                previousHour = (this.hour - 1 + 24) % 24;
            } else {
                previousMinute--;
            }
        } else {
            previousSecond--;
        }

        return new MyTime(previousHour, previousMinute, previousSecond);
    }

}
