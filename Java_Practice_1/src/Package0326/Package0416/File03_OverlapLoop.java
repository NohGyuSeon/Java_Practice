package Package0416;

public class File03_OverlapLoop {
	public static void main(String[] args) {
		// 중첩 반복문
		//  - 반복문 내에 또 다른 반복문을 작성한 형태
		
		// 1일차 ~ 8일차
		System.out.println(1 + "일차");
		// 1교시 ~ 6교시
		System.out.println(1 + " 교시 수업 중");
		System.out.println(2 + " 교시 수업 중");
		System.out.println(3 + " 교시 수업 중");
		System.out.println(4 + " 교시 수업 중");
		System.out.println(5 + " 교시 수업 중");
		System.out.println(6 + " 교시 수업 중");
		
		System.out.println(2 + "일차");
		// 1교시 ~ 6교시
		System.out.println(1 + " 교시 수업 중");
		System.out.println(2 + " 교시 수업 중");
		System.out.println(3 + " 교시 수업 중");
		System.out.println(4 + " 교시 수업 중");
		System.out.println(5 + " 교시 수업 중");
		System.out.println(6 + " 교시 수업 중");
		
		System.out.println(3 + "일차");
		// 1교시 ~ 6교시
		System.out.println(1 + " 교시 수업 중");
		System.out.println(2 + " 교시 수업 중");
		System.out.println(3 + " 교시 수업 중");
		System.out.println(4 + " 교시 수업 중");
		System.out.println(5 + " 교시 수업 중");
		System.out.println(6 + " 교시 수업 중");
		// ... 
		System.out.println("-----------------------");
		// 1일차 ~ 8일차
		for(int day = 1; day <= 8; day++) {
			System.out.println(day + "일차");
			
			// 1교시 ~ 6교시
			for(int n = 1; n <= 6; n++) {
				System.out.println(n + " 교시 수업 중");
				// → 8 * 6 = 48번 실행된다.
			}
			
		}
		
	}
}












