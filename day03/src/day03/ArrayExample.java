package day03;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {

		// 배열의 선언 - stack에 배열 주소를 담을 변수 생성
		int[] score; // int score[]; 도 가능
		
		// 배열의 생성 - heap에 실제 데이터가 저장될 공간을 생성
		// 배열은 생성시 크기를 명시함, 한번 크기 세팅 시 조정 X
		score = new int[5]; // int 5개를 담을 수 있는 크기로 score 생성
		// new 명령어는 heap 내부에 저장하라는 명령어
		// heap 내부에 int 5 크기의 배열 생성
		System.out.println(score); // 실제로 주소를 담고 있으므로, 주소 출력(16진수로)

		
		// 배열의 초기화 - 배열 내부에 값을 직접 저장하기
		// 프로그래밍에서는 0부터 세기
		score[0] = 12; // 3d012ddd 주소의 0번째 값을 12로
		score[1] = 67; // 3d012ddd 주소의 1번째 값을 67로
		score[4] = 55; // 3d012ddd 주소의 4번째 값을 55로
		
		// 배열의 값 참조(조회)
		System.out.println(score[0]); // 12
		System.out.println(score[1]); // 67
		System.out.println(score[2]); // 0(지정되지 않은 값은 0으로 출력)
		System.out.println(score[3]); // 0(지정되지 않은 값은 0으로 출력)
		System.out.println(score[4]); // 55
		
		/*
		 * 배열 내부에 저장된 값들을 한 눈에 문자열 형태로
		 * 확인하기 위해서는 Array.toString(배열변수); 를 사용
		 */
		System.out.println(Arrays.toString(score));
		// Arrays에 빨간 줄 뜨면 마우스 올리고, 확장 기능인 Import 'Arrays' 클릭
		
		// 배열의 길이를 알아보려면 변수명.length 
		System.out.println(score.length);
		
		// 배열의 선언과 생성을 동시에 하는 방법
		int[] iArr = new int[7];
		
		// 배열의 선언과 초기화를 동시에 하는 방법 : {}
		int[] iArr2 = {1, 3, 5, 7, 9}; // 중괄호에 넣을 자료를 나열해 대입
		
		System.out.println(Arrays.toString(iArr));
		System.out.println(Arrays.toString(iArr2));
		
	}

}
