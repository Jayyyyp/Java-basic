package example.encap.bad;

public class MainClass {

	public static void main(String[] args) {

		// 같은 패키지 내부 클래스 파일을 가져다 쓸 때는 import가 필요없다.
		MyBirthday b = new MyBirthday();
		
		b.year = 2023;
		b.month = 13; // 13월을 넣어도 동작함
		b.day = 32; // 일자도 32일이 동작함
		
		b.showDateInfo();

	}

}
