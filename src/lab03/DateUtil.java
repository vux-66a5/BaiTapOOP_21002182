package lab03;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateUtil {
    //All month's names
    static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    //Number of days in each month from 1-12 ( non-leap)
    static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    //convert the number of day to string
    static String[] calendarDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    static int maxValidYear = 9999;
    static int minValidYear = 1;

    public static void main(String[] args) {
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2011));
        System.out.println(isLeapYear(2012));

        System.out.println(isValidDate(2012, 2, 29));
        System.out.println(isValidDate(2011, 2, 29));
        System.out.println(isValidDate(2099, 12, 31));
        System.out.println(isValidDate(2099, 12, 32));

        System.out.println(getDayOfWeek(1982, 4, 24));
        System.out.println(getDayOfWeek(2000, 1, 1));
        System.out.println(getDayOfWeek(2054, 6, 19));
        System.out.println(getDayOfWeek(2012, 2, 17));

        System.out.println(toString(2012, 2, 14));
        //getDayOfWeekTest(2012,2,14);
    }

    //return true if the given year is a leap year
    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    //return true if given year,month,day is valid date
    //year : 1 - 9999
    //month : 1 - 12
    //day: 1 - 28|29|30|31 depends on year(leap/non-leap) and month
    public static boolean isValidDate(int year, int month, int day) {
        if (year < minValidYear || year > maxValidYear) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        int dayOfMonth = daysInMonths[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0); //la thang 2 cua nam nhuan thi cong 1 khong thi thoi
        return 1 <= day && day <= dayOfMonth;
    }

    //0:Sun ; 1:Mon; 2:Tues; ....6:Sat
    public static int getDayOfWeek(int year, int month, int day) {
        //20** ~ 6 | 21** ~ 4 | 22** ~ 2 | 23** ~ 0
        int numberFromCentury = 6 - 2 * ((year / 100) % 4); // du 0 ~ 6, du 1 ~ 4, du 2 ~ 2 , du 3 ~ 0

        int lastTwoDigitsOfYear = year % 100;

        int[] nonLeapYearNumbers = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int[] leapYearNumbers = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int numberFromMonthTable = isLeapYear(year) ? leapYearNumbers[month - 1] : nonLeapYearNumbers[month - 1];

        return (numberFromCentury + lastTwoDigitsOfYear + lastTwoDigitsOfYear / 4 + numberFromMonthTable + day) % 7;

        //example : 2012,Feb,17
        //(6 + 12 + 12/4 + 2 + 17) % 7 = 5( Fri )

    }

    public static void getDayOfWeekTest(int year, int month, int day) {
        Calendar cal = new GregorianCalendar(year, month - 1, day);  // month is 0-based
        // Get the day of the week number: 1 (Sunday) to 7 (Saturday)
        int dayNumber = cal.get(Calendar.DAY_OF_WEEK);
        //String[] calendarDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        //Print result
        System.out.println("It is " + calendarDays[dayNumber - 1]);
    }

    // Return String "xxxday d mmm yyyy" (e.g., Wednesday 29 Feb 2012)
    public static String toString(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            return "Not a valid date";
        }
        int dayOfWeekNumber = getDayOfWeek(year, month, day);
        return calendarDays[dayOfWeekNumber] + " " + day + " " + strMonths[month - 1] + " " + year;


    }

}
