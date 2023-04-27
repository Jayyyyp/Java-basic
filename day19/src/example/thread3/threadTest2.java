package example.thread3;

public class threadTest2 extends Thread {
    
    static int share;
    
    public static void main(String[] args) {
    	threadTest2 t1 = new threadTest2();
    	threadTest2 t2 = new threadTest2();
      
      t1.start();
      t2.start();
    }
    
    // 쓰레드 안전을 위해서 사용하는 메서드
    public static void sharePlus() {
        System.out.println(share++); 
    }
    
    public void run() {
      for(int count = 0; count < 10; count++){ 
    	  sharePlus(); // 메서드를 이용해 share 1 증가
        try { sleep(25); }
        catch (InterruptedException e) {}
      }
    }
}
