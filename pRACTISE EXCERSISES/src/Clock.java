
public class Clock {
private int hour;
private int minute;
private int second;

public Clock(int h, int m, int s) 
{
	this.hour = h;
	this.minute = m;
	this.second = s;
}
public Clock(int totalTimeInSec) 
{
	this.hour = totalTimeInSec/3600;
	this.minute = ((totalTimeInSec % 3600)/60);
	this.second = totalTimeInSec%60;

}
public String toString() {
	return "Time: " + hour + ":" + minute + ":" + second;
}
}
