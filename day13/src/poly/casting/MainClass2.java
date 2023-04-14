package poly.casting;

public class MainClass2 {

	public static void main(String[] args) {

		// Parent 타입에는 Child, Child 2 모두 대입 가능
		Parent p1 = new Child();
		Parent p2 = new Child2();
		// Child1의 method2도, Child2의 method2도 호출 가능
		p1.method1();
		p1.method2();
		p2.method1();
		p2.method2();
		// 하지만 오버라이딩이 전제되지 않은 method3는 호출 불가능
		// p1.method3();
		
		Child c1 = new Child();
		c1.method1();
		c1.method2();
		c1.method3();
		// Parent 타입과는 달리 Child는 Child 인스턴스만 대입이 가능
		// Child c2 = new Child2();
		// Child와 Child2는 자료형이 다르기때문에 대입이 불가능

	}

}
