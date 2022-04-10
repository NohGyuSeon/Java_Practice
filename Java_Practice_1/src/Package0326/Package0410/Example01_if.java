package Package0410;

import java.util.Scanner;

public class Example01_if {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String menu = "=========MENU=========\n"
					+ "1. 아메리카노(3000)\n"
					+ "2. 카페라떼(5000)\n"
					+ "3. 콜드브루(5000)\n"
					+ "4. 아이스티(4000)\n"
					+ "5. 레몬에이드(6000)\n"
					+ "======================";
		
		System.out.println(menu);
		System.out.println("무엇을 주문하시겠습니까?");
		int choice = input.nextInt();
		int money = 10000;
		String drink = "";
		int price = 0;
		
		if(choice == 1) {
			drink="아메리카노";
			price = 3000;
		}else if(choice == 2) {
			drink="카페라떼";
			price = 5000;
		}else if(choice == 3) {
			drink="콜드브루";
			price = 5000;
		}else if(choice == 4) {
			drink="아이스티";
			price = 4000;
		}else if(choice == 5) {
			drink="레몬에이드";
			price = 6000;
		}else { // 메뉴가 없는 경우
			System.out.println("없는 메뉴입니다.");
		}
		
		// drink 가 빈 문자열이 아니면 = 저장된 문자열이 있으면
		if(!drink.isEmpty()) {
			System.out.println(drink +"을(를) 주문했습니다.");
			money -= price;
			System.out.println("거스름돈 : " + (money));
		}
		
		input.close();
	}
}
