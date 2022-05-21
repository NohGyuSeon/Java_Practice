package Package_Buyer;

public class Example_Main {
	/*
	 * 해당 패키지 내의 클래스들을 이용해서 아래 main 이 정상적으로 동작하도록 구현하세요.
	 * 
	 * 상품 - Product
	 * 컴퓨터 - Computer -> Product
	 * TV - Tv -> Product
	 * 오디오 - Audio  -> Product
	 * 
	 * 구매자 - Buyer
	 */
	public static void main(String[] args) {
		Buyer buyer = new Buyer(2000);
		
		buyer.buy(new Tv(100));
		buyer.buy(new Computer(300));
		buyer.buy(new Computer(300));
		buyer.buy(new Tv(200));
		buyer.buy(new Audio(50));
		
		buyer.printBoughtProduct();
		
		/*출력
		 * 구매하신 물품의 총 금액은 950만원입니다. 
		 * 구매하신 제품은 TV, Computer, Computer, TV, Audio입니다. 
		 * 지금까지 적립한 포인트 95Point 입니다.
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
