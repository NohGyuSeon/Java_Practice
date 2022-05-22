package Package0522;

import java.util.Comparator;
import java.util.HashMap;

// 비교가 가능한 클래스로 만들고 싶으면
// 해당 클래스에 Comparable을 구현
class Simple04 implements Comparable<Simple04>{
	int data;
	
	@Override
	public int compareTo(Simple04 o) {
		return data - o.data;
	}
}

// Simple04를 비교하기 위한 클래스를 만들 때
// Comparator을 구현
class CompSimple04 implements Comparator<Simple04> {
	
	@Override
	public int compare(Simple04 o1, Simple04 o2) {
		
		return o2.data - o1.data;
	}
}

public class File04_HashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("국어", 80);
		map.put("영어", 88);
		map.put("수학", 100);
		
		System.out.println(map);
		
		String subject = "영어";
		System.out.println(subject + " : " + map.get(subject));
	}
}
