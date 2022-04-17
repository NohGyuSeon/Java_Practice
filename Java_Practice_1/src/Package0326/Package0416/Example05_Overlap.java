package Package0416;

public class Example05_Overlap {
	public static void main(String[] args) {
		
		/*
		 * | * * * * *  
		 * | * * * * * 
		 * | * * * * * 
		 * | * * * * * 
		 * | * * * * * 
		 * | * * * * * 
		 * | * * * * * 
		 * 
		 * 위의 사각형을 console 창에 출력
		 * 
		 */
		
		int width = 8, height = 10;
		
		for(int h = 0; h < height; h++) {
//			System.out.println("* * * * * ");
			for(int w = 0; w < width; w++) {
				System.out.print("* ");
			}
			// 한 줄 출력한 다음
			// 다음 줄에 출력되도록 개행
			System.out.println();
		}
		
		
		
	}
}
