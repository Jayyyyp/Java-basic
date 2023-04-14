package day02;

public class CastingExample2 {

	public static void main(String[] args) {
		
		/*
		 * 크기가 큰 데이터를 작은 데이터타입으로 바꾸려면
		 * 반드시 캐스팅 연산자(type)를 사용하여
		 * 명시적으로 형변환(downcasting)
		 */
		int i = 72;
		//char c = i; / int -> char는 자동 변환이 되지 않으므로 char로 바꾼다 명시
		char c = (char)i;
		System.out.println(c);
		System.out.println("-------");

		
		/*
		 * 강제 형변환의 경우 데이터 손실이 일어날 가능성이
		 * 있기 때문에 자동으로 처리 X
		 */
		double d = 4.83123;
		//int j = d; / 변환 시, 소수점 아래가 손실되므로 자동변환 허용 X
		int j = (int)d;
		System.out.println(j);
		System.out.println("-------");
		
		
		/*
		 * 강제 형변환 시, 주의점은 데이터 타입이
		 * 처리할 수 있는 범위를 넘어선 데이터를 강제로 downcasting하면
		 * overflow가 일어남
		 */
		int k = 1024; // 00000000 00000000 00000010 00000000
		byte b = (byte)k; // -128 ~ 127 범위에 1024 집어넣기
		System.out.println(b);
		System.out.println("-------");
	}

}
