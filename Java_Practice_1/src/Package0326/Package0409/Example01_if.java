package Package0409;

import java.util.Scanner;

public class Example01_if {

	public static void main(String[] args) {
		// 정수 하나를 입력을 받아서
		// 정수가 3의 배수이면서 5의 배수이면
		// "3의 배수이고 5의 배수입니다."를 출력하는
		// 프로그램을 작성
		System.out.print("정수 하나를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if ((a % 3 == 0) && (a % 5 == 0)) {
			System.out.println("3의 배수이고 5의 배수입니다.");
		}
		else {
			System.out.println("3의 배수이고 5의 배수가 아닙니다.");
		}
		
		sc.close();
	}
}
