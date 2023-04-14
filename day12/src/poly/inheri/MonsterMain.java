package poly.inheri;

public class MonsterMain {

	public static void main(String[] args) {

		Warrior warrior = new Warrior("전사");
		Rabbit rabbit1 = new Rabbit();
		Rat rat1 = new Rat();

		warrior.hunt(rabbit1);
		warrior.showStatus();
		
		warrior.hunt(rat1);
		warrior.showStatus();
		warrior.hunt(rat1);
		warrior.showStatus();
		
	}

}
