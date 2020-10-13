import java.util.Scanner;

public class Exercise63 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter your grade: ");
		int grade = key.nextInt();
		if(grade == -3) 
		{
			System.out.print('F');
		}
		else if(grade == 0) 
		{
			System.out.print("Fx");
		}
		else if(grade == 2) 
		{
			System.out.print('E');
		}
		else if(grade == 4) 
		{
			System.out.print('D');
		}
		else if(grade == 7) 
		{
			System.out.print('C');
		}
		else if(grade == 10) 
		{
			System.out.print('B');
		}
		else if(grade == 12) 
		{
			System.out.print('A');
		}
		else 
		{
			System.out.print("Error");
		}
	}

}
