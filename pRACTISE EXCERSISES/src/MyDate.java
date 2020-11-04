import java.util.GregorianCalendar;
public class MyDate {
	private int day;
	private int month;
	private int year;
	boolean leap;
	boolean equals;
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
	public int daysInMonth(int m) 
	{
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
		if(this.getDay() > this.daysInMonth(this.getMonth())) 
		{
			this.setMonth(this.getMonth() + 1);
			if (this.getMonth() > 12) 
			{
				this.setMonth(1);
				this.setYear(this.getYear() + 1);
			}
			this.setDay(1);
		}
	}
	public boolean equals(MyDate obj) {
		if(obj.getDay() == obj.getMonth() && obj.getYear() == obj.getMonth() && obj.getYear() == obj.getDay()) {
			equals = true;
		}
		else {
			equals = false;
		}
		return equals;
	}
	public MyDate copy() {
		return new MyDate(day, month, year);
	}
	public MyDate(MyDate obj) {
		day = obj.day;
		month = obj.month;
		year = obj.year;
	}
	public void nextDays(int d) {
		int i;
		for(i = (d-1); i >= 0; i--) 
		{
			
			if(this.getDay() > this.daysInMonth(this.getMonth())) 
			{
				this.setMonth(this.getMonth() + 1);
				if (this.getMonth() > 12) 
				{
					this.setMonth(1);
					this.setYear(this.getYear() + 1);
				}
				this.setDay(1);
			}
			++this.day;
			
		}
	}
	public static MyDate today() 
	{
		GregorianCalendar currentDate = new GregorianCalendar();
		int currentDay = currentDate.get(GregorianCalendar.DATE);
		int currentMonth = currentDate.get(GregorianCalendar.MONTH)+1;
		int currentYear = currentDate.get(GregorianCalendar.YEAR);
		MyDate today = new MyDate(currentDay, currentMonth, currentYear);
		return today;
	}
	public MyDate() {
		MyDate today = MyDate.today();
		this.day = today.day;
		this.month = today.month;
		this.year = today.year;
	}
	//public String getWeekDay()
}
	
