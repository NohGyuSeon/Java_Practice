package Package0521;

import java.io.IOException;
import java.net.Socket;

public class File01_Exception {
	public static void main(String[] args) {
		// 예외 처리(Exception Handling)
		
		// 프로그램 오류
		//	오류 : 오작동하거나 비 정상적인 종료가 되어지는 경우의 원인
		//		 = 에러(Error)
		
		// 에러는 크게 3가지로 나뉜다.
		//  - 컴파일 에러(Compile-time Error)
		//		: 컴파일 시 발생하는 에러
		//  - 런타임 에러(Runtime Error)
		//		: 프로그램 실행 시 발생하는 에러
		//	- 논리적 에러(Logical Error)
		//		: 실행은 되지만 의도와 다르게 동작하는 것
		
		// 프로그램 실행 시(Runtime) 발생할 수 있는 프로그램 오류를
		// '에러(Error)' 와 '예외(Exception)' 로 나눈다.
		//   - 에러(Error) 
		//			: 프로그램 코드에 의해 수습 될 수 없을 정도로 심각한 오류
		//	 - 예외(Exception)
		//			: 프로그램 코드에 의해 수습 될 수 있을 정도의 미약한 오류
		
		// 예외 처리(Exception Handling)
		//  - 예외 발생 시 프로그램의 강제 종료를 막고 실행 상태를 유지하기 위한
		//    코드를 작성하는 것
		
		// 1. try-catch 문
		// 2. try-catch-finally 문
		//		기존의 try-catch 문에서 finally 블록이 추가
		// 3. try-with-resource 문
		
		Socket socket = null;
		int n1 = 20, n2 = 0;
		
		System.out.println("------------------------------");
		// n1 / n2 = ?
		// System.out.println("n1 / n2 = " + (n1 / n2));
		// → 0으로 나눌 수 없기 때문에
		//   AtrithmeticException 예외가 발생
		// → 프로그램 강제로 종료
		System.out.println("------------------------------");
		// try-catch 문
		try {
			// 프로그램이 실행할 코드를 작성할 블록
			// 예외가 발생할 가능성이 있는 코드를 작성
			System.out.println("n1 / n2 = " + (n1 / n2));
			// 예외가 발생한 시점 부터
			// 이후 코드는 정상적으로 동작시킬 수 없다.
			
		}catch(ArithmeticException e) {
			// ArithmeticException 발생할 경우
			// 이를 처리하기 위한 코드를 작성
			System.out.println("0으로는 나눌 수 없습니다.");
			
			return;
		}catch(NullPointerException e) {
			
			// 예외처리가 끝난 다음에는 try-catch 문을 탈출
		}catch(ArrayIndexOutOfBoundsException e) {
			
		}finally {
			// 예외 발생 여부 상관없이 수행할 코드
			// try-catch 구문에서 메서드가 종료하면
			// 끝나기 전에 반드시 수행하고 메서드가 종료된다.
			
			// 스트림의 해제같은 경우를 보통 finally 블록에 작성
			System.out.println("finally block!");
			try {
				if(socket != null) {
					socket.close();
				}
			}catch(IOException e) {
				
			}
		}
		System.out.println("------------------------------");
		// 예외처리할 때 필요한 스트림 객체도 같이 생성하고
		// 예외처리가 끝날 떄 같이 해제되도록하는 구문
		try (Socket scoket2 = new Socket();){
			// 소괄호 내에 작성된 스트림 객체는
			// try 블록에서 벗어나면 자동으로 close()가 호출
		} catch (Exception e) {
			// TODO: handle exception
		}
			
		
	}
}



























