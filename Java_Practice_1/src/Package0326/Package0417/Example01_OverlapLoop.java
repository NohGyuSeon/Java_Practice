package Package0417;

public class Example01_OverlapLoop {
	public static void main(String[] args) {
		// 두 변의 길이가 length 인
		// 직각삼각형을 출력
		int length = 5;
		
		for(int h = 0; h < length; h++) {
			System.out.print(h + " : ");
			for(int w = 0; w < length; w++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("------------------");
//		---------------------------------------
		for(int h = 0; h < length; h++) {
			System.out.print(h + " : ");
			
			for(int w = 0; w <= h; w++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		System.out.println("------------------");
//		---------------------------------------
		for(int h = 0; h < length; h++) {
			System.out.print(h + " : ");
			for(int w = length-h; w > 0; w--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("------------------");
//		---------------------------------------
		for(int h = 1; h <= length; h++) {
			System.out.print(h + " : ");
			// 한 줄에 공백과 * 가 있어야한다.
			for(int s = length - h; s > 0; s--) {
				System.out.print("  ");
			}
			for(int w = 1; w <= h; w++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		System.out.println("------------------");
//		---------------------------------------
		for(int h = 0; h < length; h++) {
			System.out.print(h + " : ");
			// 한 줄에 공백과 * 가 있어야한다.
			for(int s = 0; s < h; s++) {
				System.out.print("  ");
			}
			for(int w = length-h; w > 0; w--) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		System.out.println("------------------");
//		---------------------------------------
		
	}
}
