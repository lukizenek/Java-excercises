
public class TestJob2 {

	public static void main(String[] args) {
		Person person1 = new Person("Lukas", "02/03/1998");
		Job2 job1 = new Job2("technician", 420.0, person1);
		//System.out.print(person1);
		job1.givePercentageRise(30.0);
		System.out.print(job1);
		System.out.print(person1);

	}

}
