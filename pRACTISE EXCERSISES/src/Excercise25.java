
public class Excercise25 {

	public static void main(String[] args) {
		final double SALES_TAX = 0.25;
		int product1 = 80;
		int product2 = 140;
		int product3 = 230;
		double product1tax = SALES_TAX * product1 + product1;
		double product2tax = SALES_TAX * product2 + product2;
		double product3tax = SALES_TAX * product3 + product3;
		System.out.print(product1tax + "\n" + product2tax + "\n" + product3tax);
		

	}

}
