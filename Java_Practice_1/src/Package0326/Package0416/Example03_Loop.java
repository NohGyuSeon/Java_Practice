package Package0416;

import java.util.Scanner;

public class Example03_Loop {
	public static void main(String[] args) {
		// 사용자가 0 을 입력할 때까지
		// 정수를 계속 입력받아 출력
		Scanner input = new Scanner(System.in);
		
		// 검사
		// 입력
		// 출력
		
		// while(/*입력받은 값이 0인지 검사*/) {
			// 입력
			// 출력
		// }
		int n = 0;
		do {
			n = input.nextInt();
			System.out.println("n : " + n);
		}while( n!=0 );
		
		
		input.close();
	}
}















