
public class Clock {
private int hour;
private int minute;
private int second;
private boolean timeFormat24;

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
public int getHour() {
	return this.hour;
}
public Clock(int totalTimeInSec) 
{
	this.hour = totalTimeInSec/3600;
	this.minute = ((totalTimeInSec % 3600)/60);
	this.second = totalTimeInSec%60;

}
public int convertToSeconds() {
	int tseconds = ((this.hour * 3600) + (this.minute * 60) + this.second);
	return tseconds;
}
public int timeInSeconds(Clock time) {
	int tinsec = time.convertToSeconds();
	return tinsec;
}
public Clock timeTo(Clock time) {
	return new Clock(this.timeInSeconds(time));
}
public boolean isBefore(Clock time) {
	return this.convertToSeconds() < time.convertToSeconds();
}
public String toString() {
	return "Time: " + hour + ":" + minute + ":" + second;
}
public boolean isTimeFormat24() {
	return timeFormat24;
	
}
public void setTimeFormat(int hourFormat) {
	if(hourFormat == 24)
	{
		timeFormat24 = true;
	}
	else if(hourFormat == 12)
	{
		timeFormat24 = false;
	}
	else 
	{
		
	}
}
}
