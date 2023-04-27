package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LottoWinSimulationGoodCase2 {

		
		private int count; // 시도횟수를 조사하는 멤버 변수
		
		// 메서드는 기능 하나를 담당해야 한다.
		// 1 ~ 45 까지의 난수를 하나 뽑는 용도로 메서드를 작성
		public List<Integer> getLottoNumbers(){
			List<Integer> lottoNumbers = new ArrayList<>();
			
			// 중간에서 난수 발생시키면 됨
			Random rn = new Random(); // math.random도 사용 가능(메모리 절약하기 위해)
			
			while(lottoNumbers.size() < 6) {
				Integer getNumber = rn.nextInt(1, 46);
				if(!lottoNumbers.contains(getNumber)) {
					lottoNumbers.add(getNumber);
				}
			}
			Collections.sort(lottoNumbers);
			return lottoNumbers;
		}
		
		// 카운트값을 조회
		public int getCount() {
			return this.count;
		}
		
		// 한 바퀴 돌때마다 1씩 카운트값을 증가
		public void addCount() {
			this.count++;
		}
		
		// 당첨될 때까지 비교 반복하는 메서드
		public void tryWinLoop(List<Integer> winNumbers, List<Integer> getNumbers) {
			while(!winNumbers.equals(getNumbers)) {
				getNumbers = getLottoNumbers();
				addCount();
			}
		}
	

}
