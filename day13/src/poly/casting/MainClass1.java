package poly.casting;

public class MainClass1 {

	public static void main(String[] args) {
		/*
		 * 부모 타입 변수로 자식 타입 인스턴스 호출 시
		 * 
		 * 1. 부모클래스에만 선언된 메서드
		 * 		부모쪽으로 호출
		 * 2. 부모클래스 자식 클래스 모두에 선언된 메서드(오버라이딩)
		 * 		자식클래스의 메서드로 호출
		 * 3. 자식 클래스에만 선언된 메서드
		 * 		호출 불가
		 */

		// Promotion이 적용되면 자식 클래스에만 정의된 요소 조회 불가능
		Parent p = new Child();
		p.method1(); // Parent에만 정의된 메서드
		p.method2(); 
		// 오버라이딩된 메서드는 타입 상관없이 인스턴스의 자식 쪽 메서드 호출
		// p.method3(); // 부모 쪽 지역변수로는 자식쪽에만 있는 요소 호출 불가능
		System.out.println("==================");
		
		Child c = (Child)p; // 부모 타입 변수를 자식으로 강제 형변환(Casting)
		c.method3(); // 형변환 후에는 자식쪽에만 있는 요소도 호출 가능
		
		Child cc = new Child(); // 애초에 자식타입 변수에 인스턴스 대입 시,
		cc.method3(); // 별다른 조치 없이 호출 가능
	}

}
