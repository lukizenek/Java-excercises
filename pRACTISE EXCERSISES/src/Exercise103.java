
public class Exercise103 {

	public static void main(String[] args) {
		MyDate bDay = new MyDate(1, 2, 1);
		MyDate cDay = new MyDate(3, 11, 2020);
		MyDate copyDate = new MyDate(cDay);
		int i = 0;
		boolean eq = bDay.equals(bDay);
		while(!(bDay.getDay() == cDay.getDay() && bDay.getMonth() == cDay.getMonth() && bDay.getYear() == cDay.getYear())) 
		{
			bDay.nextDay();
			if(bDay.getDay() > bDay.daysInMonth(bDay.getMonth())) 
			{
				bDay.setMonth(bDay.getMonth() + 1);
				if (bDay.getMonth() > 12) 
				{
					bDay.setMonth(1);
					bDay.setYear(bDay.getYear() + 1);
				}
				bDay.setDay(1);
				
				
			}
			++i;
		}
		System.out.println("number of days since birth: " + i);
		System.out.println(eq);
		//MyDate copyDate = new MyDate(cDay);
		System.out.println(copyDate.displayDate());
		int x = 1000;
		cDay.nextDays(x);
		System.out.println(cDay.displayDate());
		MyDate today = new MyDate();
		System.out.println(today.displayDate());
		boolean before = today.isBefore(today);
		System.out.println(before);
		System.out.println(cDay.equals(today));
	}

}
