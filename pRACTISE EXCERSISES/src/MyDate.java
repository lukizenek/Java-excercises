
public class MyDate {
	private int day;
	private int month;
	private int year;
	boolean leap;
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
		if(m % 2 == 0 && leap == false && m != 2) 
		{
			int days = 30;
			return days;
		}
		else if(m % 2 == 0 && leap == false && m == 2) 
		{
			int days = 28;
			return days;
		}
		else if(m % 2 == 0 && leap == false && m == 2) 
		{
			int days = 29;
			return days;
		}
		else 
		{
			int days = 31;
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
	//public String getWeekDay()
}
	
