package api.lang.string;

public class StringReplace {

	public static void main(String[] args) {

			// 자바는 15버전부터 멀티라인 문자열을 지원한다.
		 	// 자바 문자열은 여닫는 " " 를 한 줄에 작성해야 했다.
		  	String a = "가나다라";  // 허용
		  	// String a = "가나다라
		  	//						마바사"; (허용안함)
		  	
		  	// 여닫는 따옴표를 여러 줄에 걸쳐서 작성할 때는 """ 세 개 를 이용
		  	String notice = """ 
		  				두번째 줄부터
		  				써야돼
		  			""";
		  		System.out.println(notice);
		  		// replace( )는 String을 리턴하고, 첫 단어를 두 번째 단어로 바꿔준다.
		  		String newNotice = notice.replace("두번째", "세번째");
		  		System.out.println(newNotice);

	}

}
