public class Calendar {
    // Starting the calendar on 1/1/1900
    static int dayOfMonth = 1;
    static int month = 1;
    static int year = 1900;
    static int dayOfWeek = 2;     // 1.1.1900 was a Monday
    static int nDaysInMonth = 31; // Number of days in January

    /**
     * Prints the calendars of all the years in the 20th century. Also prints the
     * number of Sundays that occurred on the first day of the month during this
     * period.
     */
    public static void main(String args[]) {
        int debugDaysCounter = 0;
        int sundayscount = 0;
        int inputYear = Integer.parseInt(args[0]); // Input year from command line

        while (year <= inputYear) {
            if (year == inputYear) {
                if (dayOfWeek == 1) {
                    System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
                    if (dayOfMonth == 1) {
                        sundayscount++;
                    }
                } else {
                    System.out.println(dayOfMonth + "/" + month + "/" + year);
                }
            }
            advance();
            debugDaysCounter++;

            if (debugDaysCounter == 0) {
                break;
            }
        }
        System.out.println("During the 20th century, " + sundayscount + " Sundays fell on the first day of the month");
    }

    // Advances the date (day, month, year) and the day-of-the-week.
    // If the month changes, sets the number of days in this month.
    // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
    private static void advance() {
        if (dayOfWeek < 7) {
            dayOfWeek++;
        } else if (dayOfWeek == 7) {
            dayOfWeek = 1;
        }
        if (dayOfMonth < nDaysInMonth) {
            dayOfMonth++;
        } else if (dayOfMonth == nDaysInMonth) {
            dayOfMonth = 1;
            if (month < 12) {
                month++;
                nDaysInMonth = nDaysInMonth(month, year);
            } else if (month == 12) {
                month = 1;
                nDaysInMonth = nDaysInMonth(month, year);
                year++;
            }
        }
    }

    // Returns true if the given year is a leap year, false otherwise.
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Returns the number of days in the given month and year.
    // April, June, September, and November have 30 days each.
    // February has 28 days in a common year, and 29 days in a leap year.
    // All the other months have 31 days.
    private static int nDaysInMonth(int month, int year) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return (isLeapYear(year)) ? 29 : 28;
            default:
                return 31;
        }
    }
}
