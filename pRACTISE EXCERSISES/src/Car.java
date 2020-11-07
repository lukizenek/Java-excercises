
public class Car {
private int year;
private String make;
private String color;
private String model;
private String licenseNumber;

public Car(int y, String m, String c, String md, String lN) {
	this.year = y;
	this.make = m;
	this.color = c;
	this.model = md;
	this.licenseNumber = lN;
	
}
public Car(int y, String m, String c, String md) {
	this.year = y;
	this.make = m;
	this.color = c;
	this.model = md;
	this.licenseNumber = null;
	
}
public int getYear() {
	return year;
}
public String getMake() {
	return make;
}
public String getColor() {
	return color;
}
public String getModel() {
	return model;
}
public String getLicenseNumber() {
	return licenseNumber;
}
public void setColor(String c) {
	this.color = c;
}
public void setLicenseNumber(String lN) {
	this.licenseNumber = lN;
}
public Car copy() {
	return new Car(year, make, color, model, licenseNumber);
}
public boolean equals(Object obj) {
	if(!(obj instanceof Car)) {
		return false;
	}
	Car other = (Car)obj;
	return this.year == other.year && this.make == other.make && this.color == other.color && this.model == other.model && this.licenseNumber == other.licenseNumber;
}
}

