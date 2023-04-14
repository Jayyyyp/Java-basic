package poly.static_var;

public class MainClass {

	public static void main(String[] args) {

		// 인스턴스 생성 전부터 이미 조회 가능한 팀 점수
		System.out.println(Asean.presentationScore);
		
		// 학생 4명 만들어보기
		Asean a1 = new Asean("종훈", 20, 43);
		Asean a2 = new Asean("일윤", 15, 35);
		Asean a3 = new Asean("은영", 19, 40);
		Asean a4 = new Asean("재인", 18, 40);
		
		a1.showStudentScore();
		a2.showStudentScore();
		a3.showStudentScore();
		a4.showStudentScore();
		
		// 어떤 시점에서든 팀 점수만 조회도 가능
		System.out.println(a1.presentationScore);
		

	}

}
