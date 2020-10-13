
public class Job {
	private String jobName;
	private int monthlySalary;
	private String startDate;
	private String endDate;
	
	public void setName(String n) {
		jobName = n;
	}
	public void setSalary(int s) {
		monthlySalary = s;
	}
	public void setSDate(String sd) {
		startDate = sd;
	}
	public void setEDate(String ed) {
		endDate = ed;
	}
	public String getName() {
		return jobName;
	}
	public int getSalary() {
		return monthlySalary;
		
	}
	public String getStartDate() {
		return startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public double getAnbualSalary() {
		int annualSalary = monthlySalary * 12;
		return annualSalary;
	}

}
