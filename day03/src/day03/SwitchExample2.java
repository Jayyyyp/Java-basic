package day03;

public class SwitchExample2 {

	public static void main(String[] args) {

		// 배열과 연동하여 코드 작성
		String[] foods = {"삼겹살", "돈카츠", "베이징덕", "팟씨유", "커리"};
		
		// 0~ 4 범위 정수 난수를 얻기
		int idx = (int)(Math.random()*5);
		System.out.println(foods[idx]);
		
		switch(foods[idx]) {
			case "삼겹살" :
				System.out.println("한국요리입니다.");
				break;
			case "돈카츠" :
				System.out.println("일본요리입니다.");
				break;
			case "베이징덕" :
				System.out.println("중국요리입니다.");
				break;
			default :
				System.out.println("기타 요리입니다.");
		}

	}

}
