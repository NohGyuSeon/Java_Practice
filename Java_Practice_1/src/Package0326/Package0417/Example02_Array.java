package Package0417;

public class Example02_Array {

	public static void main(String[] args) {
		// 점수 80, 97, 65, 89, 66, 98, 54, 81, 70 을
		// 배열에 저장한 다음 총합과 평균을 출력
		int [] array = { 80, 97, 65, 89, 66, 98, 54, 81, 70 };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		double avg = (double)sum / array.length;

		System.out.println("배열의 총합은 = " + sum);
		System.out.println("배열의 평균은 = " + avg);

	}
}
