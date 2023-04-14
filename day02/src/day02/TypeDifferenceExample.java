package day02;

public class TypeDifferenceExample {

	public static void main(String[] args) {
		
		// 정수와 실수 간 연산은 언뜻 보기에 당연히 진행이 될 것 같지만
		// 실제로는 저장받는 자료형에 따라 다른 결과가 나옴
		
		// 정수 + 실수를 정수에 저장하는 경우 연산 불가
		// int result = 1 + 2.5;
		
		double result2 = 1 + 2.5; // 1.0으로 강제로 바꿔 1.0+2.5를 만듬
		
		System.out.println(result2);

	}

}
