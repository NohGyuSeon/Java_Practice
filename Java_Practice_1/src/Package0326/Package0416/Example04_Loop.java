package Package0416;

import java.util.Scanner;

public class Example04_Loop {
	public static void main(String[] args) {
		
		// 사용자가 0을 입력할 때 까지
		// 정수를 계속 입력받아 합을 출력
		// 음수를 입력받으면 다시 입력을 받도록 한다.
		
		// do-while 문을 이용하지 않고
		// 원하는 흐름을 작성할 수 있다.
		//  → 무한 루프
		
		Scanner input = new Scanner(System.in);
		int total = 0;
		while(true) { // 조건식이 항상 참이기 때문에 무한으로 반복
			// 입력
			System.out.print(">>> ");
			int n = input.nextInt();
			
			// 검사
			if(n == 0) break;
			if(n < 0) continue;
			
			// 연산
			total += n;
			
			// 출력
			System.out.println("Current Total : " + total);
		}
		System.out.println("Final Total : " + total);
		
		input.close();
	}
}
















