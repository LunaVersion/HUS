package hus.oop.lab5.themydateclass;

import java.util.Scanner;

public class TestMyDate {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the day: ");
//        int day = sc.nextInt();
//        System.out.print("Enter the month: ");
//        int month = sc.nextInt();
//        System.out.print("Enter the year: ");
//        int year = sc.nextInt();
//        MyDate date = new MyDate(year,month,day);
//        System.out.println(date.isValidDate(day,month,year));
//
        MyDate date1 = new MyDate ( 2012 , 2 , 28 ) ;
        System.out.println(date1); ; // Tuesday 28 Feb 2012
        System.out.println(date1.nextDay()); ; // Wednesday 29 Feb 2012
        System.out.println(date1.nextDay()); ; // Thursday 1 Mar 2012
        System.out.println(date1.nextMonth()); ; // Sunday 1 Apr 2012
        System.out.println(date1.nextYear()); ; // Monday 1 Apr 2013
        date1.isLeapYear(date1.getYear());

        MyDate date2 = new MyDate ( 2012 , 1 , 2 ) ;
        System.out.println(date2);; // Monday 2 Jan 2012
        System.out.println(date2.nextDay()); ; // Sunday 1 Jan 2012
        System.out.println(date2.nextDay()) ; // Saturday 31 Dec 2011
        System.out.println(date2.nextMonth()) ; // Wednesday 30 Nov 2011
        System.out.println(date2.nextYear()) ; // Tuesday 30 Nov 2010

        MyDate date3 = new MyDate ( 2012 , 2 , 29 ) ;
        System . out . println ( date3.previousYear() ) ; // Monday 28 Feb 2011
    }
}
