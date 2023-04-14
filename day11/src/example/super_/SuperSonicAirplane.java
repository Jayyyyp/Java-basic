package example.super_;

public class SuperSonicAirplane extends Airplane {
	// 상속받는 멤버변수 없음
	
	public SuperSonicAirplane(String planeCode) {
		super(planeCode); // 현 구조에서는 Airplane의 생성자 호출
	}
	
	// 초음속 비행기도 fly()를 사용해야 하므로 오버라이딩을 한다.
	// 시속 900km 이하에서는 일반 비행을(전 fly())
	// 그 이후는 초음속 비행(재정의된 fly())
	@Override
	public void fly() {
		if(this.speed <= 900) {
			super.fly();
		}else if(this.speed + 300 <= 2200 && this.gas >= 5) {
			this.speed += 300;
			this.gas -= 5;
		}else if(this.speed + 300 >= 2200 && this.gas >= 5){
			this.speed = 2200;
			this.gas -=5;
		}else {
			System.out.println("연료가 부족합니다.");
		}
	}
}
