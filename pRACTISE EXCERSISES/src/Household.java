
public class Household {
	private String roadName;
	private int houseNumber;
	private double size;
	private double mExpenses;
	
	public Household (String r, int hn, double s, double me) {
		roadName = r;
		houseNumber = hn;
		size = s; 
		mExpenses = me;
	}
	public void setRoadName(String r) {
		roadName = r;
	}
	public void setHouseNumber(int hn) {
		houseNumber = hn;
	}
	public void setSize(double s) {
		size =s;
	}
	public void setMExpenses(double me) {
		mExpenses = me;
	}
	public String getRoadName() {
		return roadName;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public double getSize() {
		return size;
	
	}
	public double getMExpenses() {
		return mExpenses;
	}
	public String toString() {
		return "Street name: " + roadName + "\nHouse number: " + houseNumber + "\nHouse size: " + size + "\nMonthly expenses: " + mExpenses;
	}

}
