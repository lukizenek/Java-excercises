import java.util.Scanner;
public class TestTemperature {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter the temperature in Farenheit; ");
		double temp = key.nextDouble();
		Temperature temp1 = new Temperature(temp);
		//System.out.println("Celcius: " + temp1.getCelcius());
		//System.out.println("Kelvin: " + temp1.getKelvin());
		System.out.println(temp1);

	}

}
