package day06;

public class MethodExample1 {
	/*
	 * 1. 메서드의 정의(선언)이 이루어져야 추후 호출 할 수 있다.
	 * 2. 메서드의 선언은 메서드 내부에서 할 수 없다.
	 * 	  클래스 내부이면서 다른 메서드 외부에 작성해야 한다.
	 * 3. 메서드 내부에서는 다른 메서드의 호출만 가능하다.
	 * 4. 호출하는 과정 중 다른 메서드 내부 지역으로 이동하여 해당 코드를 실행하고
	 *    타 메서드 호출이 끝나면, 원래 호출했던 그 위치로 복귀한다.
	 */

	public static void sayHello() { // sayHello 함수
		System.out.println("안녕하세요, sayHello 메서드를 호출하셨네요");
		System.out.println("다음에 또 호출해주세요.");
	}
	
	public static int calcSum(int x) { // calcSum 함수
		int sum = 0;
		for(int i = 1; i <= x; i++) {
			sum +=i;
		}
		return sum; // 34번라인에 55 저장
	}
	
	public static int totalSum(int a, int b) { // totalSum 함수
		return a+b;
	}
	
	public static void main(String[] args) {  // main 함수
		// 단독 메서드 호출 구문은 아래와 같이 이탤릭체로 표시된다.
		sayHello();
		// 리턴 구문은 콘솔창에 출력되는 것을 보장하지 않는다.
		//calcSum(10); // calcSum은 55가 호출되어있지만, 출력 구문을 적지 않아 출력X
		System.out.println(calcSum(10)); // 10의 값이 18번~24번 구문 실행 후, 사라짐
		// System.out.println(x, sum); // x와 sum변수는 main 지역에서 사라져서 오류발생
		// totalSum(1,2); // totalSum은 3이 호출되어 있지만, 출력 구문을 적지 않아 출력X
		System.out.println(totalSum(1, 2));
	}
}
