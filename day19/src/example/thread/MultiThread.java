package example.thread;

// 보조쓰레드에서 실행할 내용을 정의하기 위해
// 1. Runnable 인터페이스를 구현한다.
public class MultiThread implements Runnable {

	// Runnable 인터페이스를 오버라이딩해 
	@Override
	public void run() {
		// 여태까지 코드는 순차적으로 쉬는시간 없이 실행되었음
		// Thread.sleep(초); 는 해당 쓰레드 실행을 입력한 초만큼 중단한다.
		// 쓰레드 중지는 try~catch 블럭에 반드시 넣어야 한다.
		try {
			for(int i = 0; i < 500; i++) {
				System.out.println("보조 쓰레드 : 실행" + i);
				Thread.sleep(1000);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
