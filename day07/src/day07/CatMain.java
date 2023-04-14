package day07;

public class CatMain {

	//고양이를 조회하는 용도로 사용할 전용 메서드 작성
	public static void showCatInfo(Cat Cat) {
		System.out.println("고양이의 종 : " + Cat.kind);
		System.out.println("고양이 나이 : " + Cat.age);
		System.out.println("고양이 색깔 : " + Cat.color);
		System.out.println("고양이 성별 : " + Cat.gender);
		System.out.println();
	}
	

	public static void main(String[] args) {

		// c1
		Cat c1 = new Cat();
		
		c1.kind = "길냥이";
		c1.age = 20;
		c1.color = "Brown";
		c1.gender = "Female";	
		showCatInfo(c1);
		
		// c2
		Cat c2 = new Cat();
		
		c2.kind = "길냥이";
		c2.age = 10;
		c2.color = "Black";
		c2.gender = "Male";
		showCatInfo(c2);
		
		// c3
		Cat c3 = new Cat();
		
		c3.kind = "길냥이";
		c3.age = 15;
		c3.color = "White";
		c3.gender = "None";
		showCatInfo(c3);
		
	}

}
