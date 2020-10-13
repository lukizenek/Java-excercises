
import java.util.Scanner;
public class TestHousehold {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("Enter Your street name: ");
		String sN1 = key.nextLine();
		System.out.print("Enter Your house number: ");
		int hN1 = key.nextInt();;
		key.nextLine();
		System.out.print("Enter Your house size: ");
		double s1 = key.nextDouble();
		System.out.print("Enter Your monthly expenses: ");
		double mE1 = key.nextDouble();
		mE1 = mE1 * 0.8;
		Household house1 = new Household(sN1, hN1, s1, mE1);
		System.out.println(house1);
		

	}

}
