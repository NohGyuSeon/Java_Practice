package Package0521;

import java.io.IOException;
import java.net.Socket;

public class File02_Exception {

	static void A() throws IOException {
		System.in.close();
	}
	
	static void B() throws IOException {
		Socket socket = new Socket();
		
		socket.close();
	}
	
	public static void main(String[] args) throws IOException {
		// throw 키워드와 throws 키워드
		
		// throws 키워드
		//	예외가 발생하면 해당 지역에서 예외 처리를 한다.
		//	모든 예외를 각 지역에서 하게 되면 중복된 예외 처리가 생긴다.
		// 	이를 방지하기 위해 호출한 메서드에서 예외 처리가 되어지도록
		//	예외를 전달한다.
		A();
		B();

		// throw 키워드
		//	개발자의 의도에 따라 예외를 발생시킬 때 사용되는 키워드
		//  프로그램 상의 예외가 아닌 로직이나 사용자 사용에 따른
		//  예외를 발생시킬 때 사용한다.

	}
}
