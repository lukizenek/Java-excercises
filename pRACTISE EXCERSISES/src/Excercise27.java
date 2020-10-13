import java.util.Scanner;
public class Excercise27 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter your name:\n");
		String name = keyboard.nextLine();
		System.out.print("Enter your age:\n");
		int age = keyboard.nextInt();
		keyboard.nextLine();
		System.out.print("Enter your address:\n");
		String address = keyboard.nextLine();
		System.out.print("Name: " + name + "\nAge: " + age + "\nAddress: " + address);

	}

}
