package lotto;

import java.util.List;

public class LottoWinSimulatorMain {

	public static void main(String[] args) {

		LottoWinSimulationGoodCase ls = new LottoWinSimulationGoodCase();
		
		List<Integer> lottoWinNumbers = ls.getLottoNumbers();
		
		List<Integer> lottoGetNumbers = ls.getLottoNumbers();
		
		ls.tryWinLoop(lottoWinNumbers, lottoGetNumbers);
		System.out.println(ls.getCount() + "번 만에 당첨되셨습니다.");
	}

}
