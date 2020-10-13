
public class Employee {
	private String name;
	private double idNumber;
	private String department;
	private String position;
	
	public void setName(String n) {
		name = n;
	}
	public void setID(double id) {
		idNumber = id;
	}
	public void setDep(String d) {
		department = d;
	}
	public void setPos(String p) {
		position = p;
	}
	public String getName() {
		return name;
	}
	public double getID() {
		return idNumber;
	}
	public String getDep() {
		return department;
	}
	public String getPos() {
		return position;
	
	}
	public Employee (String n, double id, String d, String p) {
		name = n;
		idNumber = id;
		department = d;
		position = p;
		
		
		
	}
	public String toString() {
		return "\nName; " + name + "\nID: " + idNumber + "\nDep: " + department + "\nPos: " + position;
	}

}
