package Package0514;

// 다형성(Polymorphis)
//  - 여러가지 형태를 가질 수 있는 특성
//	- 메서드 오버로딩(Method Overloading)
//		: 같은 이름의 메서드를 매개변수의 따라 정의(메서드 복사)
//	- 메서드 오버라이딩(Method Overriding)
//		: 상위 클래스에 정의된 메서드를 하위 클래스에서 재정의
//	- 캐스팅(Casting)
//		: 한 타입의 참조 변수로 여러 타입의 객체를 참조

// 참조 변수의 형 변환 = 캐스팅
//  - 기본 자료형의 형 변환과 같이
//    참조 변수도 형 변환이 가능하다.
//  - 상속 관계에 있는 클래스 사이에서만 가능하다.
//  - 자동 형 변환과 강제 형 변환처럼 캐스팅을 생략하거나 지정할 수 있다.
//		서브 클래스 타입 → 슈퍼 클래스 타입 : Up-Casting, 자동 변환
//			: "고양이"는 "동물" 이다.
//		슈퍼 클래스 타입 → 서브 클래스 타입 : Down-Casting, 강제 변환
//			: "동물"은 "고양이"다.


class Super01 {
	String name;
	
	void print() {
		System.out.println("name : " + name);
		System.out.println("No Data");
	}
}

class Sub01 extends Super01 {
	int data;

	void print() {
		System.out.println("name : " + name);
		System.out.println("data : " + data);
	}
}

class Sub01_2 extends Super01 {
	int data;
	
	void print() {
		System.out.println("name : " + name);
		System.out.println("data : " + data);
	}
}

public class File01_Casting {
	
//	int sum(int a, int b) {
//		return a + b;
//	}
	
	double sum(double a, double b) {
		return a + b;
	}
	
	// Super01 클래스의 객체 뿐만 아니라
	// Super01 클래스를 상속 받는 하위 클래스의 객체도
	// 전달 받을 수 있다.
	static void print(Super01 sup) {
		/*
		System.out.println("name : " + sup.name);
		
		if(sup instanceof Sub01) {
			Sub01 sub = (Sub01)sup;
			System.out.println("data : " + sub.data);
		}else if(sup instanceof Sub01_2) {
			Sub01_2 sub = (Sub01_2)sup;
			System.out.println("data : " + sub.data);
		}else if(sup instanceof Super01) {
			// 상위 클래스의 타입은 마지막에 검사하는 것이 좋다.
			// 하위 클래스에는 상위 클래스의 타입이 있기 때문.
			System.out.println("NoData");
		}
		*/
		// 메서드 오버라이딩을 이용하여
		sup.print();
	}
	
	public static void main(String[] args) {
		// Sub01 클래스의 객체 생성
		Sub01 sub01 = new Sub01();
		sub01.name = "Sub01";
		// Super01 클래스 타입의 참조 변수로 참조
		Super01 sup01 = sub01; // 업 캐스팅, 자동 변환
		// → 참조 변수 sub01 에 저장된 값은 Sub01 클래스의 객체의 주소
		// → 참조 변수 sup01 에 전달된 값은 Sub01 클래스의 객체의 주소
		// → 즉, 두 참조 변수의 타입은 달라도 같은 객체를 참조한다.
		// → 참조 변수 sup01 은 Super01 클래스의 멤버만 사용 가능하다. 
		//	 즉, 객체의 멤버에 접근하는 범위가 제한된다.
		
		// 업 캐스팅
		//  - 서브 클래스 타입에서 슈퍼 클래스 타입으로 변환
		//  - 서브 클래스에는 슈퍼 클래스의 멤버를 그대로 가지고 있기 때문에
		//	  서브 클래스는 슈퍼 클래스로 표현이 가능하다.
		//  → 서브 클래스의 멤버 >= 슈퍼 클래스의 멤버
		
		print(sup01);
		print(sub01); // 업 캐스팅이 되어 전달된다.
		Sub01_2 sub02 = new Sub01_2();
		print(sub02);
		//------------------------------------------------------------------
		// Super01 클래스의 참조 변수의 값을
		// Sub01 클래스의 참조 변수에 전달
		Sub01 sub03 = (Sub01)sup01; // 다운 캐스팅, 강제 변환
		
		// 다운 캐스팅을 통해 하위 클래스의 멤버가
		// 새로 생기거나 바뀌지 않는다.
		// → 접근할 수 있는 범위가 늘어나게 된다.
		
//		Sub01_2 sub04 = (Sub01_2)sup01;
		// 오류 발생
		// → Sub01_2 의 영역이 없기 때문에 캐스팅 할 수 없다.
		
		// → 다운 캐스팅의 조건
		//		: 상위 클래스의 참조 변수가 업 캐스팅된 변수여야한다.
		
		Super01 sup02 = new Super01();
//		Sub01 sub05 = (Sub01)sup02;
		// 오류 발생
		// → Sub01 클래스의 영역이 없다.
		//-------------------------------------------------------------
		// 다운 캐스팅을 할 때 문법상으로는 문제가 되진 않으나
		// 실제 인스턴스의 멤버에 따라 오류가 발생할 수 있다.
		// → 참조하고 있는 인스턴스의 타입을 검사한 후에
		//   다운 캐스팅을 해야한다.
		// → instanceof 연산자
		
		if(sup02 instanceof Sub01) {
			System.out.println("캐스팅 가능");
		}else {
			System.out.println("캐스팅 불가능");
		}
		
		if(sup01 instanceof Sub01) {
			System.out.println("캐스팅 가능");
		}else {
			System.out.println("캐스팅 불가능");
		}
	}
}









