package Package0416;

public class File01_Loop {
	public static void main(String[] args) {
		// 반복문
		//  - 코드를 반복 수행하기 위한 제어문
		
		// for문
		//  - 특정 횟수, 범위와 같이 값에 의해 반복하는 제어문
		//  - 구조 설명
		//		- 초기식 : for 문에서 사용할 변수를 선언/초기화
		//				 : 다수의 변수를 선언이 가능하나 하나의 타입만 가능
		//				 : 선언된 변수는 반복문이 끝나면 사라짐.
		//		- 조건식 : for 문을 수행하기 위한 조건식
		//		- 반복 후 작업 : 초기식에서 선언된 변수를 조작(증감)
		//					   : 쉼표를 구분으로 다수의 명령어를 작성할 수 있다.
		
		// "Hello World!" 를 다섯번 출력
		//  - 카운팅을 저장하기 위한 변수
		//  - 카운팅 검사
		//  - 카운팅 연산
		
		// while 문으로도 카운팅을 할 수 있다.
		//  → 단, 카운팅을 하기 위한 식들이 모두 분리되어있다.
		int count = 0;
		while(count < 5) {
			System.out.println("Hello World!");
			count++;
		}
		System.out.println("---------------------------");
		// 위의 분리된 코드를 for문은 한 번에 처리할 수 있다.
		// → 제어문 중에서 구조는 제일 복잡하다.
		
		//  - 초기식 : 카운팅을 저장하기 위한 변수
		//  - 조건식 : 카운팅 검사
		//  - 반복 후 작업 : 카운팅 연산 
		//				     지정된 기능(코드)가 수행된 다음에 연산
		for(int cnt = 0; cnt < 5; cnt++, System.out.println("cnt >>> " + cnt)) {
			int p1 = 10;
			// → cnt 의 값이 0부터 5가 될 때까지 1씩 증가하는 반복문
			System.out.println(cnt + " : Hello World!");
		}
		
		// System.out.println("cnt : " + cnt);
		//-------------------------------------------------------------
		System.out.println("-------------------------");
		// do-while 문
		//  - while문처럼 조건에 의해 반복 수행하는 제어문
		//  - 차이점
		//		조건식의 위치가 다름
		//		  while    : 선검사 후실행 → 최소 0번 실행
		//		  do-while : 선실행 후검사 → 최소 1번 실행
		count = 0;
		do {
			System.out.println("Hello World!");
			count++;
		}while(count < 5);
	}
}


















