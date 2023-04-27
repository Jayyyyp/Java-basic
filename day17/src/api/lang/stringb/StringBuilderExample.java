package api.lang.stringb;

public class StringBuilderExample {

	public static void main(String[] args) {

		// StringBuffer로 대체 가능
		// StringBuffer는 쓰레드 안전을 보장한다.
		// StringBuilder는 쓰레드 안전을 보장하지 않는다.
		// StringBuilder는 지역 내에서 선언해 쓸 때 위주로 많이 사용한다.
		StringBuilder sb = new StringBuilder("JAVA");

		// 문자열 끝에 추가하는 메서드 append( )
		sb.append(" Program Study"); // sb + "Program Study" 와 동일
		System.out.println(sb);
		
		// 문자열을 특정 인덱스 위치에 삽입하는 메서드 insert( )
		sb.insert(12, "ming"); // 12번의 위치 뒤에 ming을 삽입
		System.out.println(sb);
		
		// 특정 인덱스 범위 문자열을 교체하는 메서드 replace( )
		sb.replace(5, 16, "Book"); // 문자열 5번~15번까지의 문자열을 Book으로 교체
		System.out.println(sb);
		
		// 문자열을 삭제하는 메서드 delete(begin, end)
		// JAVA Study
		sb.delete(4, 9);
		System.out.println(sb); // 문자열 4번 ~ 8번까지의 문자열을 삭제
		
		System.out.println(sb.length());
	}

}
