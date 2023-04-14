package day02;

public class IntegerExample2 {

	public static void main(String[] args) {
			
		byte a = 127;
		short b = 32767;
		int c = 2147483647;
		
		//long d = 2147483648 -> 앞에 자료형이 있어도 int로 간주
		long d = 2147483648L;
		// 2147483648은 int 최대 범위를 넘어서므로 오류 발생
		// int 최대 범위를 넘어서는 수는 2147483647L과 같이 뒤에 L을 붙혀
		// long 자료형 매직넘버로 바꿔야 오류 해결
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//2진수 저장시에 매직넘버 앞에 접두어로 0b를 붙임
		int bin = 0b1010;
		System.out.println(bin);
		
		//8진수 저장시에 정수 앞에 접두어로 0을 붙임
		int oct = 064;
		System.out.println(oct);
		
		//16진수 저장시에 정수 앞에 접두어로 0x를 붙임
		int hex = 0x3a4c; //hexadecimal
		System.out.println(hex);

	}

}
