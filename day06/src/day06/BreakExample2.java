package day06;

public class BreakExample2 {

	public static void main(String[] args) {

		/*
		 * 내부 반복문에서 break를 사용하여 바깥쪽 반복문까지
		 * 한 번에 종료시키고 싶다면 외부 반복문에 label을 붙인다.
		 */
		
		// outer라는 이름의 label을 외부반복문에 붙이기
		outer : for(int i = 1; i < 5; i++) { // i = 1 ~ 4까지 1씩 증감
			for(int j = 1; j < 5; j++) { // j = 1 ~ 4까지 1씩 증감
				System.out.println(i + "," + j); // i와 j의 값 출력
				if(i == 2 && j == 3) { // 만약 i=2가 참이고, j=3이 참이면 
					break outer; // outer for문 탈출
				} // if
			} // for(j)
		} // outer for(i)

	}

}
