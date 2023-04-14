package poly.noinheri;

public class MainClass5 {

	public static void main(String[] args) {

		Magician m1 = new Magician("법사");
		Ghost ghost1 = new Ghost();
		
		m1.huntGhost(ghost1);
		m1.huntGhost(ghost1);
		m1.huntGhost(ghost1);
		m1.showStatus();

	}

}
