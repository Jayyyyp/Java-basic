package poly.noinheri;

public class MainClass4 {

	public static void main(String[] args) {

		Pig pig1 = new Pig();
		
		Warrior w1 = new Warrior("돼지잡기");
		
		w1.huntPig(pig1);
		w1.showStatus();
		w1.huntPig(pig1);
		w1.huntPig(pig1);
		w1.huntPig(pig1);
		w1.huntPig(pig1);
		w1.showStatus();
		w1.huntPig(pig1);

	}

}
