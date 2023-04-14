package day06;

public class ContinueExample1 {

	public static void main(String[] args) {

		/*
		 * 짝수만 출력하는 continue 예시
		 */
		for(int i = 1; i < 11; i++) {
			//i = 1 ~ 10까지 1씩 증감하는 반복문
			if(i % 2 != 0) continue;  
			// 만약, i / 2 = 0이 아니라면, 스킵하고, 10번구문으로 돌아가기
			System.out.println(i); // i / 2 = 0이면 출력
			
		}

	}

}
