package poly.instanceof_;

public class Human {	
		
		private String name;
		private int age;
		
		// 생성자 만들기
		public Human(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		// void 파라미터 생성자 호출 시, 
		// "noname", 0 을 이름과 나이로 초기화 하는 생성자
		public Human() {
			this("noname", 0);
		}
		
		// showInfo()를 만들어 이름과 나이를 콘솔에 찍히게 하기
		// 보여줘야 하기 때문에 void
		public void showInfo() {
			System.out.println("이름은 " + this.name);
			System.out.println("나이는 " + this.age);
			System.out.println("====================");
		}

}
