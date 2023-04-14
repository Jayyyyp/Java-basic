package day05;

public class NestedForExample {

	public static void main(String[] args) {

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("*"); // 줄내림이 없고 *만 출력하는 출력문 
			} // 내부 for문(j)
			System.out.println(); // 줄내림만 수행하는 출력문
		} // 외부 for문(i)

	}

}
