import java.util.Scanner;

public class Exercise28 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter your name:\n");
		String name = keyboard.nextLine();
		System.out.print("Enter your age:\n");
		int age = keyboard.nextInt();
		keyboard.nextLine();
		System.out.print("Enter your collage degree: \n");
		String collage = keyboard.nextLine();
		System.out.print("Enter your profession: \n");
		String profession = keyboard.nextLine();
		System.out.print("Enter an animal type: \n");
		String animal = keyboard.nextLine();
		System.out.print("Enter pet name: \n");
		String petName = keyboard.nextLine();
		System.out.print("Enter your address:\n");
		String address = keyboard.nextLine();
		System.out.print("Name: " + name + "\nAge: " + age + "\nAddress: " + address + "\nCollage: " + collage + "\nProfession: " + profession + "\nAnimal: " + animal + "\nAnimal name: " + petName);

	}

}
