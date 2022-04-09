package Package0409;

public class File01_Operator {
	public static void main(String[] args) {
		// 비트 연산자
		//  - 비트 논리 연산자
		//		: 비트 단위로 논리 연산을 하기 위한 연산자
		//  - 비트 시프트 연산자
		//		: 특정 방향으로 일정 비트 수만큼 이동시키기 위한 연산자
		
		// ex) 8개의 전등을 관리하는 프로그램을 개발
		//      8개의 변수로도 가능하지만, 8개의 bit로도 가능하다.
		//		0 : off, 1 : on
		int light = 0b00100101;
		int mask  = 0b11111111; // 사용할 전등의 수만큼 1bit를 작성
		
		// 모든 전등 on
		light |= mask;
		// light = 0b00000000;
		// mask  = 0b11111111;
		//----------------------
		// | 연산= 0b11111111
		
		// 모든 전등 off
		light &= (~mask);
		
		// 켜져있는 전등 확인 → 반복문을 이용하면 간결하게 해결
		int flag = 0b00000001;
		int on = light & flag;
		flag <<= 1; // 0b00000001 → 0b00000010
		on = light & flag;
		
		// 토글 : 스위치 유사
		light ^= 0b00001000;
	}
}
