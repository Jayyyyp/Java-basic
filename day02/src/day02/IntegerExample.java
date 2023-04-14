package day02;

public class IntegerExample {

	public static void main(String[] args) {
		
		int maxInt = 2147483647; // int로 표현 가능한 최대
		// int maxInt2 = 2147483648; // 최대치를 넘었으므로 오류발생
		System.out.println(maxInt);
		
		System.out.println(maxInt+10);
		//   01111111 11111111 11111111 11111111 
		// + 00000000 00000000 00000000 00001010 
		//   1~~~~~~~ ~~~~~~~~ ~~~~~~~~ ~~~~~~~~ 

		int minInt = -2147483648;
		// 최저에서 1을 빼면 최대값으로 바뀜
		System.out.println(minInt - 1);
	}

}
