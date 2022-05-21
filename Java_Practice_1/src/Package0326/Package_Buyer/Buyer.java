package Package_Buyer;


// 구매자
public class Buyer {
	private int money;	// 소유 금액(단위 만)
	private int bonusPoint; // 포인트
	
	/* 구매한 상품들을 저장하기 위한 배열 선언, 개수 제한 최대 10개 */
	private static final int MAX_COUNT = 10;
	Product [] productList = new Product[MAX_COUNT];
	
	private int productCount = 0; // 구매한 물품 개수
	
	Buyer() {
		this.money = 0;
		this.bonusPoint = 0;
	}
	// 기본 생성자
	//  돈과 보유포인드를 0으로 초기화

	Buyer(int money) {
		this.money = money;
		this.bonusPoint = 0;
	}
	
	// 돈을 매개변수로 받는 생성자
	//  보유 포인트는 0으로 초기화
	
	Buyer(int money, int bonusPoint) {
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	// 돈과 보유 포인트를 매개변수로 받는 생성자
	
	// 상품을 사기위한 메소드
	public void buy(/* 구매한 상품을 받을 매개변수 선언 */ Product product) {
		// 구매하고자 하는 상품의 가격보다 돈이 적으면
		if(money < product.getPrice()) {
			// "잔액이 부족하여 물건을 살 수 없습니다." 를 출력만 함.
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		// 돈이 충분하면 구매할 수 있는지(배열이 꽉차있는지) 여부에 따라
		if(productCount == MAX_COUNT) {
			System.out.println("더이상 구매할 수 없습니다.");
			return;
		}
		
		// 구매 절차(구매, 포인트적립) 후 배열에 저장.
		productList[productCount++] = product;
		money -= product.getPrice();
		bonusPoint += product.getBonusPoint();
	}
	
	// 구매한 상품들 출력
	public void printBoughtProduct() {
		// 구매한 제품이 없으면 "구입하신 제품이 없습니다." 출력 후 종료
		if(productCount == 0) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		String productListStr = "";
		int totalPrice = 0;
		
		// 반복문 이용해서 구입한 상품들의 이름을 리스트화
		for(int i = 0; i < productCount; i++) {
			// productListStr 변수에 "OOO, OOO, OOO, OOO" 와 같이 상품 이름이 나열된 문자열을 만들도록 구현
			// totalPrice 에 구매한 상품들의 총 가격이 저장되도록 구현
			productListStr += productList[i];
			if(i < productCount -1) productListStr += ", ";
			
			totalPrice += productList[i].getPrice();
			
		}
		// 구매한 상품의 총 가격을 출력 	"구매하신 물품의 총 금액은 OOO만원입니다."
		System.out.println("구매하신 물품의 총 금액은 " + totalPrice + "만원입니다.");
		// 구매한 상품 리스트 출력		"구매하신 제품은 OOO, OOO, OOO, OOO 입니다."
		System.out.println("구매하신 제품은 " + productListStr +"입니다.");
		// 최종 적립 포인트 출력 		"지금까지 적립한 포인트 OOOO Point입니다."		
		System.out.println("지금까지 적립한 포인트 " + bonusPoint + "Point 입니다.");
	}
	
}










