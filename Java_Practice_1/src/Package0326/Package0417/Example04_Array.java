package Package0417;

import java.util.Scanner;

public class Example04_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 n을 입력하세요 : ");
		int n = sc.nextInt();
		int [] array = new int[n];
		
		// 0 ~ 9의 개수를 저장하기 위한 배열
		int [] count = new int[10];
		// count[0] : 0의 개수
		// count[1] : 1의 개수
		// count[2] : 2의 개수
		// ..
		// count[9] : 9의 개수
		
		while(n > 0) {
			// 첫번째 자리의 숫자
			int r = n % 10;
			
			// r의 개수를 1 증가
			count[r]++;
			
			n /= 10;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(i + "의 개수 = " + count[i]);
		}
		
	}
}
