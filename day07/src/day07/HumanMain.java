package day07;

public class HumanMain {

	public static void main(String[] args) {

		// 타 클래스에 정의된 요소를 main 내부에서 생성해 쓸 수 있다.
		
		// new 키워드는 힙에 자료를 저장한다 
		// 위 명령어로 구조체의 인스턴스를 생성할 수 있다.
		
		// 사람 1 생성
		Human h1 = new Human();
		h1.name = "박재현";
		h1.age = 27;
		h1.height = 183;
		
		System.out.println("사람 1의 이름 : " + h1.name);
		System.out.println(h1); // 주소값 번지수 출력
		// 사람 2 생성
		Human h2 = new Human();
		h2.name = "유재석";
		h2.age = 20;
		h2.height = 180;
		
		System.out.println("사람 2의 키 : " + h2.height);
	}

}
