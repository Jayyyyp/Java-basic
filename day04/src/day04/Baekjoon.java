package day04;

import java.util.Scanner;

public class Baekjoon {

	public static void main(String[] args) {

		/* 1000번 문제
		 * 두 정수 A와 B를 입력받은 다음, A+B 출력하는 프로그램 작성ㄷ
		 * 첫째 줄에 A와 B가 주어진다
		 * 첫째 줄에 A+B를 출력한다
		 */
		
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		System.out.println(A + B);
		scan.close();
	}

}
