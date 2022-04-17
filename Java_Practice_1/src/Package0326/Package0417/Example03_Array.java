package Package0417;

import java.util.Random;
import java.util.Scanner;

public class Example03_Array {

	public static void main(String[] args) {
		// 정수 n을 입력을 받고
		// n개의 정수를 저장할 배열을 생성한 후
		// n개의 임의의 정수를 배열에 저장한 다음
		// 가장 큰 값과 가장 작은 값을 출력
		
		// 임의의 값
		Random r = new Random();
		
		int max, min;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 n을 입력하세요 : ");
		int n = sc.nextInt();
		int [] array = new int[n];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(100); // 0 <= n < 100 사이의 임의의 값을 반환
		}
		
		max = array[0];
		min = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
			if(min > array[i]) {
				min = array[i];
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
		sc.close();
	}
}
