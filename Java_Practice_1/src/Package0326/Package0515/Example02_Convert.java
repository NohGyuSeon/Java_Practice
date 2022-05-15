package Package0515;

import java.util.Scanner;

// 특정 단위를 다른 단위로 변환해주는 클래스(Convert)
abstract class Convert {
	// 변환 비율
	double ratio;
	
	Convert(double ratio) {
		this.ratio = ratio;
	}
	
	// 기존의 단위
	abstract String getSrcString();
	// 변환할 단위
	abstract String getDestString();
	// 변환
	abstract double convert(double src);
	
	// 변환기를 실행
	void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.println(getSrcString() + " → " + getDestString() + "으로 변환");
		System.out.print(getSrcString() + "을 입력하세요. >>> ");
		double source = input.nextDouble();
		double destination = convert(source);
		System.out.println("결과 : " + destination + getDestString());
		
	}
}

// km → m 변환기
class KmToM extends Convert {

	KmToM(double ratio) {
		super(ratio);
	}

	@Override
	String getSrcString() {
		return "km";
	}

	@Override
	String getDestString() {
		return "m";
	}

	@Override
	double convert(double src) {
		return src * ratio;
	}
	
}


// won → dollar 변환기
//  1$ = 1284won
class WonToDollar extends Convert {

	WonToDollar(double ratio) {
		super(ratio);
	}

	@Override
	String getSrcString() {
		return "won";
	}

	@Override
	String getDestString() {
		return "$";
	}

	@Override
	double convert(double src) {
		return src / ratio;
	}
	
}



public class Example02_Convert {
	public static void main(String[] args) {
//		KmToM km2m = new KmToM(1000); // 1km = 1000m
//		km2m.run();
		
		// 1달러당 단위
		WonToDollar w2d = new WonToDollar(1284);
		w2d.run();
		
	}
}






