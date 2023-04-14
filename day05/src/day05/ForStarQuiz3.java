package day05;

import java.util.Scanner;

public class ForStarQuiz3 {

	public static void main(String[] args) {
		/*
		 *  별찍기
		 *      *
		 *     **
		 *    ***
		 *    .. 이렇게~
		 */

		Scanner scan = new Scanner(System.in);
		int star = scan.nextInt();
		scan.close();
		
		for(int i = 1; i <= star; i++) { 
			for(int j = star-i; j >= 1; j--) {
				System.out.print(" ");
			} // for(j)
				for(int k = 1; k <= i; k++) {
					System.out.print("*");
				}// for(k)
			System.out.println();
		}// for(i)
	}
}
