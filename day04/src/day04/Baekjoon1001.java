package day04;

import java.util.Scanner;

public class Baekjoon1001 {

	public static void main(String[] args) {
		
		// 스캐너 객체 생성
		Scanner scan = new Scanner(System.in);
		
		int valueA = scan.nextInt();
		int valueB = scan.nextInt();
		
		System.out.println(valueA - valueB);

		scan.close();

	}

}
