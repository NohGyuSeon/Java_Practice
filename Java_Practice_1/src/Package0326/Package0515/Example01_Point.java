package Package0515;

public class Example01_Point {
	
	// 임의의 두 좌표를 매개변수로 받아서
	// 두 좌표의 거리를 반환하는 메서드를 작성.
	//  → 거리 = √( (x1-x2)^2 + (y1-y2)^2 )
	static double getDistance(Point p1, Point p2) {
		// x축 거리
		int diffX = p1.getX() - p2.getX();
		// y출 거리
		int diffY = p1.getY() - p2.getY();
		
		
		double distance = Math.sqrt( Math.pow(diffX,2) + Math.pow(diffY, 2) );
		
		return distance;
	}
	
	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		ColorPoint p2 = new ColorPoint(15, 20, "red");
		NamedPoint p3 = new NamedPoint(20, 55);
		
		
		double dist1 = getDistance(p1, p2);
		System.out.println(p1 + "에서 " + p2 +"까지의 거리 = " + dist1);
	}
}





