package Package0402;

import java.util.Scanner;

public class Example01_Input {

	public static void main(String[] args) {
		// 자신의 이름과 나이를 입력을 받아서
		// 변수에 각각 저장한 다음 출력하는
		// 프로그램을 작성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();

		System.out.println("이름은 : " + name + ", 나이는 : " + age);
		
	}
}
