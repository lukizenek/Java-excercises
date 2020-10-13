import java.util.Scanner;
public class Exercise26 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the sales tax: ");
		final double SALES_TAX = keyboard.nextDouble();
		//input.nextLine();
		System.out.print("Enter the price of product 1: ");
		int product1 = keyboard.nextInt();
		System.out.print("Enter the price of product 2: ");
		int product2 = keyboard.nextInt();
		System.out.print("Enter the price of product 3: ");
		int product3 = keyboard.nextInt();
		double product1tax = SALES_TAX * product1 + product1;
		double product2tax = SALES_TAX * product2 + product2;
		double product3tax = SALES_TAX * product3 + product3;
		System.out.print(product1tax + "\n" + product2tax + "\n" + product3tax);
		

	}

}
