import java.util.Random;
import java.util.Scanner;

public class Exercise91 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Random rN = new Random();
		int randomN = rN.nextInt(11);
		System.out.println("Enter your guessed number between 1-10: ");
		int gN = key.nextInt();
		if(gN == randomN) 
		{
			System.out.println("correct");
		}
		else if(gN > randomN)
		{
			System.out.println("to high");
			//System.out.println(randomN);
		}
		else
		{
			System.out.println("To low");
		}
		
		
	}

}
