import java.util.Scanner;

public class Exercise85 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter Your username: ");
		String uN = key.nextLine();
		System.out.println("Enter Your password: ");
		String pswrd = key.nextLine();
		System.out.println("Enter psssword confirmation: ");
		String pswrd2 = key.nextLine();
		if(pswrd.equals(pswrd2))
		{
			System.out.println("Password confirmed :D");
		}
		else 
		{
			System.out.println("Error bitch");
		}

	}

}
