package Package0409;

import java.util.Scanner;

public class Example04_if {

	public static void main(String[] args) {
		// 입력받은 정수가
		// 음수(negative)인지 0인지 양수(positive)인지 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Integer num : ");
		int num = sc.nextInt();
		if (num < 0) {
			System.out.println("num is Negative");
		}
		else if (num > 0) {
			System.out.println("num is Positive");
		}
		else { // 조건식을 생략할 경우에는 주석으로 알려주는 것이 좋다.
			// num == 0;
			System.out.println("num is Zero");
		}

		sc.close();
	}
}
