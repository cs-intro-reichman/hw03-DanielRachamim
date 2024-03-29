/*
 * Checks if a given year is a leap year or a common year,
 * and computes the number of days in a given month and a given year. 
 */
public class Calendar0 {	
	
	// Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		isLeapYearTest(year);
		nDaysInMonthTest(year);
	}
		 
	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) {
		String common_or_leap = "common";
		if (isLeapYear(year)) {
			common_or_leap = "leap";
		}
		System.out.println(year + " is a " + common_or_leap + " year");  
	}

	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int year) {
		for (int month = 1; month <= 12; month++) {
			int daysInMonth = nDaysInMonth(month, year);
			System.out.println("Month " + month + " has " + daysInMonth + " days");
		}
	}

	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
		// Returns true if the given year is a leap year, false otherwise.
	    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	public static int nDaysInMonth(int month, int year) {
		switch (month) {
			case 4: case 6: case 9: case 11:
				return 30;
			case 2:
				return (isLeapYear(year)) ? 29 : 28;
			default:
				return 31;
		}
	}
}

