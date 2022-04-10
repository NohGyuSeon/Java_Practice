package Package0410;

import java.util.Scanner;

public class Example_time {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter hours : ");
		int hours = sc.nextInt();
		System.out.print("Enter minutes : ");
		int minutes = sc.nextInt();
		
		int hours_spend = minutes / 60;
		int minutes_res = minutes % 60;
		
		if (hours_spend > 0) {
			hours = hours > hours_spend ? (hours + hours_spend) : (24 - hours_spend);
			if (minutes_res < 45) {
				minutes = 60 - (45 - minutes_res);
			}
			else {
				minutes = minutes_res;
			}
			System.out.println(hours + " " + minutes);
		}
		else {
			if (minutes_res < 45) {
				minutes = 60 - (45 - minutes_res);
			}
			else {
				minutes = minutes_res;
			}
			System.out.println(hours + " " + minutes);
		}
		
		sc.close();
	}
}
