package equals.array;

import java.util.Arrays;

public class ArrayEqualsTest {
	public static void main(String[] args) {
		
		// 배열은 참조형 변수이기 때문에, 단순 대입 시 문제가 발생
		int intArray1[] = {1,2,3,4,5};
		System.out.println("배열주소 : " + intArray1);
		System.out.println(Arrays.toString(intArray1));
		System.out.println("-----------------------");
		
		// 새로 생성하지 않고, intArray1을 대입받는 intArray2
		// 단순 대입으로 주소를 복사하는 경우를 얕은 복사라고 함
		
		// 단순 대입으로 스택에서 주소값만 복사하는 게 아닌,
		// 힙의 자료를 새로 똑같은 할당하는 복사를 깊은 복사라고 함
		// 변수 뒤에 .clone()을 써서 수행
		int intArray2[] = intArray1.clone();
		// 주소값이 아닌 내용을 복사
		
		intArray1[0] = 100; // intArray1의 0번째 자리를 100으로 수정하는 구문
		System.out.println(Arrays.toString(intArray1));
		System.out.println(Arrays.toString(intArray2));
		// 20번 구문에서 주소값이 아닌 내용을 복사했기 때문에, [1,2,3,4,5]로 출력
		System.out.println("배열 2의 주소 : " + intArray2);
		// 주소값도 intArray1와 다르게 출력
	}
}
