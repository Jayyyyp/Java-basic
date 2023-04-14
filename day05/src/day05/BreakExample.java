package day05;

public class BreakExample {

	public static void main(String[] args) {
		/* 
		 * 무한루프는 보통 break와 조합해 사용
		 */

		int i = 0;
		while(true) {
			if(i==15)
				break; // if, for, while 등은 타겟구문이 1줄일 경우 중괄호 필요 X
			System.out.println(i);
			i++;
		}
		
	}

}
