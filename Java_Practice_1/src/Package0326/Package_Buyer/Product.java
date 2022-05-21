package Package_Buyer;

// 상품들의 슈퍼클래스
public class Product {
	private int price;		// 제품의 가격
	private int bonusPoint;	// 제품구매 시 제공하는 보너스 점수
	
	// 생성자
	//  기본 생성자
	
	Product() {
		this(0);
	}

	//  가격을 매개변수로 받는 생성자
	//   이 생성자에서 가격과 보너스포인트를 초기화
	//   보너스 포인트는 가격의 10%로 초기화한다.
	
	Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(price * 0.1);
	}

	// Getter
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

}
