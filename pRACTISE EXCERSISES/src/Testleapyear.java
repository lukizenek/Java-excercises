
public class Testleapyear {

	public static void main(String[] args) {
		MyDate date1 = new MyDate();
		date1.setDay(12);
		date1.setMonth(12);
		date1.setYear(2008);
		boolean lp;
		lp = date1.isLeapYear(date1.getYear());
		System.out.print(lp);
		
			
		}

	}


