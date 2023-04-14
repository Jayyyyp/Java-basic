package day05;

import java.util.Scanner;

public class ForStarQuiz {

	public static void main(String[] args) {

		/*
		 * 중첩 반복문을 사용하여 별찍기
		 * 바깥쪽 반복문은 세로, 안쪽 반복문은 가로 길이
		 * 줄이 바뀔 때마다 별 개수가 늘어나게 처리하기
		 */
		Scanner scan = new Scanner(System.in);
		int star = scan.nextInt();
		scan.close();
		for(int i = 1; i <= star; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}System.out.println(); // for(i)
		} //for(j)
	}

}
