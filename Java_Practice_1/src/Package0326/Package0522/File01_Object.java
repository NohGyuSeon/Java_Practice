package Package0522;

import java.util.Arrays;
import java.util.Random;

class Simple01 {
	String name;
	int value;
	
	Simple01(String name) {
		this(name, 0);
	}
	Simple01(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	
	
	// Object 가 가진 메서드 중
	// 객체를 문자열로 표현하는 메서드
	@Override
	public String toString() {
		return String.format("%s(%d)", name, value);
	}
	
	// Object 가 가진 메서드 중
	// 같은 객체인지 비교하는 메서드
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(this == obj) return true;
		if(!(obj instanceof Simple01)) return false;
		
		Simple01 s = (Simple01) obj;
		
		// 같은 경우를 검사하는 것보다
		// 다른 경우를 검사하는 것이 코드가 간결해진다.
		if(!name.equals(s.name)) return false;
		return true;
	}
	
}

public class File01_Object {
	public static void main(String[] args) {
		Random r = new Random();
		// 다수의 Simple01 객체를 저장하는 배열
		Simple01[] simples = new Simple01[10];
		
		// Simple 객체 생성
		for(int i = 0; i < simples.length; i++) {
			// 1 <= value <= 100
			simples[i] = new Simple01("S"+i, r.nextInt(100)+1);
		}
		
		// toString() 메서드를 오버라이딩하여
		// Simple01 객체를 원하는 형식의 문자열로 반환 
		String simplesStr = Arrays.toString(simples);
		System.out.println(simplesStr);
		
		// 객체 배열 simples 에 저장된 객체들 중
		// 찾고자 하는 객체
		Simple01 search = new Simple01("S3");
		
		for(int i = 0; i < simples.length; i++) {
			// if(simples[i].name.equals(search.name)) {
			if(simples[i].equals(search)) {
				System.out.println(search.name + " value >>> " + simples[i].value);
				break;
			}
		}

	}
}













