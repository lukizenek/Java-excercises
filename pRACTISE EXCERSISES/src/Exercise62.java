import java.util.Scanner;

public class Exercise62 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enetr your age: ");
		int age = key.nextInt();
		key.nextLine();
		System.out.println("Enter your gender: ");
		char gender = key.nextLine().charAt(0);
		if(gender == 'M' || gender == 'm') 
		{
			if(age < 18) 
			{
				System.out.print("Boi");
				
			}
			else 
			{
				System.out.print("Man");
				
			}
		}
		else if(gender == 'F' || gender == 'f') 
		{
			if(age < 18) 
			{
				System.out.print("Gurl");
				
			}
			else 
			{
				System.out.print("Woman");
				
			}
		}
		else 
		{
			System.out.print("Error");
		}
		
		}
}
