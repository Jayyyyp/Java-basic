package example.override;

public class OverrideExample {

	public static void main(String[] args) {

		// 학생 클래스의 인스턴스를 생성
		Student s1 = new Student();
		
		s1.name = "김자바";
		s1.age = 27;
		s1.major = "컴퓨터과학";
		
		s1.자기소개하기();
		s1.코딩하기();
		
		Programer p1 = new Programer();
		
		p1.name = "박학생";
		p1.age = 30;
		p1.career = 3;
		p1.company = "비트캠프";
		
		p1.자기소개하기();
		p1.코딩하기();
	

	}

}
