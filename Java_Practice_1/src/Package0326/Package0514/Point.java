package Package0514;

public class Point {
	private int x;
	private int y;
	
	Point() {
		this(0, 0);
	}
	Point(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void print() {
		String pointer = String.format("(%d, %d)",x, y);
		System.out.println(pointer);
	}
}















