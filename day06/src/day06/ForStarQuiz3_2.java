package day06;

public class ForStarQuiz3_2 {

	public static void main(String[] args) {

		// 중첩 반복문을 쓰되, if문으로 " "와 "*"를 통제
		//    *
		//   **
		//  ***
		// ****
		//*****
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i <= 5 - j) { 
					// i의 값은 고정이고 5-j로 1~5까지 돌렸을 때, 
					// 경우의 수 1번째가 true가 나오게 설계
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}System.out.println();
		}

	}

}
