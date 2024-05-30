package hus.oop.lab5.themytimeclass;

import java.util.Scanner;

public class TestMyTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyTime myTime = new MyTime();

        myTime.setHour(22);
        myTime.setMinute(20);
        myTime.setSecond(42);
        System.out.println("The next second of " + myTime + " is " + myTime.nextSecond());

        myTime.setHour(23);
        myTime.setMinute(59);
        myTime.setSecond(59);
        System.out.println("The next second of " + myTime + " is " + myTime.nextSecond());

        myTime.setHour(0);
        myTime.setMinute(0);
        myTime.setSecond(0);
        System.out.println("The previous second of " + myTime + " is " + myTime.previousSecond());

        myTime.setHour(11);
        myTime.setMinute(03);
        myTime.setSecond(03);
        System.out.println("The previous hour of " + myTime + " is " + myTime.previousHour());

    }
}
