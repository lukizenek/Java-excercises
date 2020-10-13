
public class TestPerson {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setBirthday("02.03.1998");
		person1.setName("Lukas");
		System.out.print("Name: " + person1.getName() + "\nBirthday: " + person1.getBirthday());

	}

}
