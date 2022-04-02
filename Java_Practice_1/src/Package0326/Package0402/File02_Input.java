package Package0402;

// ctrl + shift + o : import 정리
import java.util.Scanner;

public class File02_Input {
	public static void main(String[] args) {
		// 입력(Input)
		//	- 프로그램 외부에서 내부로 데이터가 들어옴
		//  - 키보드, 파일 읽기, 메세지 수신...
		//  - 표준 입력 : System.in
		//  - 기본 입력 : Scanner 클래스
		
		// 입력을 받기 위해서는 System.in 이 반드시 필요하며
		// 원하는 타입으로 바로 변환하기 위해서는 Scanner 클래스가 필요하다.
		
		// 1. 가장 먼저 해야할 것은 Scanner 객체를 생성
		// 2. System.in 을 Scanner 에 포함시킨다.
		Scanner input = new Scanner(System.in);
		
		// 3. 입력 메서드를 호출하여 입력 값 반환
		//	- nextLine() : 개행문자(엔터)까지의 문자열을 반환
		//	- next() : 공백까지의 문자열을 반환
		//	- nextInt() : 공백까지의 정수형을 반환
		//	- nextDouble() : 공백까지의 실수형을 반환
		// String message = input.nextLine();
		// String message = input.next();
		// int message = input.nextInt();
		double message = input.nextDouble();
		System.out.println(">>> " + message);
		
		// 두 번째 값을 반환
		// - Scanner 내에 입력된 값이 있으면 정수형으로 반환
		// - Scanner 내에 입력된 값이 있으면 입력하여 반환
		int message2 = input.nextInt();
		System.out.println(">>> " + message2);
		
		// Scanner 내에서는 개행문자가 지워지지 않기 때문에
		// nextLine() 메서드가 개행 문자를 그대로 읽고 결과를 반환
		input.nextLine();
		// 해결 방안 : 입력된 글자의 수가 0이면 다시 입력
		String message3 = input.nextLine();
		if(message3.length() == 0) {
			message3 = input.nextLine();
		}
		
		System.out.println(">>> " + message3);
	}
}
