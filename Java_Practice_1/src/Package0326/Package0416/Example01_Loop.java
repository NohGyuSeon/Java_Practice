package Package0416;

public class Example01_Loop {
	public static void main(String[] args) {
		// 120 <= n < 200 인 정수들 중에서
		// 3의 배수들의 합을 출력
		
		// 120 <= n < 200 → 반복 수행을 하기 위한 조건
		// 3의 배수       → 반복 수행을 하기 위한 조건이 아니다.	

		int start = 120;
		int end = 200;
		int total = 0; // 3의 배수들의 합을 저장할 변수
		
		// 120 부터 200까지 1씩 증가하는 반복문
		for(int n = start; n < end; n++) {
			
			if(n % 3 == 0) {
				System.out.println("n : " + n);
				total += n;
			}
			
		}
		System.out.println(">>> " + total);
		
		
	}
}








