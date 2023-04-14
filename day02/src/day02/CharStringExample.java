package day02;

public class CharStringExample {

	public static void main(String[] args) {
		
		// 단일 문자를 저장하는 데이터 타입 char
		
		char c1 = 'A';
		char c2 = 66; // 문자는 숫자와 교환 가능, ASCII code 상 65는 A, 66은 B
		// 대문자에 32를 더하면 소문자가 나옴(반대도 가능)
		
		System.out.println(c1);
		System.out.println(c2);
		/*
		 * 한글 '가'를 유니코드로 표현할 때는 AC00인데,
		 * 직접 코드값을 char에 저장할 때는 탈출문자 \(역슬래쉬)u를 왼쪽에 붙임
		 */
		char c3 = '\uAC00';
		System.out.println(c3);
		
		System.out.println("----------");
		
		// 문자열을 저장할 수 있는 데이터 타입 String
		
		String s1 = "my dream"; // String이 보라색으로 안뜨는 이유는 번지수를 저장하여 호출하는 참조형 자료이기 때문
		String s2 = "is a developer";
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
