package Package0402;

import java.util.Scanner;

public class Example02_Input {

	public static void main(String[] args) {
		// 사각형의 너비와 높이를 각각 입력 받아서
		// 사각형의 넓이를 출력하는 프로그램을 작성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사각형의 너비를 입력하세요 : ");
		double width = sc.nextDouble();
		System.out.print("사각형의 높이를 입력하세요 : ");
		double height = sc.nextDouble();
		
		double area = width * height;

		System.out.printf("사각형의 넓이는 : %.2f\n", area);
	}
}
