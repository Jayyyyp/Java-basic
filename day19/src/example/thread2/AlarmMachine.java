package example.thread2;

public class AlarmMachine implements Runnable {
	
	@Override
	public void run() {
		try {
		for(int i = 0; i < 1000; i++) {
			System.out.println("경고음 빽빽");
			Thread.sleep(1000);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	}

}
