
public class Exercise104 {

	public static void main(String[] args) {
		int num0 = 0;
		int num1 = 1;
		int i = 0;
		for(i = 0; i<= 19; i++) 
		{
			System.out.println("Fibonnacci(" + i + "): " + num1);
			int num3 = num0 + num1;
			num0 = num1;
			num1 = num3;
		}

	}

}
