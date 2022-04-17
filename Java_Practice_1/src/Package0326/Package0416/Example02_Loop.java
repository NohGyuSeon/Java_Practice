package Package0416;

// 2의 배수 = 2로 나눠떨어지는 수 
// 짝수     = 자연수 중에서 짝수
public class Example02_Loop {
	public static void main(String[] args) {
		// 0 <= n < 120 사이의 정수들 중에서
		// 3의 배수이거나 5의 배수인 수들을 모두 출력
		
		for(int n = 0; n < 120; n++) {
			if(n % 3 == 0 || n % 5 == 0) {
				System.out.println(">>> " + n);
			}
		}
		
		
	}
}
