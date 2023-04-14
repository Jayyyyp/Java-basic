package day04;

public class WhileExample2 {

	public static void main(String[] args) {

		// 무한루프 - 어떻게 판단해도 "참"이 나올 수 밖에 없는
		// 조건을 while문 조건식에 집어넣기
		// 자연적으로는 절대 종료되지 않으므로, 강제로 종료버튼을 눌러야 해결
		
		while(true) {
			System.out.println("무한루프문입니다.");
		}

	}

}
