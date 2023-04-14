package poly.noinheri;

public class Rat {

	private int hp;
	private int atk;
	private int def;
	
	public Rat() {
		hp = 5;
		atk = 1;
		def = 0;
	}
	// getter/setter 생성

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
	// 해당 몬스터 사망 여부를 boolean으로 체크해주는 getter
	public boolean isRatActive() {
		return hp > 0 ? true : false;
	}
	
	// 공격 받은 뒤에 살아있는지, 죽어있는지 체크
	public boolean isAttackRatActive(int userAtk) {
		return (hp - userAtk) > 0 ? true : false;
	}
	
	public void setDamagedHP(int userAtk) {
		this.hp = this.hp - (userAtk - this.def);
	}
	
}
