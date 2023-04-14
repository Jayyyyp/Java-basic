package example.overload;

public class Cat {

	public String type;
	public String name;
	
	public Cat() { // void 생성자
		type = null;
		name = null;
	}
	public Cat(String t, String n) {
		type = t;
		name = n;
		System.out.println("지금부터 이 아이의 이름은 "+n);
		System.out.println("품종은 "+t);
	}
	public void call() {
		System.out.println("야옹아 이리와");
	}
	public void call(String name) {
		System.out.println(name + "아 이리와~");
	}
}

