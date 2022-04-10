package Package0410;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x1, y1, x2, y2;
		System.out.print("Enter x1 : ");
		x1 = sc.nextInt();
		System.out.print("Enter y1 : ");
		y1 = sc.nextInt();
		System.out.print("Enter x2 : ");
		x2 = sc.nextInt();
		System.out.print("Enter y2 : ");
		y2 = sc.nextInt();
		
		if (x1 > x2) {
			System.out.println(x1 - x2);
		}
		else if (x1 < x2) {
			System.out.println(x1 - x2);
		}
		else { // (x1 == x2)
			if (y1 > y2) {
				System.out.println(y1 - y2);
			}
			else if (y1 < y2) {
				System.out.println(y1 - y2);
			}
			else { 
				// null
			}
		}
		
		sc.close();
	}
}
