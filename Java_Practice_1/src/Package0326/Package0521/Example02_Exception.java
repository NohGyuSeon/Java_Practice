package Package0521;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Example02_Exception {

	public static void main(String[] args) {
		Random r = new Random();
		
		// 50개의 0 이상 100 이하의 정수를 저장하는 배열
		// 5개의 원소를 임의로 선택해서 평균을 출력
		// 선택의 기준 : 사용자가 인덱스를 입력
		// 예외가 발생하면 기존에 선택된 요소들은 유지
		
		int [] numbers = new int[50];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(101);
		}
		System.out.println("랜덤 수 배열 생성을 완료했습니다.");
		
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		double avg;
		
		// 유효한 원소들을 저장하기 위한 배열
		final int Max = 5;
		int [] arr = new int[Max];
		for (int i = 0; i < arr.length; i++) {
			try {
				System.out.print("Enter " + (Max - i) + "integers from 0 to 49 >>> ");
				num = sc.nextInt();
				arr[i] = numbers[num];
			} catch (ArrayIndexOutOfBoundsException|InputMismatchException e) {
				sc.nextLine();
				// 유효하지 않은 값인 경우에는
				// 카운트가 증가하면 안되기 때문에 (-1)을 해야한다.
				i--;
			} 
		}
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		avg = sum / 5;
		System.out.println("임의의 원소 값들의 평균은 " + avg);
	  
		sc.close();
	}
	  
}
