package day04;

public class ForExample {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 0; i < 5; i++) { // i를 0 ~ 4 까지 1씩 더하는 반복문
			sum += i;
			// sum에 0,1,2,3,4를 순차적으로 누적해 더하기
		}
		System.out.println("누적된 값은: " + sum);

	}

}
