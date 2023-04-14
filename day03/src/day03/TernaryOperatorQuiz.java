package day03;

public class TernaryOperatorQuiz {

	public static void main(String[] args) {

		// 난수 발생 명령어 Math.random()
		// 해당 위치에 0보다는 크고 1보다는 작은 난수를 가져다 둠	
		int randomNumber = (int)(Math.random() * 10);
		
		// 삼항 연산자를 이용해 난수값이 7보다 크면 "당첨" 7이하이면 "낙첨"
		System.out.println(randomNumber);
		String result = (randomNumber > 7 ? "당첨." : "낙첨.");
		
		System.out.println(result);

	}

}
