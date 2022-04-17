package Package0416;

import java.util.Scanner;

public class Homework_0410 {
	public static void main(String[] args) {
		// 정수를 입력을 받고
		// 각 자리의 숫자와
		// 각 자리의 숫자들의 합을 출력
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer >>> ");
		int n = input.nextInt();
		// 1. n 의 특정 자리를 구하기 위한 기준 값을 이용
		int p = 1; // 기준 값
		int v = 0; // 특정 자리의 값
		int total = 0; // 각 자리 숫자의 합
		
//		v = (n / p) % 10;
//		
//		p *= 10;
//		v = (n / p) % 10;
//		
//		p *= 10;
//		v = (n / p) % 10;
		
		// p 의 값이 n 보다 클 때까지 반복 수행
		while(p <= n) {
			v = (n / p) % 10;
			System.out.println(p + "의 자리 = " + v);
			
			// total = total + v;
			total += v; // total 의 값에서 v 만큼 증가 
			
			p *= 10;
		}
		System.out.println("total : " + total);
		System.out.println("---------------------------");
		// 2. n 이 0이 될 때까지 한 자리씩 잘라낸다.
		total = 0;
		while(n > 0) {
			v = n % 10;
			System.out.println(">>> " + v);
			
			total += v;
			
			n /= 10;
		}
		
		System.out.println("total : " + total);
		
		
		
		
		
		
		input.close();
	}
}









