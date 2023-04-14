package day08;

public class BasketBallPlayerMain {

	public static void main(String[] args) {

		BasketBallPlayer b1 = new BasketBallPlayer
				("강백호", 190, 20, 2000);

		b1.showInfo();
		b1.dunkShoot();
		System.out.println();
		
		BasketBallPlayer b2 = new BasketBallPlayer
				("석준민", 191, 25, 8000);

		b2.showInfo();
		b2.dunkShoot();
	}

}
