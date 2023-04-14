package day09;

public class GarbageCollectorTestMain {

	public static void main(String[] args) {

		for(int i = 0; i < 5; i++) {
			GarbageCollecterTest test = new GarbageCollecterTest(i);
			test = null;
			// null로 인해 연결이 끊어지고, 호출이 불가능하므로, 필요가 없어진다.
			
			// 쓰레기 수집 강제 실행 명령어(쓸 필요 없음)
			System.gc();
		}

	}

}
