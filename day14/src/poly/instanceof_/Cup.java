package poly.instanceof_;

public class Cup {

	private String itemName;
	private int price;
	private String companyName;
	
	// String, int 파라미터를 입력받는 생성자 만들기
	// 상품명, 가격은 입력된 대로, 제조사는 "컵회사"로 고정하기
	public Cup(String itemName, int price) {
		this.itemName = itemName;
		this.price = price;
		this.companyName = "컵회사";
	}
	// void 파라미터로 생성자 정의, 생성자 호출시 자동으로 멤버변수를 
	// "입력안됨", "0", "컵회사"로 초기화
	public Cup() {
		this.itemName = "입력안됨";
		this.price = 0;
		this.companyName = "컵회사";
	}
}
