package Package0409;

import java.util.Scanner;

public class Example05_if {

	public static void main(String[] args) {
		// 0 이상의 정수를 입력을 받고
		// 짝수(Even)인지 홀수(Odd)인지 출력
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			System.out.print("Input num : ");
			num = sc.nextInt();
			if(num < 0)	 {
				System.out.println("Try again");
				continue;
			}
			else {
				break;
			}
		}
		if ((num % 2 == 0) && (num != 0)) {
			System.out.println("num is Even");
		}
		else if (num % 2 == 1) {
			System.out.println("num is Odd");
		}
		else { // num == 0;
			System.out.println("num is Zero");
		}
		
	}
}
