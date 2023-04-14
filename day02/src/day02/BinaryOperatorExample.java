package day02;

public class BinaryOperatorExample {

	public static void main(String[] args) {
		
		// 산술연산자(+, -, *, /, %)
		int i = 7/3; // 정수 나누기 정수의 결과는 무조건 정수
		int j = 7%3; // 나머지는 정수 최대 몫을 구한 나머지를 말함
		
		System.out.println("7 / 3 몫 = " + i); 
		System.out.println("7 % 3 나머지 = " + j);
		System.out.println("---------------");
		// 문자와 다른 자료형을 더하면 문자가 연장
		
		// 비교연산자(<, <=, >, >=, ==, !=)
		// 컴퓨터에게 특정 명제에 대한 참/거짓 묻기
		System.out.println(i > j); // i가 j보다 큰지 질문
		System.out.println(20 <= 20); // 20이 20보다 작거나 같은지 질문
		System.out.println('가' == 123);
		System.out.println('가' != 123);
		

	}

}
