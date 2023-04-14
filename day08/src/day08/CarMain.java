package day08;

public class CarMain {

	public static void main(String[] args) {

		// 자동차를 한 대 생성해주고,
		// 값은 연료 100, 속도 0, 나머지 요소는 자율적 추가
		// 엑셀 3번 밟고 계기판 조회, 브레이크 2번 밟고 계기판 조회
		
		Car vehicle1 = new Car("BMW X3", 5, 0, "재현", 100);
		//    자료형     생성자
		//  (지역변수)

		
		// 반복문으로 작성해도 무방함
		vehicle1.accelerate();
		vehicle1.accelerate();
		vehicle1.accelerate();
		vehicle1.showStatus();
		
		vehicle1.break_();
		vehicle1.break_();
		vehicle1.showStatus();
	}

}
