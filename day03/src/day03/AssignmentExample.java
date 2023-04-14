package day03;

public class AssignmentExample {

	public static void main(String[] args) {

		// 선언과 초기화는 한 줄에 가능
		int a = 5, b = 5;
		
		//확장 대입 연산자는 해당 연산의 결과를 변수에 즉시 저장
		a += 3; // a = a + 3
		System.out.println(a);
		
		b /= 2; // b = b / 2
		System.out.println(b);
		
		// b는 위의 구문때문에 2로 초기화된 상태
		// 만약, b + 3 구문은 쓰게되면 해당라인만 초기화된 상태임
		b %= 2; // b = b % 2
		System.out.println(b);
		
	}

}
