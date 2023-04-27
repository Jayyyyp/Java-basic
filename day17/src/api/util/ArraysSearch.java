package api.util;

import java.util.Arrays;

public class ArraysSearch {

	public static void main(String[] args) {

		int scores1[] = {75, 47, 23, 56, 89};
		int scores2[] = Arrays.copyOf(scores1, scores1.length); // 3
		
		// Arrays.sort() : 배열의 데이터를 오름차순으로 정렬하는 메서드
		Arrays.sort(scores2);
		System.out.println("scores1 : " + Arrays.toString(scores1));
		System.out.println("scores2 : " + Arrays.toString(scores2));
		
		// Arrays.binarySearch() : 배열 내부 인덱스 번호를 탐색하는 메서드
		int index = Arrays.binarySearch(scores2, 75);
		System.out.println("75가 저장된 인덱스 번호 : " + index);
		
		// Arrays.equals(배열1, 배열2) : 배열 내부 요소 비교
		int arr1[] = {1, 3, 5, 7, 9};
		int arr2[] = {1, 3, 5, 7, 9};
		
		String result = Arrays.equals(arr1, arr2) ? "항목일치" : "항목 불일치";
		// arr1 == arr2 ? => arr1의 주소값과 arr2의 주소값이 같은가? 질문이기 때문에 자료가 같아도 "항목 불일치" 호출
		System.out.println(result);

	}

}
