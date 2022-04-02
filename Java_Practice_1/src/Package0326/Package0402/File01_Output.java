package Package0402;

public class File01_Output {
	public static void main(String[] args) {
		// 출력(Output)
		//  - 프로그램 내부에서 외부로 데이터가 나감
		//  - 모니터(console), 파일 저장, 메세지 전달..
		//  - 표준 출력 : System.out
		//  - 기본 출력 : System.out.println(출력할 데이터)
		//  - 그 외 출력문 
		//  	- System.out.print(출력할 데이터)
		//  	- System.out.printf(서식지정자를 포함한 문자열, 서식지정자에 대입할 값..)
		
		// 서식(format)
		//  => 저의 이름은 홍길동이고, 나이는 30세입니다.
		String name = "김철수";
		int age = 20;
		System.out.println("나의 이름은 " + name + "이고, 나이는 " + age + "세입니다." );
		
		//..... 
		System.out.println("나의 이름은 " + name + "이고, 나이는 " + age + "세입니다." );
		
		//  => 나의 이름은 홍길동이고, 나이는 30세입니다.
		//  => 나의 이름은 OOO이고, 나이는 OO세입니다.
		String format = "나의 이름은 %s이고, 나이는 %d세입니다.\n";
		System.out.printf(format, name, age);
		// 서식 지정자
		//  → 문자열 내에 데이터가 들어올 자리를 지정하는 문자
		//  → % 로 시작하며 데이터의 타입을 의미하는 문자
		//		: s = 문자열
		//		: d = 정수(10진수)
		//		: o = 정수(8진수)
		//		: x = 정수(16진수)
		//		: f = 실수
		//  → 서식 지정자에 다양한 문자들을 통해 꾸며줄 수 있다.
		//		: %[플래그][길이][.소수점]타입
		//			→ 플래그의 종류
		//				- : 왼쪽 정렬
		//				+ : 양수일때 + 부호, 음수일 때 - 부호를 출력	
		//				0 : 남은 공간을 0 으로 출력
		System.out.printf(format, name, age);
		System.out.println("---------------------------------------");
		String timeFormat = "%02d : %02d : %02d\n";
		System.out.printf(timeFormat, 3, 22, 32);
		System.out.printf(timeFormat, 11, 2, 2);
		System.out.printf(timeFormat, 1, 5, 2);
		
		//-----------------------------------------------------------
		// printf() 메서드는 서식 지정자를 이용하여
		// 모니터에 출력하는 메서드이므로 그 외에는 출력할 수 없다.
		
		// 서식 지정자를 이용하여 문자열을 만드는 메서드
		//  → String.format(서식지정자를 포함한 문자열, 서식지정자에 대입할 데이터들..)
		String now = String.format(timeFormat, 3, 34, 5);
		System.out.println(now);
		
	}
}
