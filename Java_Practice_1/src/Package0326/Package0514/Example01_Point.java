package Package0514;

// 좌표(Point)를 표현하는 클래스를 작성
//  필드(private 로 선언)
//	  	x
//	  	y
//  생성자
//		기본 생성자
//		x, y 초기화 하는생성자
//  Getter & Setter
//	메서드
//		좌표를 출력하는 메서드

// 색상이 있는 좌표(ColorPoint)를 표현하는 클래스를 작성
//  → Point 클래스를 상속
//  필드 
//		color : 기본 값 = "black"
//  생성자
//		기본 생성자
//      x, y 만 초기화하는 생성자
//		color 만 초기화하는 생성자
//		x, y, color 초기화하는 생성자
//	Getter & Setter

// 이름이 있는 좌표(NamedPoint)를 표현하는 클래스를 작성
//  → Point 클래스를 상속
// 	필드 
//		name : 기본 값 = "Unknown"
//	생성자
//		기본 생성자
//  	x, y 만 초기화하는 생성자
//		name 만 초기화하는 생성자
//		x, y, name 초기화하는 생성자
//	Getter & Setter

public class Example01_Point {
	
	// 좌표를 출력하는 메서드를 작성
//	static void print(NamedPoint p) {
//		p.print();
//	}
//	static void print(ColorPoint p) {
//		p.print();
//	}
	// Point 클래스의 객체 뿐만 아니라
	// Point 클래스를 상속 받는 하위 클래스의 객체도 참조할 수 있다.
	static void print(Point p) {
		p.print();
	}
	
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
		// 아래 코드가 정상적으로 동작되도록 작성
		Point p1 = new Point(10, 20);
		ColorPoint p2 = new ColorPoint(15, 20, "red");
		NamedPoint p3 = new NamedPoint(20, 55);
		
		print(p1);
		print(p2);
		print(p3);
		
		double dist1 = getDistance(p1, p2);
		System.out.println("dist1 = " +dist1);
		double dist2 = getDistance(p2, p3);
		System.out.println("dist2 = " +dist2);	
	}
}









