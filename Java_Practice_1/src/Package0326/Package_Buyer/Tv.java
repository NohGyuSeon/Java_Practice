package Package_Buyer;

public class Tv extends Product {
	
	// 생성자
	//  빈 생성자
	Tv() {
		this(0);
	}
	//  가격을 초기화하는 생성자
	Tv(int price) {
		super(price);
	}
	
	public String toString() {
		return "TV";
	}
	
}
