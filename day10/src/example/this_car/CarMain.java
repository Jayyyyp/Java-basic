package example.this_car;

public class CarMain {

	public static void main(String[] args) {

		Car myCar = new Car("테슬라");
		Car yourCar = new Car("모닝");
		
		for(int i=0; i<15; i++) {
		myCar.accel();
		}
		myCar.showSatus();
		
		yourCar.accel();
		yourCar.showSatus();

	}

}