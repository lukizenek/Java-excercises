
public class Exercise103 {

	public static void main(String[] args) {
		MyDate bDay = new MyDate(2, 3, 1998);
		MyDate cDay = new MyDate(19, 10, 2020);
		int i = 0;
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

	}

}
