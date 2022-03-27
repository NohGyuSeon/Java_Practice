package Package0327;

public class File01_Data {

	public static void main(String[] args) {

//		데이터(Data)
//		- 프로그램에서 다루는 값
//		- 1, 5, 0, 11, 'A', "Hello" ...
//		
//		자료형(Data Type)
//		- 프로그램에서 다루는 데이터의 종류
//		- 정수, 실수(소수점이 있는 수), 문자, 문자열, 논리
//		- 각 타입의 데이터마다 표현하는 방식과
//		프로그램이 처리하는 방식이 다르다
//		
//		자료형의 종류
//		- boolean : 논리형(true, false)
//		- char : 문자형, 단 하나의 문자를 표현 
//		- byte : 정수형(1byte, -128~127)
//		- short : 정수형(2byte, -32000~32000)
//		- int : 정수형(4byte, -21억~21억)
//		- long : 정수형(8byte, -922경~922경)
//		- float : 실수형 (4byte, 소수점 7자리)
//		- double : 실수형 (8byte, 소수점 16자리)
//	
//		문자열 같은 경우는 기본 자료형이 아닌
//		String 클래스의 타입으로 다룬다
//		
//		참조(Reference) 타입
//		- 기본 자료형 외의 타입
//		- 메모리를 동적으로 할당을 받는 데이터들의 타입
//		- 배열, 객체
//		===================================================
		
//		논리형
//		명제, 조건의 결과를 표현할 때 사용된다
		System.out.println("논리형");
		System.out.println(true);
		System.out.println(3 > 5); // 3이 5보다 크다
	
//		문자형
//		단 하나의 문자를 표현할 때 사용된다
//		하나의 문자를 표현하기 위해서 작은따옴표를 사용한다
//		아스키코드, 유니코드를 지원		 
		System.out.println("문자형");
		System.out.println('A');
		System.out.println( (char)97 );
		System.out.println('\uC548');

		// 정수형
		// 소수점이 없는 수를 표현할 때 사용한다
		// 숫자 그대로 작성하면 된다
		System.out.println("정수형");
		System.out.println(111);
		System.out.println(-50);
		
		// 실수형
		// 소수점이 있ㄴ는 수를 표현할 때 사용한다
		System.out.println("실수형");
		System.out.println(11.5);
		System.out.println(-0.55);
		
		// 문자열 
		// 기본 자료형이 아닌 String 클래스의 타입이며
		// 다수의 문자로 구성된 데이터를 다룰 때 사용된다
		// 문자열을 표현할 때는 큰 따옴표를 사용한다
		// 문자열이랑 키워드, 식별자와는 전혀 다르다
		System.out.println("문자열");
		
		// console 창에 "들어가다"를 출력하라
		// console 창에 들어가다를 출력하라
		System.out.println("들어가다");
		// System.out.println(들어가다);
		// -> "들어가다" 라는 문자열 데이터가 아닌
		// 식별자로 인식되기 때문에 오류가 발생
		
		
		
		

		

		
	}
}
