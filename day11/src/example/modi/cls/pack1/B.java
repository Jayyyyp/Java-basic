package example.modi.cls.pack1;

// pubilc 접근 제한자는 어디서나 접근 가능


public class B {
	/*
	 * 클래스 A의 접근제한자가 default이기 때문에
	 * 같은 패키지 내부인 B에서 A를 선언 할 수 있다.
	 * 
	 * A 선언 허용
	 */
	A a = new A();
}
