
public class Car {
private int yearModel;
private String make;
private int speed;

public Car(int yM, String m) {
	yearModel = yM;
	make = m;
	speed = 0;
}
public int getYearModel() {
	return yearModel;
}
public String getMake() {
	return make;
}
public int getSpeed() {
	return speed;
}
public void accelerate() {
	speed += 5;
	
}
public void decelerate() {
	speed -= 5;
}
}

