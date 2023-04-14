package day09;

public class GarbageCollecterTest {
	
	public int objectNum; // 객체 번호
	
	// 생성자(객체가 힙에서 생성되기 직전에 메서드)
	public GarbageCollecterTest(int number) {
		objectNum = number;
	}
	
	// 소멸자(객체가 힙에서 삭제되기 직전에 실행되는 메서드)
	@Override // 안써도 되지만, 유지보수 측면에서 작성되어있는게 좋다(오타방지)
	protected void finalize() throws Throwable{
		System.out.println(objectNum + "번 객체가 힙에서 삭제됩니다.");
	}
}
