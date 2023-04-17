package has_a;

public class Gun {

	private int bullet; // 총알 개수
	private String modelName; // 총기 모델
	private String gunNumber; // 총기 번호
	
	public Gun(String modelName, String gunNumber) {
		this.bullet = 5;
		this.modelName = modelName;
		this.gunNumber = gunNumber;
	}
	
	public void shoot() {
		if(bullet > 0) {
			bullet--;
			System.out.println("총을 쐈습니다.");
		} else {
			System.out.println("총알이 없어서 안나갑니다.");
		}
	}
	// 재장전 기능
	public void reload() { 
		this.bullet = 5;
	}
}
