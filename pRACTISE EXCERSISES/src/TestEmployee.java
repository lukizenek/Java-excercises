import java.util.Scanner;
public class TestEmployee {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Employee worker1 = new Employee(keyboard.nextLine(),keyboard.nextDouble(),keyboard.nextLine(),keyboard.nextLine() );
		//System.out.println("Enter employee name: ");
		//worker1.setName(keyboard.nextLine());
		//System.out.println("Enter employee id: ");
		//worker1.setID(keyboard.nextInt());
		//System.out.println("Enter employee department: ");
		//keyboard.nextLine();
		//worker1.setDep(keyboard.nextLine());
		//System.out.println("Enter employee position: ");
		//worker1.setPos(keyboard.nextLine());
		//System.out.print("Name: " + worker1.getName() + "\nID: " + worker1.getID() + "\nDepartment: " + worker1.getDep() + "\nPosition: " + worker1.getPos());
		//Employee worker2 = new Employee("Zbigniew Zenker", 1400, "Electronics", "technician");
		System.out.print(worker1);


	}

}
