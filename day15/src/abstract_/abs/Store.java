package abstract_.abs;

public class Store extends PopupStore {

	@Override
	public void orderApple() {
		System.out.println("착즙 사과주스는 20,000원이다.");

	}

	@Override
	public void orderOrange() {
		System.out.println("착즙 오렌지 주스는 24,000원이다.");

	}

	@Override
	public void orderGrape() {
		System.out.println("착즙 포도 주스는 18,000원이다.");

	}

}
