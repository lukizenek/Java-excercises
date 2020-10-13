
public class PointTest {

	public static void main(String[] args) {
		Point point1 = new Point(2,2);
		Point point2 = new Point(4,6);
		System.out.print(point1);
		System.out.print(point2);
		point1.move(2, 2);
		System.out.print(point1);
		point2.moveTo(3,7);
		System.out.print(point2);
		int distY = (point2.getY() - point1.getY());
		int distX = (point2.getX() - point1.getX());
		double dist = Math.sqrt(((distX * distX) + (distY * distY)));
		System.out.println(dist);

	}

}
