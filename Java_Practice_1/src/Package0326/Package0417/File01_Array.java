package Package0417;

import java.util.Arrays;

public class File01_Array {
	public static void main(String[] args) {
		// 배열(Array)
		//  - 같은 타입의 저장 공간들을 하나의 묶음으로 다루는 자료구조(타입)
		//    → 같은 용도/특징인 데이터들의 묶음
		//  - 변수로만 프로그램을 만드는데 있어서 한계가 있다.
		//		- 저장할 수 있는 데이터의 수가 제한적이다.
		//		- 사용자가 원하는 값을 구분하여 찾기가 힘들다.
		//		- 연산/처리 과정이 비효율적이다.
		//		- 알고리즘/자료구조와 같이 많은 고려사항이 있는 부분에서는
		//		  정적으로 대부분 처리된다.
		//      → 위의 문제를 해결하기 위한 것이 배열(또는 컬렉션) 이다.
		//  - 배열관련 용어
		//		- 원소(item)    : 배열 내에 데이터가 저장되는 저장공간(또는 데이터)
		//		- 배열 리터럴   : 코드 상에 표현되는 배열을 의미
		//					    : 중괄호({})를 사용하며, 
		//						  데이터를 쉼표를 구분으로 나열
		//		- 인덱스(index) : 각 원소마다 부여되는 번호이며, 원소에 접근할 때 사용
		//						: 0 부터 1씩 증가하는 정수형
		//						: 0 <= index < 원소의 개수
		//		- 인덱스 연산자 : 배열을 저장하는 식별자를 통해 
		//						  원소에 접근하기 위한 연산자
		//						: 식별자 뒤에 대괄호([]) 작성하여 인덱스를 지정
		//		- 배열의 길이   : 배열의 원소의 개수
		//						: 배열을 참조하는 참조 변수의 필드 중
		//						  length 를 통해서 원소으 개수를 반환
		//-----------------------------------------------------------------------
		// 1. 배열을 저장하기 위한 변수 선언
		//   정수형 데이터들을 저장하기 위한 배열을 저장하는 변수
		int[] intArr1; // int 형 배열을 저장하는 변수
		
		// 2. 배열 생성
		//    = new 연산자에 의해 저장공간이 만들어지고
		//		해당 저장 공간에는 기본 값(Default) 값이 저장
		//		→ 기본 값 = 0, 0.0, false, null
		intArr1 = new int[5]; // int 형 저장 공간 5개 만큼 공간을 할당
		
		// 3. 참조 변수(배열을 저장하기 위한 변수) 선언 및 배열 생성
		int[] intArr2 = new int[5];
		
		// 4. 초기화 = 배열을 생성함과 동시에 원하는 값들로 대입
		//			 = 배열 리터럴 내에 나열된 원소의 수만큼 
		//			   배열의 크기가 결정된다.
		//			 = 변수 선언과 함께 초기화할 경우에는 'new int[]' 생략
		int[] intArr3 = new int[] {10, 20, 30, 40, 50};
		int[] intArr4 = {10, 20, 30, 40, 50}; //'new int[]' 생략
		
		intArr3 = new int[] {50, 60, 70, 80, 90}; //'new int[]' 생략하면 안된다.
		
		// 5. 원소 접근
		System.out.println("intArr3[2] = " + intArr3[2]);
		int index = 3;	
		System.out.println("intArr3[index] = " + intArr3[index]);
		System.out.println("intArr3[index-2] = " + intArr3[index-2]);
		
		System.out.println("intArr3's length = " + intArr3.length);
		
		// 참조(Reference) ★★★
		//  new 연산자에 의해 생성된 저장 공간에는 식별자가 없기 때문에
		//  이를 사용하기 위해서는 이 공간들을 참조하는 별도의 변수가 필요하다.
		//  → 참조(Reference) 변수 
		//		= 특정 메모리 공간을 저장함으로써
		//	      데이터를 참조하는 변수
		//  new 연산자의 기능은 저장 공간의 할당이고
		//  해당 연산의 결과 값은 할당된 공간의 주소
		System.out.println("intArr3 = " + intArr3);
		// 실행 결과 : [I@1a1d6a08
		//			 → [ = 배열, I = int, 1a1d6a08 = 배열이 저장된 주소
		
		// 배열의 공유와 복사
		//  - 배열을 참조변수로 다루게된다.
		//	- 주소를 저장하는 참조 변수를
		//	  다른 참조 변수에 대입을 하게 되면
		//    배열 자체가 복사되는 것이 아니라
		//    배열이 저장된 주소가 복사가 된다.
		//  - 복사하는 방법
		//		1. 반복문을 이용하여 원소를 하나씩 복사
		//      2. Arrays 클래스의 copy() 메서드를 이용
		int[] intArr5 = {1, 2, 3, 4, 5};
		int[] copyArr = intArr5;
		
		System.out.println("intArr5[0] = " + intArr5[0]);
		System.out.println("copyArr[0] = " + copyArr[0]);
		
		intArr5[0] = 100;
		// intArr5 와 copyArr 는 같은 주소를 가지기 때문에
		// 배열이 복사가 되는 것이 아니라 같은 배열을 공유
		System.out.println("intArr5[0] = " + intArr5[0]);
		System.out.println("copyArr[0] = " + copyArr[0]);
		System.out.println("------------------------------");
		// 배열의 모든 원소 출력
		int[] intArr6 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		System.out.println("intArr6[0] = " + intArr6[0]);
//		System.out.println("intArr6[1] = " + intArr6[1]);
//		System.out.println("intArr6[2] = " + intArr6[2]);
//		System.out.println("intArr6[3] = " + intArr6[3]);
//		System.out.println("intArr6[4] = " + intArr6[4]);
//		System.out.println("intArr6[5] = " + intArr6[5]);
//		System.out.println("intArr6[6] = " + intArr6[6]);
//		System.out.println("intArr6[7] = " + intArr6[7]);
//		System.out.println("intArr6[8] = " + intArr6[8]);
//		System.out.println("intArr6[9] = " + intArr6[9]);
		for(int i = 0; i < intArr6.length; i++) {
			System.out.println("intArr6["+i+"] = " + intArr6[i]);
		}
		
		// 배열 복사
		int[] copyArr2 = new int[intArr6.length];
		for(int i = 0; i < intArr6.length; i++) {
			copyArr2[i] = intArr6[i];
		}
		
		int[] copyArr3 = Arrays.copyOf(intArr6, intArr6.length);
		System.out.println("copyArr3 = " + Arrays.toString(copyArr3));
		for(int i = 0; i < copyArr3.length; i++) {
			System.out.println("copyArr3["+i+"] = " + copyArr3[i]);
		}
		
	}
}
