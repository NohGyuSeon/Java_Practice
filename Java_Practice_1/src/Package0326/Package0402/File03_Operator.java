package Package0402;

public class File03_Operator {

	public static void main(String[] args) {
		// 연산자(Operator)
		// - 연산 : 주어진 식을 계산하여 
		// - 연산을 하기 위한 문자
		// - 연산자의 피 연산자의 타입은 일치하며
		//	 결과 값 또한 타입이 일치한다
		
		// 산술 연산자
		// - 덧셈(+), 뺄셈(-), 곱셈(*), 나눗셈(/), 나머지(%)
		// - 나눗셈과 나머지 연산자의 활용도가 높다
		//		- 배수를 판단
		//		- 단위 변환/분할
		//		- 그룹화
		int a = 10;
		int b = 7;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		// 정수 / 정수 = 정수
		// 실수 / 실수 = 실수
		System.out.println(a % b);
		//----------------------------------------
		// 형 변환(타입 변환)
		//	- 기본 자료형의 타입을 다른 타입으로 변환
		//	- 자동 형 변환 
		//		: 컴파일러에 의해 형 변환이 이루어진다
		//		: 피 연산자의 타입이 맞지 않는 경우
		//		: 타입의 크기가 작은 타입에서 큰 타입으로 변환
		//		: 정수에서 실수형으로 변환
		//			-> byte < short < int < long < float < double
		//	- 강제 형 변환
		//		: 개발자에 의해 형 변환이 이루어진다
		//		: 컴파일러가 해주지 않는 경우
		//			- 연산자의 타입이 일치하는데
		//			  다른 타입으로 해야하는 경우
		//			- 크기가 큰 타입에서 작은 타입으로 변환
		//		: 데이터(또는 변수) 앞에 '(타입)'을 명시
		System.out.println(10 / 2.5);
		// System.out.println(10.0 / 2.5);
		
		double res1 = (double)a / b;
		// = 실수 / 정수
		// = 실수 / 실수
		// = 실수
		System.out.println(res1);
	}
}
