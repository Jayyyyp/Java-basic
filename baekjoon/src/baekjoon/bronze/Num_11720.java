package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_11720 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		String numbers = br.readLine();	
		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum += numbers.charAt(i) - '0' ;
		}
		System.out.println(sum);
		
		br.close();

	}

}
