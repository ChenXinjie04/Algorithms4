/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class SmartDate {
    private static final String[] DAYS_OF_WEEK = {
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
    };
    private static int[] daysInMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 };
    private int day, month, year;

    SmartDate(int year, int month, int day) {
        if (year < 0) {
            throw new IllegalArgumentException("Invalid year");
        }
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month");
        }
        if (isLeapYear(year)) {
            daysInMonth[2] = 29;
        }
        else {
            daysInMonth[2] = 28;
        }
        if (day < 1 || day > daysInMonth[month]) {
            throw new IllegalArgumentException("Invalid day");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private int getDoomsday() {
        int base = 2;
        int yearGap = year - 2000;
        int leapYear = yearGap / 4;
        int doomsday = (base + yearGap + leapYear) % 7;
        return doomsday;
    }

    private int getJanuaryInterval() {
        int pivot;
        if (isLeapYear(year)) {
            pivot = 18;
        }
        else {
            pivot = 17;
        }
        return day - pivot;
    }

    private int getFebruaryInterval() {
        int pivot;
        if (isLeapYear(year)) {
            pivot = 14;
        }
        else {
            pivot = 15;
        }
        return day - pivot;
    }

    private int getInterval() {
        switch (month) {
            case 1:
                return getJanuaryInterval();
            case 2:
                return getFebruaryInterval();
            case 3:
                return day - 14;
            case 5:
                return day - 9;
            case 7:
                return day - 11;
            case 9:
                return day - 5;
            case 11:
                return day - 7;
            default:
                return day - month;
        }
    }

    private int getDayIndex() {
        int doomsday = getDoomsday();
        int interval = getInterval();
        return (doomsday + 7 + interval) % 7;
    }

    public String dayOfTheWeek() {
        int index = getDayIndex();
        return DAYS_OF_WEEK[index];
    }

    public static void main(String[] args) {
        SmartDate date = new SmartDate(2028, 3, 26);
        System.out.println(date.dayOfTheWeek());
    }
}
