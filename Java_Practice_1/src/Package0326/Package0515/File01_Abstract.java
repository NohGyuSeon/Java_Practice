package Package0515;


// 추상(Abstract)
//	- 여러 가지 사물이나 개념에서 공통되는 특성이나 속성을
//	  추출하여 파악하는 작용

// 추상 클래스(Abstract Class)
//	- 기존의 클래스는 "제품을 만들기 위한 설계도" 였다면
//  - 추상 클래스는 "제품을 만들기 위한 미완성 설계도" 
//		→ 개발이 덜 된 설계도가 아닌
//		→ 구체적이지 않은 기능을 가진 설계도를 의미
//	- 기존의 클래스의 형태를 가지며 추가적으로
//	  추상 메서드(Abstract Method)를 포함할 수 있다.

// 추상 메서드(Abstract Method)
//  - 구체적이지 않은 기능 = 추상적인 기능
//	- 모든 하위 클래스들이 가지는 기능이지만
//	  상위 클래스에서 구체적으로 구현할 수 없는 기능
//		= 하위 클래스에 반드시 작성은 되어지며
//		  각 클래스마다 구현되는 내용이 다를 때 사용

// 추상 클래스 = 동물
// 일반 클래스 = 동물 하위의 고양이, 참새, 송사리 등

// 추상 메서드 = 이동하기
//			   = 각 동물은 이동을 할 순 있지만,
//				 모두 다른 방식으로 이동한다.
//-----------------------------------------------------------
// 추상 클래스의 특성
//  - 미완성 설계도로 제품을 만들 수 없듯이
//	  추상 클래스로 인스턴스를 생성할 수 없다.
//  → 하위 클래스가 상속하여 설계도를 완성하는데 사용된다.
//  → 하위 클래스도 완성을 못한다면 해당 클래스도 추상 클래스가 된다.

// 추상 메서드의 특성
//	- 선언부만 있으며 구현부(몸체)는 없이 정의된다.
//  - 하위 클래스에서 오버라이딩을 통해 구현된다.
//  - 하위 클래스에서 반드시 구현되어야 하며
//    구현하지 않은 경우 해당 클래스도 추상 클래스가 된다.
//  - 추상 메서드를 선언함으로써 하위 클래스에서 구현을 하지 않는
//    실수를 방지할 수 있다.
//-----------------------------------------------------------
// 추상 클래스 & 추상 메서드 선언
//  - 선언부에 abstract 제어자를 작성

// 추상 클래스
abstract class AbstractClass {
	// 기존의 클래스처럼 필드와 메서드를 정의할 수 있다.
	String name;
	int value;
	
	void print() {
		System.out.println("name : " + value);
	}
	
	// 하위 클래스가 가질 메서드를
	// 추상 메서드로 선언
	abstract void abstractMethod();
}

// 추상 클래스를 상속받는 클래스
class Sub01 extends AbstractClass {

	@Override
	void abstractMethod() {
		System.out.println("abstractMethod() called by Sub01!");
	}
}

public class File01_Abstract {
	public static void main(String[] args) {
		// AbstractClass abs1 = new AbstractClass();
		// 추상 클래스의 인스턴스를 생성할 수 없다.
		
		Sub01 sub01 = new Sub01();
		
		sub01.name = "Sub01";
		sub01.value = 2000;
		sub01.print();
		sub01.abstractMethod();
		
		// 추상 클래스의 참조 변수는 선언이 가능하다.
		AbstractClass abs1 = sub01; // 업 캐스팅
		abs1.abstractMethod();		// 동적 바인딩의한 호출
	}
}




















