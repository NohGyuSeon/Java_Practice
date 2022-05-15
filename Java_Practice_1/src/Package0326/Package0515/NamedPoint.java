package Package0515;

public class NamedPoint extends Point {
	private String name;
	public static final String DEFAULT_NAME = "unknown";
	
	public NamedPoint() { 
		this(0, 0, DEFAULT_NAME);
	}
	public NamedPoint(int x, int y) { 
		this(x, y, DEFAULT_NAME);
	}
	public NamedPoint(String name) { 
		this(0, 0, name);
	}
	public NamedPoint(int x, int y, String name) { 
		super(x, y);
		setName(name);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null || name.isEmpty()) 
			name = DEFAULT_NAME;
		this.name = name;
	}
	
	public void print() {
		String pointer = String.format("%s",name);
		System.out.print(pointer);
		super.print();
		// 상위 클래스에 좌표를 출력하는 메서드가 있기 때문에
		// 이를 활용하자!
	}
	
	@Override
	public String toString() {
		String pointer = String.format("%s(%d, %d)",name, getX(), getY());
		return pointer;
	}
}








