package day04;

public class Baekjoon2438 {

	public static void main(String[] args) {

		int star = 5;
		int n = 1;
		int j = 1;
		while(n <= star) {
			while(j <= n) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			n++;
		}

	}

}
