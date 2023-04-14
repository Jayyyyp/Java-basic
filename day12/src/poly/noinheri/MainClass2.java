package poly.noinheri;

public class MainClass2 {

	public static void main(String[] args) {

		// 전사 생성하기
		Warrior w1 = new Warrior("전사");
		// rabbit 인스턴스 2개, warrior 인스턴스 1개 생성
		Rabbit rabbit2 = new Rabbit();
		
		w1.showStatus();
		w1.huntRabbit(rabbit2);
		w1.showStatus();
		w1.huntRabbit(rabbit2);
		
		

	}

}
