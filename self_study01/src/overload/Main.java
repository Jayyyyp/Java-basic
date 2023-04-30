package overload;

public class Main {

	public static void main(String[] args) {
		OverloadExample oe = new OverloadExample();
		oe.input(10);
		oe.input("하하");
		oe.input(12, 13);
		oe.input(12, "하하하");

	}

}
