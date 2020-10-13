import java.util.Scanner;

public class Testjob {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter your job name: ");
		Job job1 = new Job();
		job1.setName(keyboard.nextLine());
		System.out.print("\nEnetr your monthly salary: ");
		job1.setSalary(keyboard.nextInt());
		keyboard.nextLine();
		System.out.print("\nEnter start date: ");
		job1.setSDate(keyboard.nextLine());
		System.out.print("\nEnetr end date: ");
		job1.setEDate(keyboard.nextLine());
		System.out.print("\nJob Name: " + job1.getName() + "\nMonthl;y salary: " + job1.getSalary() + "\nStart date: " + job1.getStartDate() + "\nEnd date: " + job1.getEndDate() + "\nAnnual salary: " + job1.getAnbualSalary());
		
		
		
		
		
		
		

	}

}
