package day05;

import java.util.Scanner;

public class Baekjoon10869 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		scan.close();
		
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);

	}

}
