package hus.oop.lab5.themydateclass;


public class MyDate {
    private int year;
    private int month;
    private int day;
    private String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep","Oct","Nov","Dec"};
    private String[] DAYS = {"Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    private int[] DAYS_IN_MONTHS = {31,28,31,30,31,30,31,31,30,31,30,31};

    public MyDate(){

    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public boolean isLeapYear(int year){
        return year % 4 == 0 && year % 100 != 0;
    }
    public boolean isValidDate(int day, int month, int year){
        if(isLeapYear(year)) DAYS_IN_MONTHS[1] = 29;
        if(year<=1 && year>=9999){
            return false;
        }
        if(month<=1 && month >= 12) {
            return false;
        }
        if(day < 0 && day > DAYS_IN_MONTHS[month-1]) {
            return false;
        }
        if(year>=1 && year<=9999 &&month>=1 && month <= 12 &&day > 0 && day < DAYS_IN_MONTHS[month-1])
            return true;
        return false;
    }

    public MyDate nextDay() {
        int daysInMonth = daysInMonth(this.month, this.year);
        int nextDay = this.day;
        int nextMonth = this.month;
        int nextYear = this.year;

        if (this.day == daysInMonth) {
            nextDay = 1;
            if (this.month == 12) {
                nextMonth = 1;
                nextYear = this.year + 1;
            } else {
                nextMonth = this.month + 1;
            }
        } else {
            nextDay++;
        }

        return new MyDate(nextYear, nextMonth, nextDay);
    }

    public MyDate previousDay() {
        int previousDay = this.day;
        int previousMonth = this.month;
        int previousYear = this.year;

        if (this.day == 1) {
            if (this.month == 1) {
                previousMonth = 12;
                previousYear = this.year - 1;
            } else {
                previousMonth = this.month - 1;
            }
            previousDay = daysInMonth(previousMonth, previousYear);
        } else {
            previousDay--;
        }

        return new MyDate(previousYear, previousMonth, previousDay);
    }

    public MyDate nextMonth() {
        int nextMonth = (this.month % 12) + 1;
        int nextYear = this.year + (this.month == 12 ? 1 : 0);
        int daysInNextMonth = daysInMonth(nextMonth, nextYear);
        int nextDay = Math.min(this.day, daysInNextMonth);

        return new MyDate(nextYear, nextMonth, nextDay);
    }

    public MyDate previousMonth() {
        int previousMonth = (this.month - 2) % 12 + 1;
        int previousYear = this.year - (this.month == 1 ? 1 : 0);
        int daysInPreviousMonth = daysInMonth(previousMonth, previousYear);
        int previousDay = Math.min(this.day, daysInPreviousMonth);

        return new MyDate(previousYear, previousMonth, previousDay);
    }

    public MyDate nextYear() {
        int daysInNextYear = daysInMonth(this.month, this.year + 1);
        int nextDay = Math.min(this.day, daysInNextYear);

        return new MyDate(this.year + 1, this.month, nextDay);
    }

    public MyDate previousYear() {
        int daysInPreviousYear = daysInMonth(this.month, this.year - 1);
        int previousDay = Math.min(this.day, daysInPreviousYear);

        return new MyDate(this.year - 1, this.month, previousDay);
    }

    // Helper method to get the number of days in a month
    private int daysInMonth(int month, int year) {
        if (month == 2) {
            return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    public static int getDayOfWeek(int year, int month, int day) {
        // January and February are counted as months 13 and 14 of the previous year
        if (month < 3) {
            month += 12;
            year--;
        }

        // Zeller's Congruence algorithm
        int q = day;
        int m = month;
        int k = year % 100;
        int j = year / 100;

        int h = (q + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;

        // Convert result to the range [0, 6] where 0 is Monday, ...
        int dayOfWeek = (h + 5) % 7;

        return dayOfWeek;
    }

    @Override
    public String toString() {
        return DAYS[getDayOfWeek(this.year,this.month,this.day)]+" " + this.day + " " + MONTHS[this.month - 1]+" " + this.year;
    }
}
