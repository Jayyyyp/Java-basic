package poly.inheri;

public class MainClass1 {

	public static void main(String[] args) {

		Rat rat1 = new Rat();
		//Warrior w1 = new Warrior("전사");
/*
		w1.hunt(rabbit1);
		w1.showStatus();
		
		w1.hunt(rat1);
		w1.showStatus();
		w1.hunt(rat1);
		w1.showStatus();
		w1.hunt(rat1);
		*/
		
		Magician m1 = new Magician("마법사");
		
		m1.castFireball(rat1);
		m1.showStatus();
		m1.castFireball(rat1);
	}

}
