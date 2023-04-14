package day04;

public class ForQuiz {

	public static void main(String[] args) {

		/*
		 * 랜덤 구구단 만들기
		 * 구구단의 범위는 1 ~ 9까지(Math.random()) 사용
		 * 난수로 얻은 값의 1 ~ 9로 곱한 값은 for문을 이용해 9바퀴 돌리기
		 */
		int gugudan = (int)(Math.random() * 9 ) + 1;
		for(int i = 1; i < 10; i++) {
			System.out.println(gugudan * i);
		}
		System.out.println(gugudan + "단 입니다.");
	}

}
