package day06;

public class Assignment01 {

	public static void main(String[] args) {

		int lunch = (int)(Math.random() * 5);
		int dinner = (int)(Math.random() * 5);
		String menu[] = {"돈가스", "라멘", "샐러드", "햄버거", "국밥"};
		if(lunch != dinner) {
				System.out.println("점심은 "+ menu[lunch]);
				System.out.println("저녁은 "+ menu[dinner]);
		}else {
			System.out.println("메뉴가 중복되었습니다.");
			System.out.println(menu[lunch]+ ", " + menu[dinner]);
		}
		
	}
}
