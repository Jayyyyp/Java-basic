package day05;

import java.util.Scanner;

public class BreakQuiz1 {

	public static void main(String[] args) {
		/*
		 * 1. 난수 2개를 발생시키세요.(단, 난수는 1~10범위)
		 * 2. while문을 무한루프로 만들어주시고,  위에서 발생된 난수 2개를
		 *    a * b의 답은? 이라고 질문해서 문제를 출제하게 해 주세요
		 *    
		 *  3. if문으로 정답시, break문으로 빠져나오기
		 *  4. 오답인경우, 답을 재입력받기
		 */
		int a = (int)(Math.random() * 10 + 1);
		int b = (int)(Math.random() * 10 + 1);
		int answer = -1; // 나올 수 없는 수로 선언해주기
		System.out.println(a + " * " + b + "= ?");
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			answer = scan.nextInt();
			if((a * b) != answer) {
				System.out.println("오답입니다. 다시 입력해주세요");
			}else if((a * b) == answer) {
				System.out.println("정답입니다!");
				break;
			} 
		}scan.close();
		
	}

}
