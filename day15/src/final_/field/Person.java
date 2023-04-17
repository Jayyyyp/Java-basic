package final_.field;

public class Person {

	/*
	 * final 변수는 단 한 번 초기화될 수 있고
	 * 이후에는 변경이 불가능하기 때문에 
	 * 선언 시, 아예 직접 초기화를 해주거나
	 * 생성자에서 초기화를 해 줘야 한다
	 */
	public final String nationality = "대한민국"; // 선언부 초기화
	public final String name; // 여기서 초기화 하지 않으면 무조건 생성자 초기화
	public int age; // final이 안붙은 멤버변수는 초기화 의무 x
	
	public Person(String name) {
		this.name = name;
	}
}
