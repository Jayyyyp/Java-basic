package day05;

import java.util.Scanner;

public class IfElseStarQuiz {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int star = scan.nextInt();
		scan.close();
		for(int i = 1; star >= i; i++) {
			for(int j = 1; i >= j; j++) {
				if(i < star - j) {
					System.out.println("*");
				}System.out.print("0");
			}
			}
		}

	}

