package Package0402;

public class Example03_Operator {

	public static void main(String[] args) {
		int n = 54;
		
		// n의 값의 십의 자리와 일의 자리를 각각 출력
		// 십의 자리 : 5
		// 일의 자리 : 4
		
		int n_10 = n / 10;
		int n_1 = n % 10;
		
		System.out.println(n + "의 십의 자리는 " + n_10);
		System.out.println(n + "의 일의 자리는 " + n_1);
	}
}
