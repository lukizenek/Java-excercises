import java.util.Scanner;
import java.util.Random;
public class Exercise106 {

	public static void main(String[] args) {
		Random rN = new Random();
		int randomNumer = rN.nextInt((1000 - 1) + 1) + 1;
		Scanner key = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = key.nextInt();
		while(!(randomNumer == num)) 
		{
			if(num > randomNumer) 
			{
				System.out.print("Your answear is to high. Try it again :) : ");
			}
			else
			{
				System.out.print("Your answear is to low. Try it again :) : ");
			}
			System.out.println("\nEnter your number: ");
			num = key.nextInt();
			
		}
		System.out.println("Congratulations, you guessed it :D ");

	}

}
