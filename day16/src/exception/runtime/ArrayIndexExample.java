package exception.runtime;

public class ArrayIndexExample {
	public static void main(String[] args) {
		int arr[] = {3,6,9};
		
		// 존재하지 않는 인덱스 번호, 그러나 문법은 맞음
		System.out.println(arr[3]);
	}
}
