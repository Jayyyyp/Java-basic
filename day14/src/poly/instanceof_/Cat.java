package poly.instanceof_;

public class Cat {

	private String name;
	private int age;
	
	// String, int 파라미터로 생성자를 완성시키기
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void meow() {
		System.out.println("야옹 야옹");
	}
}
