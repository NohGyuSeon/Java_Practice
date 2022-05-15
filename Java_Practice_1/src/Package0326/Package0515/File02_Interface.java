package Package0515;


// 인터페이스(Interface)
//  : 사물과 사물 또는 사물과 인간 사이의 상효작용(소통)을 위해 만들어진 매개채 또는 규격

// Java의 인터페이스
//	: 클래스(객체)들이 가져야할 규격을 정의한 타입
//  : 추상 클래스의 극단적인 형태를 가진다.
//		→ 추상 메서드와 상수를 가질 수 있다.
//		→ JDK1.8 이후에 일반 메서드로 가질 수 있다.
//   → 상호작용을 위한 것들을 정의만 한 타입
//  : 클래스에 구현할 메서드들의 집합체
//  : 구현이 된 것이 없이 밑그림만 있는 '기본 설계도'

//	: 한 클래스에는 다수의 인터페이스를 구현할 수 있다.
//  : 인터페이스는 다른 인터페이스를 상속을 받을 수 있으며
//	  extends 키워드를 사용한다.
//  : 인스턴스를 생성할 수 없다.
//	: 참조 변수 선언이 가능하며, 캐스팅 및 오버라이딩도 가능하다.
//---------------------------------------------------------------------------------------

interface InterfaceA {
	// 기본 제어자들이 클래스하고는 다르다.
	
	public static final int CONSTANT_NAME = 10;
	// public static final 이 기본 타입이다.
	// public static final 생략이 가능
	
	void abstractMethod();
	// public abstract가 기본 타입
	// public abstract 생략 가능
	
	// 인터페이스에서 일반 메서드를 작성할 때는
	// 선언부에 default 제어자를 작성해야한다. 
	public default void defaultMethod() {
		// public 기본 타입이며 생략 가능
	}
}

interface InterfaceB { }

interface InterfaceC extends InterfaceA, InterfaceB { }

// 인터페이스는 클래스에 의해 구현이 되어야한다.
class Sub02 implements InterfaceA, InterfaceB {

	
	
	@Override
	public void abstractMethod() {
		
	}
	
}

public class File02_Interface {
	public static void main(String[] args) {
		
	}
}









