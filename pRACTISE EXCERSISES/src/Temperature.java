 
public class Temperature {
private double fTemp;
public Temperature(double ft) {
	fTemp = ft;
}
public void setFarenheit(double t) {
	fTemp = t;
}
public double getFarenheit() {
	return fTemp;
}
public double getCelcius() {
	double celcius = ((fTemp - 32.0) * (5.0/9.0));
	return celcius;
}
public double getKelvin() {
	double kelvin = ((fTemp - 32.0) * (5.0/9.0)) - 273.0;
	return kelvin;
}
public String toString() {
	return "Farenheit: " + fTemp + "\nCelcius: " + String.valueOf(getCelcius()) + "\nKelvin: " + getKelvin();
}
}
