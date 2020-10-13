import java.util.Scanner;

public class Excercise61 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = key.nextInt();
		if(age <= 0) {
			System.out.print("Error in age avalue");
			
		}
		else if(age <= 12) {
			System.out.print("Child");
		}
		else if(age <= 19 && age > 12) {
			System.out.print("Teenager");
		}
		else if(age >= 20 && age <= 65) {
			System.out.print("Adult");
		}
		else {
			System.out.print("Senior citizen");
		}

	}

}
