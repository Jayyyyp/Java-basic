package practice;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		/*
		 * 스무고개 while문 진행
		 * 사용자가 정한 최소값 ~ 최대값 사이 수 맞추기 프로그램
		 * 범위를 벗어나면 다시 입력받게 만들기
		 * 몇번의 시도 끝 맞췄는지 출력
		 */
			
		Scanner scan = new Scanner(System.in);
		System.out.println("최솟값을 입력하세요");
		int min = scan.nextInt();
		System.out.println("최댓값을 입력하세요");
		int max = scan.nextInt();
		int number = (int)(Math.random()+max-min)+min;
		    
		int answer = 0;
		int times =0;
		System.out.println(min + "과" + max + "사이 숫자 맞추기 시작");
		
		while(answer != number) {
			System.out.println("숫자를 입력하세요");
			answer = scan.nextInt();
			
			if(answer < min || answer > max) {
				System.out.println("범위를 벗어났습니다. 다시 입력하세요");
			}else if(number == answer) {
				System.out.println("오~");
			}
			  else if(number < answer) {
				System.out.println("Down~ 더 작은 수를 입력하세요");
				times++;
			} else if(number > answer) {
				System.out.println("Up~ 더 큰 수를 입력하세요");
				times++;
			} 
		}System.out.println("정답입니다!" + times + "번 만에 맞추셨습니다!");
	}
}
