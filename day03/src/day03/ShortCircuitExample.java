package day03;

public class ShortCircuitExample {

	public static void main(String[] args) {
		
		// &, |는 모든 결과를 확인하고 넘어가기 때문에
		// 연산효율이 떨어지므로 일반적인 상황에서는 잘 사용 X
		
		// 거짓 & 3 / 0 의 몫은 1이다 라는 명제 (거짓 & ?)
//		System.out.println(false & (3 / 0 == 1));
		// 이미 false가 왼편에 와서 false가 확정이지만, 3 / 0을 수행해 에러 발생
		
		// 거짓 && 3 / 0 의 몫은 1이다 라는 명제 (거짓 && ?)
		System.out.println(false && (3 / 0 == 1));
		// ShortCircuit 연산으로 인해 앞의 false만 보고 false 출력
		
		// 참 || 3 / 0 의 몫은 1이다 라는 명제 (참 || ?)
		System.out.println(true || (3 / 0 == 1));
		// ShortCircuit 연산으로 인해 앞의 true만 보고 true 출력
	}

}
