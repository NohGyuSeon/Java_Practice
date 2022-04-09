package Package0409;

public class File02_ConditionalStatement {

	public static void main(String[] args) {
		// 제어문(Control Statement)
		//	- 프로그램의 흐름은 보통 작성된 순서에 맞춰 수행한다
		//	- 이러한 흐름을 제어하기 위한 구문이 '제어문'이다
		//	- 제어문 뒤에는 제어할 명령어 또는 블록이 작성된다
		//		다수의 명령어를 제어해야 할 경우 블록으로 작성
		//	- 제어할 명령어/블록은 들여쓰기를 할 필요가 있다
		// - 제어문의 종류
		//		- 조건문 (Conditional Statement)
		//			: if, if-else, if-else if, switch
		//		- 반복문(Loop Statement)
		//			: for, while, do-while, for-each
		// ---------------------------------------------------------
		// 조건문 (Conditinal Statement)
		// - 조건(상황)에 따라 분기를 나눌 때 사용하는 제어문
		// - 조건식에 의해 나누는 if 문과
		//	값에 의해 나누는 switch 문이 있다
		
		int a = 15;
		System.out.println("-------------------------");
		// 단순 if 문
		//	- 특정 조건을 만족할 경우에만 수행할 때 사용
		
		// 만약 a가 10보다 크면 "10보다 큽니다."를 출력
		if(a>10) {
			// 조건식의 결과가 true인 경우에만 수행된다
			// false이면 그냥 넘어간다 
			System.out.println("10보다 큽니다");
		}
		System.out.println("-------------------------");
		// if-else 문
		//	- 단순 if 문 뒤에 else 구문이 추가된 조건문
		//	- else : '또 다른', '그 밖에 다른'
		//	- 앞의 if 문의 조건식이 false 일 때 수행된다
		//	- else 구문에는 조건식을 절대 작성하지 않습니다
		
		// 만약 a가 10보다 크면 "10보다 큽니다."를 출력하고
		// 그렇지 않으면 "10보다 크지 않습니다."를 출력
		if (a > 10) {
			System.out.println("10보다 큽니다.");
		}
		else {
			// 위의 조건식의 결과가 false 일 때 수행
			System.out.println("10보다 크지 않습니다.");
		}
		System.out.println("-------------------------");
		// 중첩 조건문
		//	- 조건문 내에 또 다른 조건문을 작성한 형태
		//	- 중첩 횟수는 제한이 없지만, 중첩될수록 가독성이 떨어질 수 있다
		
		// 만약 a가 10보다 크면 "10보다 큽니다."
		// 그렇지 않고 10보다 작으면 "10보다 작습니다" 를 출력하고
		// 그렇지 않으면 "10과 같습니다" 를 출력
		
		if (a > 10) {
			System.out.println("10보다 큽니다.");
		}
		else {
			System.out.println("10보다 크지 않고 ");
			if(a < 10) {
				System.out.println("10보다 작습니다.");
			}
			else {
				System.out.println("10과 같습니다.");
			}
		}
		System.out.println("-------------------------");
		// if-else if 문
		//	- 조건식을 작성할 수 없던 else 구문에 if 문을 추가하여
		//		또 다른 조건식을 작성할 수 있도록 하는 구문이다
		//	- else if 문의 제한이 없다
		
		// 만약 a가 10보다 크면 "10보다 큽니다."
		// 그렇지 않고 10보다 작으면 "10보다 크지 않고 10보다 작습니다." 를 출력하고
		// 그렇지 않으면 "10보다 크지 않고 10과 같습니다." 를 출력
		if (a > 10) {
			System.out.println("10보다 큽니다.");
		}
		else if (a < 10) {
			System.out.println("10보다 크지 않고 ");
			System.out.println("10보다 작습니다.");
		}
		else if (a == 10) {
			System.out.println("10보다 크지 않고 ");
			System.out.println("10과 같습니다.");
		}
		else { // -> 위의 모든 조건식이 false 인 경우
			// ...
		}
		System.out.println("-------------------------");
		
		
		
	}
}
