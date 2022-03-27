package Package0327;

public class File02_Literal {

	public static void main(String[] args) {

		// 리터럴(Literal)
		// : 코드 상에 직접 표현된 값
		// : 연산된 값이 아니다
		// : 표현된 값의 타입에 따라 리터럴의 종류도 나뉜다
		System.out.println(10 + 20);
		// 10, 20 : 리터럴
		// 30 : 연산된 값이기 때문에 리터럴이라고 할 수 없다

		// 논리 리터럴
		// - 논리형 데이터를 표현하기 위한 값
		// - 참(true), 거짓(false)
		
		// 정수 형태
		// - 정수 형태 그대로를 표현
		// - 정수 리터럴의 타입은 int 형이다
		System.out.println(2200000000L);
		// int -> long 으로 바뀐다
		// - 정수 리터럴에는 10진수 뿐만 아니라
		System.out.println(10); // 10진수
		// 2진수, 8진수, 16진수를 표현할 수 있다
		// 2진수 : 0과 1로 숫자 한 자리를 표현
		System.out.println(0b0000000011111111);
		// 8진수 : 0 ~ 7로 숫자 한 자리를 표현
		System.out.println(0377);
		// 16진수 : 0 ~ 9, A ~ F로 숫자 한 자리를 표현
		System.out.println(0xFF);
		
		// 실수 리터럴
		// - 소수점을 포함한 숫자를 표현
		// - 실수 리터럴은 자료형 타입이 double 형이다
		System.out.println(3.2313);
		// - e 지수도 표현이 가능하다 (부동 소수점)
		// double : 308자리까지 표현 가능
		// float : 38자리까지 표현 가능
		// 5e-3, 1e300
		System.out.println(5e-3);
		System.out.println(1e5);
		
		// 문자 리터럴
		//  - 하나의 문자를 표현
		//  - 작은 따롬표를 이용하여 하나의 문자를 표현
		System.out.println('A');
		System.out.println('가');
		// - 아스키 코드, 유니 코드로도 표현이 가능
		// -> 문자를 표현하기 위한 코드
		// -> 아스키 코드 : 1byte 로 표현된 코드
		// 			   : 특수 문자, 영어, 숫자 등
		// 			   : 정수형으로 표현(0~255)
		// -> 유니 코드 : 1~4byte 로 표현이 되어지는 코드
		// 			  : 전 세계 언어를 표현할 수 있다
		// 			  : '\u0000' 로 작성되며 16진수 네자리로 이루어진다
		System.out.println('\uAC00');
		
		// -> 이스케이프 문자(Escape Character)
		// - 문자로 표현하기 힘든 문자를 표현해주는 기능 문자
		// - '\' 로 시작하여 기능을 표현하기 위한 문자를 작성
		// - 종류
		// - \' : 작은 따옴표
		// - \" : 큰 따옴표
		// - \\ : 백슬래시 or 원화
		// - \t : tab, Tab
		// - \n : New Line, 개행 문자(엔터)
		System.out.println();
		System.out.println("안녕하세요 \n 저는 \"홍길동\"입니다");
		
		// 문자열 리터럴
		// - 다수의 문자들을 하나의 문구처럼 표현
		// - 큰 따옴표로 묶어서 표현
		/// - String  클래스의 객체로 처리
		System.out.println("Hello Java!");
		
		// null 리터럴
		// - 참조 타입에서 사용되는 리터럴이며
		// - '아무것도 참조하고 있지 않다.' 를 의미
		System.out.println(null + "");
	}

}
