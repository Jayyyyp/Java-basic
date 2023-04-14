package poly.noinheri;


public class Warrior {
	
	// 정보 은닉 적용
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	// 생성자 만들기, id만 입력받고
	// 체력은 20, 공격력은 3, 방어력은 1, 경험치는 0	
	public Warrior(String id) {
		this.id = id;
		this.hp = 20;
		this.atk = 3;
		this.def = 1;
		this.exp = 0;
	}
	
	// 캐릭터 상태가 조회 가능한 showStatus() 만들기
	// 이 메서드는 멤버 변수 정보를 콘솔에 찍어줍니다
	public void showStatus() {
		System.out.println("---------------------");
		System.out.println("아이디 : " + this.id);
		System.out.println("체력 : " + this.hp);
		System.out.println("공격력 : " + this.atk);
		System.out.println("방어력 : " + this.def);
		System.out.println("획득 경험치 : " + this.exp);
	}
	
	// 단독적으로 사냥을 하도록 메서드를 만들기
	public void huntRabbit(Rabbit rabbit) {
		if(rabbit.getHp() <= 0 ) {
			System.out.println("이미 죽었습니다..");
			return; // 이미 죽은 토끼는 아래 로직을 실행할 필요X
		}
		// 1. 내가 공격한 rabbit의 체력을 3 깎습니다.
		rabbit.setHp(rabbit.getHp() - this.atk);
		if(rabbit.getHp() <= 0) {
			System.out.println("토끼를 죽였습니다.");
			this.exp += 5;
		}else {
			System.out.println("토끼를 공격했습니다.");
		}
	}
	
	// huntRat을 개선하여, Rat 객체를 지정해 공격하도록 하기
	public void huntRat(Rat rat) {
		// 죽었는지, 안죽었는지 검사
		if(!rat.isRatActive()) {
			System.out.println("쥐는 이미 죽어있습니다..");
			return;
		}
		// 안죽었다면, 공격
		// 공격받고도 안죽으면 반격
		if(!rat.isAttackRatActive(atk)) {
			rat.setDamagedHP(atk);
			System.out.println("쥐를 죽였습니다!");
			this.exp += 80;
			System.out.println("--------------");
		}else {
			System.out.println("쥐를 공격합니다.");
			this.hp -= rat.getAtk();
			rat.setDamagedHP(atk);
			
			System.out.println("쥐를 공격했으나, 반격 당했습니다.");
			System.out.println("--------------");
		
		}
			
	}
	public void huntPig(Pig pig) {
		// 죽었는지, 안죽었는지 검사
		if(!pig.isPigActive()) {
			System.out.println("돼지는 이미 죽어있습니다..");
			return;
		}
		// 안죽었다면, 공격
		// 공격받고도 안죽으면 반격
		if(!pig.isAttackPigActive(atk)) {
			pig.setDamagedHP(atk);
			System.out.println("돼지를 죽였습니다!");
			this.exp += 120;
			System.out.println("--------------");
		}else {
			System.out.println("돼지를 공격합니다.");
			this.hp -= pig.getAtk();
			pig.setDamagedHP(atk);
					
			System.out.println("돼지를 공격했으나, 반격 당했습니다.");
			System.out.println("--------------");
		}		
			
	}
	
	public void huntGhost(Ghost ghost) {
		// 죽었는지, 안죽었는지 검사
		if(!ghost.isGhostActive()) {
			System.out.println("귀신은 이미 죽어있습니다..");
			return;
		}
		// 안죽었다면, 공격
		// 공격받고도 안죽으면 반격
		if(!ghost.isAttackGhostActive(atk)) {
			ghost.setDamagedHP(atk);
			System.out.println("귀신을 죽였습니다!");
			this.exp += 150;
			System.out.println("--------------");
		}else {
			System.out.println("귀신을 공격합니다.");
			this.hp -= ghost.getAtk();
			ghost.setDamagedHP(atk);
					
			System.out.println("귀신을 공격했으나, 반격 당했습니다.");
			System.out.println("--------------");	
		}			
	}	
}
