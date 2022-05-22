package Package0522;

import java.util.Arrays;

public class File02_String {
	
	public static void main(String[] args) {
		// String 클래스
		//	- 문자열을 표현하는 클래스
		//	- C 언어 같은 경우 문자열을 char 형 배열로 다루지만
		//	- Java 에서는 문자열을 String 클래스로 다룬다.
		//	- String 클래스 내에 char 형 배열이 있으며
		//	  생성자를 통해 문자열을 저장
		//	- String 클래스는 '불변객체(Immutable)'이다
		//		→ 객체 내의 인스턴스 값을 변경할 수 없다
		//		→ 다른 문자열로 변경하려면 새로 참조해야 한다
		//	- 문자열 리터럴은 클래스가 로스될 때 메모리에 자동으로 생성
		//	  동일한 리터럴은 중복으로 생성되지 않는다.
		//		→ JVM 내 '상수 저장소(Constant Pool)'에 저장
		String str1 = "Hello"; // 문자열 리터럴1
		String str2 = "Hello"; // 문자열 리터럴
		if(str1 == str2) {
			System.out.println("동일한 문자열입니다.");
		} else {
			System.out.println("다른 문자열입니다.");
		}
		
		String str3 = new String("Hello"); // 문자열 객체
		String str4 = new String("Hello"); // 문자열 객체
		if(str3 == str4) {
			// 다른 인스턴스이기 떄문에 문자열이 같더라도
			// 다른 객체이다.
			// 같은지 검사하려면 equals() 메서드를 사용
			System.out.println("동일한 문자열입니다.");
		} else {
			System.out.println("다른 문자열입니다.");
		}
		// ----------------------------------------------------
		String str5 = "Hello World!";
		String str6 = "Hello Java!";
		
		for (int i = 0; i < str5.length(); i++) {
			// str5의 i번째 문자
			System.out.println(i + " : " + str5.charAt(i));
		}
		
		// str5가 사전순으로 뒤에 있으면 = 값이 크다.
		// 양수로 출력이 되어지고
		// str5가 사전순으로 앞에 있으면 = 값이 작다.
		// 음수로 출력이 되어진다.
		System.out.println("str5 compare to str6 >>> " + str5.compareTo(str6));
		
		// str5에 "World!"가 포함되어 있는지 검사
		if(str5.contains("World!")) {
			System.out.println("We are the world!");
		}
		
		// str5 에서 "World!" 의 첫번째 문자의인덱스를 반환
		// 없으면 -1 을 반환
		int idx = str5.indexOf("World!");
		System.out.println("\"World!\"'s index : " + idx);
		int idx2 = str5.indexOf("o");
		System.out.println("o's index : " + idx2);
		int idx3 = str5.indexOf("o", idx2+1);
		System.out.println("o's index : " + idx3);
		
		str6 = str5.concat(" Java!");
		// str6 = str5 + " Java!";
		// str5 += " Java!";
		System.out.println("str6 : " + str6);
		System.out.println("str5 : " + str5);
		// String 클래스의 객체는 불변객체이기 때문에
		// 자신의 값은 바꾸지 말고
		// 새로운 문자열을 만들어서 반환을 한다.
		
		// 문자열 대체(수정)
		str6 = str5.replace("World", "Java");
		System.out.println("str6 : " + str6);
		System.out.println("str5 : " + str5);
		
		// 문자열 분할
		//	- 구분자(또는 정규표현식)을 통해 문자열을 분할
		String [] strArr = str5.split(" ");
		System.out.println(Arrays.toString(strArr));
		
		String phoneStr = "010-1234-5678";
		String [] phoneToken = phoneStr.split("-");
		System.out.println(Arrays.toString(phoneToken));
		
		System.out.println(phoneStr.replace(phoneToken[1], "XXXX"));
		
		
		
		
		
	}
	
	
}
