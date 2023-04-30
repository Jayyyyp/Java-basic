package this_;

public class Car {
	public String model;
	public int speed;
	
	public Car(String m) {
		model = m;
		speed = 0;
	}
	public void accel() {
		if(speed + 10 >= 150) {
			speed = 150;
		}else {
			speed += 10;
		}
	}
	public void showStatus() {
		System.out.println("모델명 : "+model);
		System.out.println("현재 속도 : "+speed);
	}
}
