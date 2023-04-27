package example.thread3;

public class threadTest extends Thread {
    
    static int share;
    
    public static void main(String[] args) {
    	threadTest t1 = new threadTest();
    	threadTest t2 = new threadTest();
      
      t1.start();
      t2.start();
    }
    
    public void run() {
      for(int count = 0; count < 10; count++){
        System.out.println(share++); 
        
        try { sleep(1000); }
        catch (InterruptedException e) {}
      }
    }
}
