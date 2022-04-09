package Package0409;

import java.util.Scanner;

public class Example03_if {

	public static void main(String[] args) {
		// 양수를 하나 입력을 받고
		// 홀수인지 짝수인지 출력하는 프로그램을 작성
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			System.out.print("양수를 하나 입력하세요 : ");
			num = sc.nextInt();
			if(num < 0)	 {
				System.out.println("다시 입력하세요.");
				continue;
			}
			else {
				break;
			}
		}
		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		
		sc.close();
	}
}
