
public class MyDate {
	private int day;
	private int month;
	private int year;
	boolean leap;
	public MyDate(int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
		
	}
	public void setDay(int d) {
		this.day = d;
		
	}
	public void setMonth(int m) {
		month = m;
	}
	public void setYear(int y) {
		year = y;
	}
	public int getDay() {
		return this.day;
		
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public String displayDate() {
		return day + "/" + month + "/" + year;
	}
	public boolean isLeapYear(int year) {
		if(year % 4 == 0 && ((year % 400 == 0) || (!(year % 100 == 0)) ) )
		{
			this.year = year;
			leap = true;
			return leap;
			
		}
		else 
		{
			this.year = year;
			leap = false;
			return leap;
		}
		
	}
	public int daysInMonth(int m) {
		this.month = m;
		int days;
		switch(m) 
		{
		case 1:
			days = 31;
			return days;
		case 2:
			if(isLeapYear(this.year) == true) 
			{
				days = 29;
				return days;
			}
			else 
			{
				days = 28;
				return days;
			}
		case 3:
			days = 31;
			return days;
		case 4:
			days = 30;
			return days;
		case 5:
			days = 31;
			return days;
		case 6:
			days = 30;
			return days;
		case 7:
			days = 31;
			return days;
		case 8:
			days = 31;
			return days;
		case 9:
			days = 30;
			return days;
		case 10:
			days = 31;
			return days;
		case 11:
			days = 30;
			return days;
		case 12:
			days = 31;
			return days;
		default:
			days = 0;
			return days;
		}
		
	}
	public boolean correctDay(int dn) 
	{
		this.day = dn;
		int dim = daysInMonth(getMonth());
		if(dn <= dim) 
		{
			boolean cd = true;
			return cd;
		}
		else 
		{
			boolean cd = false;
			return cd;
		}
	}
	public String getAstroSign(int m, int d) {
		this.month = m;
		this.day = d;
		if((m == 3 && d >= 21) || (m == 4 && d <= 19) ) 
		{
			String astro = "Aries";
			return astro;
		}
		else 
		{
			String astro = "error";
			return astro;
		}
	}
	public String getMonthName(int m) 
	{
		
		String mN;
		this.month = m;
		switch(m) 
		{
		case 1:
			mN = "January";
			return mN;
		case 2:
			mN = "February";
			return mN;
		case 3:	
			mN = "March";
			return mN;
		case 4:
			mN = "April";
			return mN;
		case 5:
			mN = "May";
			return mN;
		case 6:
			mN = "June";
			return mN;
		case 7:
			mN = "July";
			return mN;
		case 8:
			mN = "August";
			return mN;
		case 9:
			mN = "September";
			return mN;
		case 10:
			mN = "October";
			return mN;
		case 11:
			mN = "November";
			return mN;
		case 12:
			mN = "December";
			return mN;
		default:
			mN = "Error";
			return mN;
		
		}
		
	}
	public void nextDay() {
		++this.day;
	}
	//public String getWeekDay()
}
	
