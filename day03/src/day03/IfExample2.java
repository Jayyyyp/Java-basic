package day03;

public class IfExample2 {

	public static void main(String[] args) {

		// 난수를 발생시켜 학점 구하기
		int score = (int)(Math.random()*101);
		System.out.println(score+"점");
		
		if(score >= 90) {
			System.out.println("A학점");
		} else if(score >= 80) {
			System.out.println("B학점");
		} else if(score >= 70) {
			System.out.println("C학점");
		} else if(score >=60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}

	}

}
