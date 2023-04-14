package day03;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {

		// 스캐너 객체 생성
		Scanner scan = new Scanner(System.in);
				
		// 스캐너 클래스가 가진 입력 기능을 이용해 값을 입력받음
		System.out.println("메뉴번호를 입력해주세요");
		System.out.println("1. 아메리카노, 2. 카페라떼, 3. 아이스티");
		
		int order = scan.nextInt(); 
			switch(order) {
				case 1 : 
				System.out.println("주문하신 아메리카노가 나왔습니다");
				break; // case 마다 마지막으로 작성해야 코드가 흘러내리지 않음
				case 2 : 
				System.out.println("주문하신 카페라떼가 나왔습니다");
				break;
				case 3 : 
				System.out.println("주문하신 아이스티가 나왔습니다");
				break; // 마지막 case에는 break를 달지 않지만, 가독성 문제로 달기도 함
				default :
					System.out.println("주문하신 상품은 없는 상품입니다");
			}
		System.out.println();
				
		// 사용한 스캐너는 종료
		scan.close();

	}

}
