package Package0521;

class Simple {
	String name;
	int data;
	Simple(String name, int data) {
		this.name = name;
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 무엇으로 같은 객체인지 기준을 정해야한다.
		// 즉, 모든 필드가 같을 필요는 없다.
		//------------------------------------------
		if(obj == null) return false;
		if(this == obj) return true;
		if(!(obj instanceof Simple)) return false;
		
		Simple s = (Simple)obj;
		
		// 하나라도 다르면 false
		
		// name을 검사
		if(!name.equals(s.name)) return false;
		
		// data를 검사
		// if(data != s.data) return false;
		 
		return true;
	}

	@Override
	public String toString() {
		return name + "(" + data + ")";
	}
}

public class File03_Object {

	public static void main(String[] args) {
		// Object 클래스
		//	- Java의 모든 클래스들의 최상위 클래스
		//	- 모든 객체는 Object 클래스의 멤버를 가지게 되며
		//	  Object 클래스로 캐스팅 될 수 있다.
		
		// Object 클래스의 주 메서드
		//	- String toString() : 객체의 정보를 문자열로 반환
		//	- boolean equals()  : 같은 객체인지 비교
		//	- int hashCode()    : 객체를 해시코드로 변환하여 변환
		//	- void notify()		: 대기 중인 스레드를 활성화
		//	- void wait()		: 다른 스레드가 활성화 해줄 때까지 대기
		// -------------------------------------------------------
		
		Simple s1 = new Simple("Simple01", 1000);
		Simple s2 = new Simple("Simple02", 1000);
		
		// s1과 s2가 같은 객체인가?
		// 같은 객체의 기준이 무엇이냐
		//	- 인스턴스가 같은 객체인가
		//	- 필드의 값만 다른 객체인가
		if(s1 == s2) { } // → 같은 인스턴스인 경우에만 true
		
		if(s1.equals(s2)) { }
		// → equals() 메서드를 오버라이딩하지 않으면
		//	 Object 클래스에 정의된 메서드가 호출이 된다.
		//		→ 같은 인스턴스인지만 검사
		// → 인스턴스 여부 상관 없이 필드의 값이 같은지 비교하려면
		//   해당 메서드를 오버라이딩하면 된다.
	}
}
