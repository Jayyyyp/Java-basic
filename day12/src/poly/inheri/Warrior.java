package poly.inheri;

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
			System.out.println("---------------------");
		}

		// 파라미터로 모든 몬스터의 부모인 Monster를 선언하면
		// 다형성 원리에 의해 상속받은 모든 몬스터 대입이 가능
		public void hunt(Monster monster){
			// 죽은 몬스터는 교전 불가 및 종료
			if(monster.getHp() <= 0) {
				System.out.println(monster.getName() + "가 이미 죽었습니다.");
			}
			// 죽은 몬스터가 다음 공격에 죽으면 플레이어에게 겸치
			if(monster.getHp()-this.atk <= 0) {
				monster.setHp(monster.getHp() - (this.atk - monster.getDef()));
				System.out.println(monster.getName() + "를 공격합니다.");
				System.out.println(monster.getName() + "를 죽였습니다!");
				this.exp += monster.getExp();
				System.out.println("경험치 "+monster.getExp()+" 획득");
			}
			// 몬스터가 다음 공격에 죽지않으면 반격하여 체력 차감
			else {
				monster.setHp(monster.getHp() - (this.atk - monster.getDef()));
				this.hp -= monster.getAtk();
				System.out.println(monster.getName() + "를 공격합니다.");
				System.out.println(monster.getName() + "가 죽지 않아 반격합니다.");
			}
			
			
			
		}
}
