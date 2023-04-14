package example.modi.member.pack1;

public class B {
	
	// 생성자 내부에 코드 작성
	public B() {
		
		A a = new A();
	
		a.a = 1; // public
		a.b = 1; // default
		// a.c = 1; // private
		
		a.method1(); // public
		a.method2(); // default
		// a.method3(); // private
	
}
}