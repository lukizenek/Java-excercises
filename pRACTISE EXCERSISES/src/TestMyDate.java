import java.util.Scanner;
public class TestMyDate {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(1, 1, 1);
		MyDate date2 = new MyDate(1, 1, 2);
		Scanner key = new Scanner(System.in);
		System.out.println("Enter the day number: ");
		//date2.setDay(key.nextInt());
		boolean lY = date2.isLeapYear(date2.getYear());
		String mN = date2.getMonthName(date2.getMonth());
		//date2.daysInMonth(date2.getMonth());
		int dMonth = date2.daysInMonth(date2.getMonth());
		boolean cd = date2.correctDay(date2.getDay());
		String aS = date2.getAstroSign(date2.getMonth(), date2.getDay());
		//System.out.println("Date: " + date1.displayDate());
		System.out.println("\nCurrent Date: " + date2.displayDate());
		System.out.println("Days in a month: " + dMonth);
		System.out.println("Is the day number correct?: " + cd);
		System.out.println(date2.getDay());
		System.out.println("Your astrological sign is: " + aS);
		System.out.println("Name of the month: " + mN);
		System.out.println("Is leap?: " + lY);
		System.out.println(date2.isBefore(date1));
	}

}
