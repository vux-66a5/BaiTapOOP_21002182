package lab06.mydateclass;

public class MyDate {
    private int year, month, day;
    static final String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    static final String[] daysInWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    static final int[] numberOfDaysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValidDate(int year, int month, int day) {
        //year: 1 - 9999
        //month: 1 - 12
        //day: 1 - 28|29|30|31
        if (year < 1 || year > 9999) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        int maxValidDay = numberOfDaysInMonths[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
        return day >= 1 && day <= maxValidDay;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        //0:Sun ; 1:Mon; 2:Tues; ... ; 6:Sat
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

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(int year, int month, int day) {
        try {
            if (isValidDate(year, month, day)) {
                this.year = year;
                this.month = month;
                this.day = day;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid year!");
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        try {
            if (year >= 1 && year <= 9999) {
                this.year = year;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid year!");
        }
    }

    public void setMonth(int month) {
        try {
            if (month >= 1 && month <= 12) {
                this.month = month;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid month!");
        }
    }

    public void setDay(int day) {
        int thisMonth = this.getMonth();
        int maxDay = numberOfDaysInMonths[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
        try {
            if (day >= 1 && day <= maxDay) {
                this.day = day;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day!");
        }
    }

    public String toString() {
        // Return String "xxxday d mmm yyyy" (e.g., Tuesday 14 Feb 2012)
        if (!isValidDate(year, month, day)) {
            return "Not a valid date";
        }
        int dayOfWeekNumber = getDayOfWeek(year, month, day);
        return daysInWeek[dayOfWeekNumber] + " " + day + " " + strMonths[month - 1] + " " + year;
    }

    public MyDate nextDay() {
        int maxDayOfThisMonth = numberOfDaysInMonths[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
        if (this.day != maxDayOfThisMonth) {
            this.day++;
        } else {
            if (this.month == 12) {
                this.day = 1;
                this.month = 1;
                this.year++;
            } else {
                this.day = 1;
                this.month++;
            }
        }
        return this;
    }

    public MyDate nextMonth() {
        int maxDayOfOldMonth = numberOfDaysInMonths[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
        if (this.month == 12) {
            this.month = 1;
            year++;
        } else {
            this.month++;
        }
        int maxDayOfNewMonth = numberOfDaysInMonths[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
        if ((day == maxDayOfOldMonth) && (maxDayOfOldMonth > maxDayOfNewMonth)) {
            this.day = maxDayOfNewMonth;
        }
        return this;
    }

    public MyDate nextYear() {
        try {
            if (this.year <= 9999) {
                if (isLeapYear(year) && this.month == 2 && this.day == 29) {
                    this.day = 28;
                }
                this.year++;
                return this;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Year out of range!");
        }
        return this;
    }

    public MyDate previousDay() {
        if (this.day != 1) {
            this.day--;
        } else {
            if (this.month != 1) {
                this.month--;
                int maxDayOfNewMonth = numberOfDaysInMonths[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
                this.day = maxDayOfNewMonth;
            } else {
                this.day = 31;
                this.month = 12;
                this.year--;
            }
        }
        return this;
    }

    public MyDate previousMonth() {
        int maxDayOfOldMonth = numberOfDaysInMonths[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
        if (this.month == 1) {
            this.month = 12;
            year--;
        } else {
            this.month--;
        }
        int maxDayOfNewMonth = numberOfDaysInMonths[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
        if (day == 1) {
            this.day = maxDayOfNewMonth;
        }
        if (maxDayOfOldMonth > maxDayOfNewMonth) {
            this.day = maxDayOfNewMonth;
        }
        return this;
    }

    public MyDate previousYear() {
        try {
            if (this.year >= 1) {
                if (isLeapYear(year) && this.month == 2 && this.day == 29) {
                    this.day = 28;
                }
                this.year--;
                return this;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Year out of range!");
        }
        return this;
    }
}
