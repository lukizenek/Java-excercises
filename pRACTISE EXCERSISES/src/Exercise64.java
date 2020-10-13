import java.util.Scanner;

public class Exercise64 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter fisrt number: ");
		int num1 = key.nextInt();
		key.nextLine();
		System.out.println("Eneter second number: ");
		int num2 = key.nextInt();
		System.out.println("Eneter third number: ");
		int num3 = key.nextInt();
		if(num1 > num2) 
		{
			if(num1 > num3) 
			{
				if(num2 > num3) 
				{
					System.out.println(num3);
					System.out.println(num2);
					System.out.println(num1);
				}
				
			}
		}
		else if(num1 < num2) 
		{
			if(num2 > num3) 
			{
				if(num1 > num3) 
				{
					System.out.println(num3);
					System.out.println(num2);
					System.out.println(num1);
				}
				
			}
			
		}
		else if(num1 < num2) 
		{
			System.out.println(num1);
			System.out.println(num2);
			
		}
		else if(num1 == num2) 
		{
			System.out.println("Numbers are equal :)");
			
		}
		else 
		{
			System.out.print("Error");
			
		}

	}

}
