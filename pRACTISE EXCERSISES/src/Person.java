
public class Person {

	private String name;
	private MyDate birthday;
	private String address;
	
	public Person(String n, MyDate b) {
		this.name = n;
		this.birthday = b;
		
	}
	public Person(String name, String address, MyDate birthday) {
		this.name = name;
		this.address = address;
		this.birthday = birthday;
	}
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return this.address;
	}
	public int getAge() {
		int age;
		MyDate today = MyDate.today();
		if (today.getDay() < birthday.getDay() && today.getMonth() < birthday.getMonth()) {
			age = (today.getYear() - birthday.getYear()) -1;
		}
		else {
			age = today.getYear() - birthday.getYear();
		}
		return age;
	}
	public String toString() {
		return "\nName: " + name + "\nBirthday: " + birthday;
	}

}
