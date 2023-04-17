package abstract_.noabs;

public class Store extends PopupStore {
	
	@Override
	public void orderApple() {
		System.out.println("착즙 사과주스를 팝니다. 가격은 20,000원");
	}
	
	@Override
	public void orderOrange() {
		System.out.println("착즙 오렌지주스를 팝니다. 가격은 24,000원");
	}
	// 실수로 포도주스를 누락했다고 가정
}
