package poly.noinheri;

public class MainClass3 {

	public static void main(String[] args) {
		// 쥐를 1마리 생성
		Rat rat1 = new Rat();
		
		Warrior w1 = new Warrior("전사");
		
		w1.showStatus();
		w1.huntRat(rat1);
		w1.huntRat(rat1);
		w1.huntRat(rat1);
		w1.showStatus();
		
	}

}
