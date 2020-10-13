import java.util.concurrent.TimeUnit;
public class TestCar {

	public static void main(String[] args) {
		Car car1 = new Car(2017, "Yaris");
		car1.accelerate();
		System.out.println("Speed: " + car1.getSpeed());
		car1.accelerate();
		System.out.println("Speed: " + car1.getSpeed());
		car1.accelerate();
		System.out.println("Speed: " + car1.getSpeed());
		car1.accelerate();
		System.out.println("Speed: " + car1.getSpeed());
		car1.accelerate();
		System.out.println("Speed: " + car1.getSpeed());
		car1.decelerate();
		System.out.println("Speed: " + car1.getSpeed());
		car1.decelerate();
		System.out.println("Speed: " + car1.getSpeed());
		car1.decelerate();
		System.out.println("Speed: " + car1.getSpeed());
		car1.decelerate();
		System.out.println("Speed: " + car1.getSpeed());
		car1.decelerate();
		System.out.println("Speed: " + car1.getSpeed());

	}

}
