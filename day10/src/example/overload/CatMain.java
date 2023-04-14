package example.overload;

public class CatMain {

	public static void main(String[] args) {

		Cat c1 = new Cat();
		System.out.println(c1.type);
		System.out.println(c1.name);
		System.out.println("---------------------");
		
		Cat c2 = new Cat("길냥이","호떡");
		System.out.println(c2.type);
		System.out.println(c2.name);
		System.out.println("---------------");
		c2.call();
		c2.call("멍멍");

		
	}

}
