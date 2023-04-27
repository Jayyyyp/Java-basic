package collection.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HashMapLottoExample {

	public static void main(String[] args) {

		/*
		 * 1. lotto 복권은 1 ~ 45 범위의 숫자 중 6개를 뽑아 추첨하는 복권이다.
		 *    List<Integer> 타입 변수에 구현체를 대입하고, 
		 *    해당 변수에 중복 없이 6개의 번호가 들어가게 하자
		 * 2. 1번 완성 시, 당첨될 때까지 다시 번호를 무작위로 뽑는 코드 작성
		 * 	  그리고 몇 번 만에 로또가 당첨되는지 확인하는 시뮬레이션 코드 만들기
		 * hint : equals()로 배열끼리 비교시, 배열 내부 요소 순서와 자료 모두를 비교
		 *  ex) [1,2,3]과 [1,2,3] 은 true
		 *  	[1,2,3]과 [1,3,2] 는 false 
		 */
		
		List<Integer> winNumber = new ArrayList<>();
		Random random = new Random();
		int tries = 0;
		
		while(true) {
			List<Integer> lottoNumbers = new ArrayList<>();

            while (lottoNumbers.size() < 6) {
                int number = random.nextInt(45) + 1;
                if (!lottoNumbers.contains(number)) {
                    lottoNumbers.add(number);
                }
            }

            tries++;

            if (lottoNumbers.equals(winNumber)) {
                System.out.println("당첨 번호: " + lottoNumbers);
                System.out.println("시도 횟수: " + tries + "번 만에 당첨되셨습니다!");
                break;
            } else {
            	winNumber = lottoNumbers;
            }
        }
    }
}