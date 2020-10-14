
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
public void setSeconds(int second) {
	this.second = second;
}
public void setMinute(int minute) {
	this.minute = minute;
}
public void setHour(int hour) {
	this.hour = hour;
}
public int getSecond() {
	return this.second;
}
public int getMinute() {
	return this.minute;
}
public
public Clock(int totalTimeInSec) 
{
	this.hour = totalTimeInSec/3600;
	this.minute = ((totalTimeInSec % 3600)/60);
	this.second = totalTimeInSec%60;

}
public int timeInSeconds(Clock time, Clock time2) {
	int tinsec = 
	
}
public String toString() {
	return "Time: " + hour + ":" + minute + ":" + second;
}
}
