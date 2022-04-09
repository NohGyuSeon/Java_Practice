package Package0409;

import java.util.Scanner;

public class Example06_if {

	public static void main(String[] args) {
		// 정수를 입력을 받고
		// 아래 조건에 따른 결과 값을 출력
		//	- 3의 배수인 경우 : Fizz
		//	- 5의 배수인 경우 : Buzz
		//	- 3의 배수이면서 5의 배수인 경우 : FizzBuzz
		//	- 그 외인 경우 : 입력받은 정수 그대로
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Integer : ");
		int num = sc.nextInt();
		if (num > 0) {
			if (num % 3 == 0 && num % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if (num % 3 == 0) {
				System.out.println("Fizz");
			}
			else if (num % 5 == 0) {
				System.out.println("Buzz");
			}	
		}
		else { // 3의 배수이거나 5의 배수가 아닌 경우
			System.out.println(num);
		}
		
		sc.close();
	}
}
