package day03;

public class BitOperatorExample {

	public static void main(String[] args) {

		byte a = 5; // 0000 0101
		byte b = 3; // 0000 0011
		
		// 비트곱(AND, &)
		System.out.println(a & b); // 0000 0001

		// 비트합(OR, |)
		System.out.println(a | b); // 0000 0111
		
		// 배타적 논리합(XOR, ^)
		System.out.println(a ^ b); // 0000 0110
		
		// 비트 이동 연산자(<<, >>)
		System.out.println(a << b); // 0010 1000 a를 b만큼 좌측 비트 이동(*2^3)
		System.out.println(a >> 2); // 0000 0001 a를 b만큼 우측 비트 이동(/2^2)
	}

}
