package Package0410;

public class File02_LoopStatement {

	public static void main(String[] args) {
		// 반복문(Loop Statement)
		
		// - 주어진 조건을 만족하는 동안에는 계속 반복한다
		//		-> 조건식을 작성할 수 있어야 한다
		
		// 종류
		//	- for문
		//		특정 값 또는 횟수만큼 반복할 때
		//	- while문
		//		특정 조건을 만족할 때까지 반복할 때
		//	- do-while문
		//		while문과 동일하나 최소 1번은 무조건 수행할 때
		//	- for-each문
		//		배열 또는 컬렉션을 순차탐색할 때
		// ------------------------------------------------
		// while문
		//	- while문의 의미 : ~ 하는 동안
		//	- 특정 조건을 만족하는 동안 계속 반복한다
		//	- 조건에 의해 동작되기 때문에
		//	  만약 조건이 항상 true가 되어지면 '무한루프'에 빠지게 된다.
		//	- while(조건식) { ... }
		//		조건식의 결과가 false가 되면 반복문이 종료되고
		// 		재실행 되지 안흔다.
		//	- 조건식을 작성할 때
		//		A를 만족하는 동안 수행 -> A인 동안에는 수행이 되어야 한다.
		//		B를 만족할 때 까지 수행 -> B일 때는 수행이 되지 않는다.
		// "Hello World!"를 다섯 번 출력
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		// -> 중복된 코드가 발생
		// -> 다섯번이 고정, 원하는 수만큼 출력할 수 없다.
		System.out.println("--------------------");
		
		// 출력횟수가 5번이 될 때까지 반복 출력
		int count = 0;
		
		// 출력횟수가 0부터 해서 5가 될 때 까지
		while(count < 5) {
			System.out.println("Hello World!");
			count++;
		}
		
		
	}
}
