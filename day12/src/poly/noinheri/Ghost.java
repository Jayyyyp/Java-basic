package poly.noinheri;

public class Ghost {

		private int hp;
		private int atk;
		private int def;
		
		public Ghost() {
			hp =  7;
			atk = 5;
			def = 1;
		}

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
			public boolean isGhostActive() {
				return hp > 0 ? true : false;
			}
			
			// 공격 받은 뒤에 살아있는지, 죽어있는지 체크
			public boolean isAttackGhostActive(int userAtk) {
				return (hp - userAtk) > 0 ? true : false;
			}
			
			public void setDamagedHP(int userAtk) {
				this.hp = this.hp - (userAtk - this.def);
			}
		
	}

