package Package0409;

public class Homework_0403 {
	public static void main(String[] args) {
		// 서로 다른 정수 3개 중 
		// 두번째로 큰 값을 출력
		int a = 10, b = 7, c = 15;
//		int a = 10, b = 15, c = 7;
//		int a = 7, b = 10, c = 15;
//		int a = 15, b = 10, c = 7;
//		int a = 15, b = 7, c = 10;
//		int a = 7, b = 15, c = 10;
		
		// 가장 큰 값과 가장 작은 값
		int max = (a > b && a > c) ? a : (b > c ? b : c);
		// a가 b보다 크고 c 보다 크면 a 가 가장 큰 값이고
		// 그렇지 않으면 b 와 c 중에 큰 값이 가장 큰 값이다.
		int min = (a < b && a < c) ? a : (b < c ? b : c);
		
		int mid = a + b + c - max - min;
		System.out.println("middle : " + mid);
		
	}
}
