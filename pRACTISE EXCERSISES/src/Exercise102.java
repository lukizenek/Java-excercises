import java.util.Scanner;

public class Exercise102 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		boolean lY = false;
		int lYC = 0;
		MyDate date1 = new MyDate(1, 1, 1582);
		MyDate copyDate = date1.copy();
		System.out.print("Enter the initiation year: ");
		date1.setYear(key.nextInt());
		key.nextLine();
		System.out.println("Enter the end year: ");
		int e = key.nextInt();
		for(int y = date1.getYear(); date1.getYear() <= e; y++) 
		{
			lY = date1.isLeapYear(y);
			if(lY == true) {
				lYC++;
			}
			else {
				
			}
		}
		System.out.println("The number of leap years is equal to: " + lYC);
		
		System.out.println(copyDate.displayDate());
		System.out.println("Enter numbers of days to skip:  ");
		int i = key.nextInt();
		date1.nextDays(i);
		System.out.println(date1.displayDate());
		
	}

}
