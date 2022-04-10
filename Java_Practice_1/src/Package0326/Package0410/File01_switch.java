package Package0410;

public class File01_switch {
	public static void main(String[] args) {
		// switch 문
		//  - 조건문 중의 하나이며
		//  - if 문과는 달리 값에 의해 분기가 나뉜다.
		//  - 또한, 모든 분기를 하나의 블록으로 해결한다.		 
		
		// 제약 조건
		//  - 다룰 수 있는 데이터의 타입이 한정적이다.
		//    → 정수, 문자, 문자열(JDK 1.7 이상)만 다룰 수 있다.
		//  - case 문의 값을 지정할 때는
		//	  → 변수, 실수 리터럴은 불가능하다.
		
		int choice = 3;
		
		switch(choice) {
		case 1: // choice == 1
			System.out.println("Choice Menu 1");
			break; // switch 블록을 탈출
		case 2: // choice == 2
			System.out.println("Choice Menu 2");
			break; // switch 블록을 탈출
		case 3: // choice == 3
			System.out.println("Choice Menu 3");
			break; // switch 블록을 탈출
		default : // 그 외인 경우 = else 
			System.out.println("Not Menu");
		}

		
		
		
		
	}
}
