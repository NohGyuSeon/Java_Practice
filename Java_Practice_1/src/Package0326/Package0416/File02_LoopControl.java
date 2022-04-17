package Package0416;

import java.util.Random;

public class File02_LoopControl {
	public static void main(String[] args) {
		// 그 외 제어문
		//  - 프로그램의 흐름을 제어하는 제어문이 아닌
		//    반복문의 흐름을 제어하는 제어문이 있다.
		//  - 종류
		//		- break		: 반복문을 종료(탈출)
		//		- continue	: 블록을 종료 = 다음 반복으로 넘어간다.
		
		//  - 필요성
		//		- 반복문을 끝까지 수행할 필요가 없는 경우
		//		- 반복 수행 도중에 조건 검사를 하여 종료해야하는 경우
		
		// 난수를 생성하는 클래스의 객체
		//  = 난수 생성기
		Random r = new Random();
		int max = 10; 
		int right = r.nextInt(max); 
		// 0 <= n < max 의 값 중 랜덤한 값을 right 에 저장
		
		for(int n = 0; n < max; n++) {
			System.out.println("checking... ");
			if(n == right) {
				System.out.println("RIGHT ANSWER : " + n);
				// 더 이상 수행할 필요가 없기 때문에
				// 반복문을 종료
				break; // 가장 가까운 반복문을 종료
			}
		}
		//---------------------------------------------------
		System.out.println("==========================");
		
		for(int n = 1; n < 20; n++) {
			if(n % 3 == 0) {
				System.out.println("n : " + n);
			}
		}
		
		System.out.println("-------------------------");
		// continue 문을 통해서
		//  - 주요 기능을 담당하는 로직을
		//    한 블록만큼 뺄 수 있다.
		//  - 예외(오류) 검사와 로직을 분리
		
		for(int n = 1; n < 20; n++) {
			if(n % 3 != 0) continue;
			if(n % 5 != 0) continue;
			
			// 3의 배수인 경우에 출력
			// + 5의 배수인 경우에 출력			
			System.out.println("n : " + n);
		}
	}
}

















