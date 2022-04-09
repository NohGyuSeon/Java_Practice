package Package0409;

import java.util.Scanner;

public class Example02_if {

	public static void main(String[] args) {
		// 점수 2개를 입력을 받아서
		// 평균이 75점 이상이면 "합격입니다" 를
		// 출력하는 프로그램을 작성
		Scanner sc = new Scanner(System.in);
		int score1, score2;
		System.out.print("첫번째 점수를 입력하세요 : ");
		score1 = sc.nextInt();
		System.out.print("두번째 점수를 입력하세요 : ");
		score2 = sc.nextInt();
		double avg = (double)(score1 + score2) / 2;		

		if(avg >= 75) {
			System.out.println("합격입니다");
		}
		else {
			System.out.println("불합격입니다");
		}
		
		sc.close();
	}
}
