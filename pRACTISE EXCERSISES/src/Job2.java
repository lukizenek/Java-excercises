
public class Job2 {
private String title;
private double salary;
private Person employee;

public Job2(String t, double s, Person employee) {
	this.title = t;
	this.salary = s;
	//this.employee = Person();
}
//public Job2(String t, double s) {
	//title = t;
	//salary = s;
	//employee = null;
//}
public void setTitle(String t) {
	this.title = t;
}
public void setSalary(double s) {
	this.salary = s;
}
public String getTitle() {
	return title;
}
public double getSalary() {
	return salary;
}
public double givePercentageRise(double p) {
	double percentage = p;
	double newSalary = (percentage * (1.0/100.0) * salary) + salary;
	salary = newSalary;
	return salary;
}
public String toString() {
	return "Title: " + title + "\nSalary: " + salary;
}
}
