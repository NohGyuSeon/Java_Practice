package Package0522;

import java.util.ArrayList;

public class File03_ArrayList {

	public static void main(String[] args) {
		// 다수의 문자열을 저장하기 위한 ArrayList
		ArrayList<String> strList = new ArrayList<>();
		
		System.out.println("strList's List : " + strList);
		System.out.println("strList's size : " + strList.size());
		
		strList.add("Hello");
		System.out.println("strList's List : " + strList);
		System.out.println("strList's size : " + strList.size());
		
		strList.add("Java");
		System.out.println("strList's List : " + strList);
		System.out.println("strList's size : " + strList.size());

		strList.add("Android");
		System.out.println("strList's List : " + strList);
		System.out.println("strList's size : " + strList.size());
		
		// 지정한 위치에 삽입
		strList.add(1, "Python");
		System.out.println("strList's List : " + strList);
		System.out.println("strList's size : " + strList.size());

		// 지정한 위치에 저장
		strList.set(0, "C/C++");
		System.out.println("strList's List : " + strList);
		System.out.println("strList's size : " + strList.size());
		
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(i + " : " + strList.get(i));
		}
		
		int indexOfJava = strList.indexOf("Java");
		// 다른 메서드에서도 기능을 이용하려면
		// equals 메서드가 오버라이딩이 되어있어야 한다.
		System.out.println("index of Java : " + indexOfJava);
		
		String removed = strList.remove(3);
		System.out.println("Removed Subject : " + removed);
		System.out.println("strList's List : " + strList);
		System.out.println("strList's size : " + strList.size());
		
		if(strList.remove("HTML/CSS")) {
			System.out.println("정상적으로 삭제되었습니다.");
		} else {
			System.out.println("없는 과목입니다.");
		}
		
		System.out.println("strList's List : " + strList);
		System.out.println("strList's size : " + strList.size());

	}

}
