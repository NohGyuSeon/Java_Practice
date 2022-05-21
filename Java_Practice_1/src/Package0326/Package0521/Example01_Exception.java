package Package0521;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example01_Exception {

	public static void main(String[] args) {
		// 2개의 정수를 입력을 받고
		// 합을 출력하는 프로그램을 작성
		
		// 만약 사용자가 정수가 아닌 문자열을 입력할 경우
		// 다시 두 정수를 입력받도록 예외 처리
		
		int a = 0, b = 0;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("Enter two integers >>> ");
				a = sc.nextInt(); 
				b = sc.nextInt();
				
				// 두 변수의 값이 정상적으로 입력이 이뤄지면
				// 더 이상 반복문을 수행할 필요가 없다.
				break;
			} catch (InputMismatchException e) {
				System.out.println("You must enter an integer.");
				// 정수가 아닌 값이 Scanner 객체에 있기 때문에
				// 이를 비워줘야 한다
				System.out.println("has >>> " + sc.hasNextLine());
				sc.nextLine();
			}
		}
		
		sum = a + b;
		System.out.println(a + " + " + b + " = " + sum);
		
		sc.close();
	}

}
