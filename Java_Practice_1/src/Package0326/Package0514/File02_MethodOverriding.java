package Package0514;


// 메서드 오버라이딩(Method Overriding)
//	- 상위 클래스의 메서드를 하위 클래스에 맞추서 재 작성
//  - 재작성되었기 때문에 상위 클래스의 메서드는 호출되지 않는다.
//  - 메서드를 호출할 때 하위 클래스의 오버라이딩된 메서드를 호출
//		→ 참조 변수가 기준이 아닌 인스턴스를 기준으로 한다.

// 메서드 오버라이딩의 조건
//	- 메서드의 이름이 같아야 한다.
//  - 매개변수의 타입과 개수가 일치해야한다.
//  - 반환 타입이 일치해야한다.
//  - 접근 지정자는 상위 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
//	- static 제어자의 유무는 변경할 수 없다.
//  - 예외(Exception)은 상위 클래스의 메서드보다 넓은 범위로 선언할 수 없다.

// super 레퍼런스
//  - 상위 클래스의 인스턴스를 참조하는 주소
//  - 오버라이딩을 통해 접근할 수 없는 상위 메서드에 접근할 수 있다.
//  - 상위 클래스의 멤버와 식별자 같은 경우에는
//	  하위 클래스의 멤버가 우선순위가 높기 때문에
//	  상위 클래스의 멤버에 접근할 때 사용된다.

class Super02 {
	// 해당 클래스의 이름을 출력하는 메서드
	public void printClassName() {
		System.out.println("Class Name : Super02");
	}
	
	// Object 클래스에 정의된 toString() 메서드를
	// 오버라이딩하여 재 정의
	public String toString() {
		return "Class Name : Super02";
	}

}

class Sub02 extends Super02 {
	// 해당 클래스의 이름을 출력하는 메서드
	//  → 동일한 이름을 가진 메서드가 상위 클래스에 있다.
	//  → 해당 클래스만의 값을 출력을 하고 싶다.
	public void printClassName() {
		super.printClassName();
		// 상위 클래스의 printClassName() 메서드를 호출
		
		System.out.println("Class Name : Sub02");
		
	}
	
	public String toString() {
		return super.toString() + "\n" + "Class Name : Sub02";
	}
}
public class File02_MethodOverriding {
	public static void main(String[] args) {
		Super02 sup1 = new Super02();
		Sub02 sub1 = new Sub02();
		
		
		sup1.printClassName();
		sub1.printClassName();
		System.out.println("----------------------");
		// 상위 클래스로 캐스팅
		Super02 sup2 = sub1; // 업 캐스팅
		
		// 상위 클래스의 참조 변수로
		// printClassName() 메서드를 호출을 할 때
		// 인스턴스에 오버라이딩된 메서드가 있기 때문에
		// 오버라이딩된 메서드를 호출하여 실행한다.
		// → 동적 바인딩(Dynamic Binding)
		//		: 프로그림 실행 도중에 값 또는 타입, 메서드가 결정되는 바인딩
		//		: 참조 변수가 어떤 인스턴스를 참조하느냐에따라
		//		  호출되는 메서드가 달라지기 때문에 프로그램의 상황에 따라
		//		  호출되는 메서드가 결정된다.
		sup2.printClassName();
		System.out.println("------------------------");
		// toString() 메서드
		//  : Object 클래스에 정의된 메서드
		//  : 객체를 문자열로 변환하는 기능을 의미
		//  : Object 에서 구현된 기능은 클래스의 타입과 주소를 문자열로 반환
		System.out.println(sup1); // = Package0514.Super02@5e91993f
		System.out.println(sup1.toString());
		// println() 메서드 에서는 모든 클래스의 객체가 toString() 을 가지기 때문에
		// toString() 을 호출하여 출력한다.
		
		System.out.println(sup2);
		
		System.out.println("sup1 >>> " + sup1);
		
	}
}











