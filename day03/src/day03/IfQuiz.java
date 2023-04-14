package day03;

public class IfQuiz {

	public static void main(String[] args) {
		
		// 정수를 입력했을 때 음수라면 "음수입니다", 양수라면 "양수입니다."
		// 0이면 "0입니다." 구문 출력
		// 양수라면, 짝수/홀수 구분하여 출력시키기
		int number = 5;
		int number2 = 8;
		System.out.println("입력된 숫자는 "+number+"이므로");
		
		if(number > 0 ){
			System.out.println("양수이며,");
			if(number%2 == 0) {
				System.out.println("짝수입니다.");
			} else if(number%2 != 0){
				System.out.println("홀수입니다.");
			}
		} 	
		else if(number < 0) {
			System.out.println("음수입니다.");
		} 
		else if(number == 0){
			System.out.println("0입니다.");
		}

	//강사님이 한거
	System.out.println(number2+"는");
	if(number2<0) {
		System.out.println("음수입니다.");
	} else if(number2 == 0) {
		System.out.println("0입니다.");
	} else {
		if(number2%2 == 0) {
			System.out.println("짝수 양수입니다.");
		} else if(number2%2 != 0) {
			System.out.println("홀수 양수입니다.");
		}
	}
	}
}
