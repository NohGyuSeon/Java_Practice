package Package0522;

public class Example01_String {

	public static void main(String[] args) {
		
		String imgBit = "aabbbffffaaaccd";
		// → a2b3f4a3c2d1
		
		String bit = imgBit.charAt(0) + "";

		for (int i = 1, count = 1; i <= imgBit.length(); i++) {
			if(i == imgBit.length()) {
				bit += count;
				break;
			}
			
			if(imgBit.charAt(i) == imgBit.charAt(i-1)) {
				count++;
				// 같은 문자이면 카운트를 증가하고
				// 더 이상 수행할 코드가 없기 때문에
				// 다음 반복으로 넘어간다.
				continue;
			}
			
			bit += count;				// 이전 문자의 카운트 추가
			bit += imgBit.charAt(i);	// 현재 문자 추가
			count = 1;					// 카운트 초기화
		}
		
		System.out.println("img : " + imgBit);
		System.out.println("bit : " + bit);
	
	}

}
