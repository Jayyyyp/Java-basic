package day05;

public class HomeWork {

	public static void main(String[] args) {

		for(int x = 1; x <= 60; x++) {
			for(int y = 1; y <= 60; y++) {
				if((4*x)+(5*y) == 60 && x > 0 && y > 0) {
					System.out.println("x값은 "+ x + ", y값은 "+ y);
				}
			}
		}

	}

}
