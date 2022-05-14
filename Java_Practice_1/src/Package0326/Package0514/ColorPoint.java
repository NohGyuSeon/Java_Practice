package Package0514;

public class ColorPoint extends Point{
	private String color;
	// 기본 색상을 상수로 표현
	public static final String DEFAULT_COLOR = "black";
	
	public ColorPoint() {
		this(0, 0, DEFAULT_COLOR);
	}
	public ColorPoint(int x, int y) {
		this(x, y, DEFAULT_COLOR);
	}
	public ColorPoint(String color) {
		this(0, 0, color);
	}
	public ColorPoint(int x, int y, String color) {
		// 상위 클래스의 생성자를 지정하여 호출
		super(x, y);
		setColor(color);
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		if(color == null || color.isEmpty())
			color = DEFAULT_COLOR;
		this.color = color;
	}
	public void print() {
		String pointer = String.format("%s(%d, %d)",color, getX(), getY());
		System.out.println(pointer);
	}
}
