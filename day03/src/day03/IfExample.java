package day03;

public class IfExample {

	public static void main(String[] args) {

		// 0~100까지의 int 난수를 score 변수에 저장하기(n+1값을 더해야 n값까지 나옴)
		// int score = (int)Math.random()*101의 출력결과가 0이 나오는 이유?
		int score = (int)(Math.random()*101);
		System.out.println("정보처리기사 합/불합 결과");
		System.out.println(score+"점");
		
		// if(조건식){
		//			실행구문들..;
		// }
		
		if(score >= 60) {
			System.out.println("당신은 합격했습니다! 축하드립니다.");
		}
		else{
			System.out.println("불합격입니다.");
		}

	}

}
