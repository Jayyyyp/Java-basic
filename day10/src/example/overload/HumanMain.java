package example.overload;

public class HumanMain {

	public static void main(String[] args) {

		// Human 생성
		// 1개는 void 생성자, 다른 하나는 (String, int) 생성자
		
		Human h1 = new Human();
		
		System.out.println(h1.name);
		System.out.println(h1.age);
		
		
		Human h2 = new Human("박자바", 27);
		System.out.println(h2.name);
		System.out.println(h2.age);
	}

}
