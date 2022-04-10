package Package0410;

public class Example_gugudan {

	public static void main(String[] args) {
		
		int x = 6;
		int count = 1;
		
		while(count <= 9) {
			System.out.println(x + " * " + count + " = " + x * count);
			count++;
		}
		System.out.println("-----------------------------------");
		// 30 <= n < 50 사이의 모든 정수를 출력
		int num = 30;
		while(num < 50) {
			System.out.println(num);
			num++; 
		}
		System.out.println("-----------------------------------");
		// 30 <= n < 50 사이의 모든 정수를 출력
		// 홀수만 출력
		int odd = 30;
		while(odd < 50) {
			if (odd % 2 == 0) {
				odd++;
				continue;
			}
			else {
				System.out.println(odd);
				odd++;
			}
		}
		System.out.println("-----------------------------------");
	}
}
