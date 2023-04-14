package day05;

import java.util.Scanner;

public class ForStarQuiz2 {
	public static void main(String[] args) {
		/*
		 * 중첩 반복문을 사용하여 반대로 별찍기
		 * ex) 5 입력
		 *   *****
		 *   ****
		 *   ***
		 *   **
		 *   *
		 */
		Scanner scan = new Scanner(System.in);
		int star = scan.nextInt();
		scan.close();
		for(int i = 1; star >= i; i++) {
			for(int j = 1; i >= j; j++) {
				System.out.print("*");
			}System.out.println(); // for(i)
		} //for(j)
	}
	}
