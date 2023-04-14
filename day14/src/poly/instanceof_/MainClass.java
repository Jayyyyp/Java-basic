package poly.instanceof_;

public class MainClass {

	public static void main(String[] args) {

		// Human, Student, Cat 인스턴스 생성
		Human h1 = new Human("김자바", 20);
		h1.showInfo();
		
		Student s1 = new Student("학생임", 19);
		s1.showInfo();
		
		Cat c1 = new Cat("룰루", 5);
		c1.meow();
		
		// 소속이 되어있는지 안되어있는지 여부
		System.out.println(h1 instanceof Human); // Human : 부모, h1 : 부모타입 인스턴스
		System.out.println(s1 instanceof Human); // Student : Human의 자식, s1 : 자식타입 인스턴스
		
		// 관련이 아예 없는 객체간 비교는 에러 발생
		// System.out.println(c1 instanceof Human); // c1 상속이 아니어서 오류
		
		System.out.println(h1 instanceof Student); // Student : 자식, h1은 부모타입 인스턴스이므로 오류
		System.out.println(s1 instanceof Student); // Student : 자식, s1은 자식타입 인스턴스
		// System.out.println(c1 instanceof Student);
		

	}

}
