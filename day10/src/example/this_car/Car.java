package example.this_car;

public class Car {
	
	public String model; // 멤
	public int speed; // 멤
	
	public Car(String model) {
		this.model = model; // 멤버변수 참조
		// this는 인스턴스에 붙을 수 있는 대명사
		// 멤버변수를 지칭할 때 사용
		this.speed = 0; // 멤버변수 참조
	}
	
	public void accel() {
		if(speed + 10 >= 150) { // 멤버변수 참조
			speed = 150; // 멤버변수 참조
		} else {
			speed +=10; // 멤버변수 참조
		}
	} 
	public void showSatus() {
		System.out.println("모델명 : " + this.model);
		System.out.println("현재 속도 : " + this.speed);
	}

}
