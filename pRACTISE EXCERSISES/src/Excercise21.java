import java.util.Scanner;
public class Excercise21 {

	public static void main(String[] args) {
		String cityName;
		Scanner keyboard = new Scanner(System.in);
		cityName = keyboard.nextLine();
		String upper = cityName.toUpperCase();
		String lower = cityName.toLowerCase();
		char letter = cityName.charAt(0);
		int numL = cityName.length();
		System.out.print(cityName + "\n" + upper + "\n" + lower + "\n" + letter + "\n" + numL);
		

	}

}
