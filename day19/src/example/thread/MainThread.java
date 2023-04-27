package example.thread;

// 주 쓰레드 역할을 할 클래스
public class MainThread {

	public static void main(String[] args) {
		// 보조쓰레드 실행을 위해서는 먼저 Thread 객체를 생성해야 한다.
		
		// 1. Runnable 구현체를 생성하기
		Runnable trd = new MultiThread();
		
		// 2. Thread 클래스의 인스턴스를 생성하기
		// 생성자 호출시 위의 Runnable 구현체를 파라미터로 넘긴다.
		Thread sTrd = new Thread(trd);
		System.out.println("보조 쓰레드 준비 완료!");
		
		sTrd.start(); // 3. 보조쓰레드 호출
		// 메인 쓰레드 호출이 끝나도, 계속 돌아간다.
		
		System.out.println("먼저 끝날지 알 수 없는 메인 쓰레드");
		

	}

}
