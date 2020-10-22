import java.util.Scanner;

public class Exercise101 {

	public static void main(String[] args) {
		Scanner key= new Scanner(System.in);
		System.out.println("Eneter the number: ");
		int n = key.nextInt();
		while(n > 0) {
			System.out.println(n * n);
			n--;
		}

		
		

	}

}
