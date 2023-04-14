package day04;

public class ParseIntExample {

	public static void main(String[] args) {
							
		// 문자이지만, 숫자로만 이루어진 문자는 int형으로 교환 가능
		String str = "2023";
		
		// Integer.parseInt(교환할 문자);
		int year = Integer.parseInt(str);
		
		System.out.println(str + 1);
		//str 변수는 문자열이므로, 문자열값에 1이 추가되어 출력 = 20231
		System.out.println(year + 1);
		// year 변수는 숫자로 교환했으므로, 숫자값에 1이 추가되어 출력 = 2024
		
		String str2 = "abcd"; // 숫자로 바꿀수 없는 문자
		Integer.parseInt(str2); // 숫자로 교환이 불가능하므로, 에러 발생

	}

}
