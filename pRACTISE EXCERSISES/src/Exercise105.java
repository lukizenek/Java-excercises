import java.util.Scanner;
public class Exercise105 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter your word: ");
		String word = key.nextLine();
		while(!word.equals("quit")) 
		{
			int kupa = word.length();
			for(int i = word.length(); i >= 1; i--) 
			{
				kupa--;
				System.out.print(word.charAt(kupa));
				
			}
			System.out.println("\nEnter your word: ");
			word = key.nextLine();

			
		}
		
	}

}
