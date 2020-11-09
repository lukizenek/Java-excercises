
public class Garage {
	private Car car1;
	private Car car2;
	private boolean pos1 = false;
	private boolean pos2 = false;
	
	public Garage() {
		car1 = null;
		car2 = null;
	}
	public boolean isParkingAreaTaken(int pos) {
		if(pos == 1) {
			return pos1;
		}
		else if(pos == 2) {
			return pos2;
		}
		else {
			System.out.println("Error, incorrect position.");
			return false;
		}
		
	}
	public void park(Car car, int position) {
		switch(position){
		case 1:
			car1 = car;
			pos1 = true;
			break;
		case 2:
			car2 = car;
			pos2 = true;
			break;
		default:
			System.out.println("Error");
		
		}
	}
	public Car leaveGarage(int pos) {
		switch(pos){
		case 1:
			if(pos1 != false) {
				car1 = null;
				pos1 = false;
				return car1;
			}
			else {
				return car1;
			}
		case 2:
			if(pos2 != false) {
				car2 = null;
				pos2 = false;
				return car2;
			}
			else {
				return car2;
			}
		default:
			return null;
		
		}
	}

}
