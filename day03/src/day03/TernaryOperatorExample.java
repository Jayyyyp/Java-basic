package day03;

public class TernaryOperatorExample {

	public static void main(String[] args) {

		// 삼항 연산자는 (조건식 ? 결과1 : 결과2) 형식으로 작성
		// 해당 위치에 조건이 참이면 결과, 거짓이면 결과2 출력
		int height = 130;
		int height2 = 129;
		
		String result1 = (height < 130 ? "무료입장." : "유료입장.");
		String result2 = (height2 < 130 ? "무료입장." : "유료입장.");
		
		System.out.println(result1);
		System.out.println(result2);
	}

}
