package Package_Buyer;

public class Audio extends Product {

	// 생성자
	//  빈 생성자
	Audio() {
		
	}
	//  가격을 초기화하는 생성자
	Audio(int price) {
		super(price);
	}
	
	public String toString() {
		return "Audio";
	}
}
