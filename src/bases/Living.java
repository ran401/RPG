package bases;

public abstract class Living {
	
	// フィールド
	protected String name;		// キャラクターの名前
	protected String weapon;	// 武器名
	protected int hp;			// ヒットポイント（生命力）
	protected int offensive;	// 攻撃力

	// ゲッター、セッター
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWeapon() {
		return this.weapon;
	}
	public void setWeapon(String Weapon) {
		this.weapon = weapon;
	}
	public int getHp() {
		return this.hp;
	}
	public void setHp(int Hp) {
		this.hp = hp;
	}
	public int getOffensive() {
		return this.offensive;
	}
	public void setOffensive(int Offensive) {
		this.offensive = offensive;
	}
	// コンストラクタ
	public Living (String name,String weapon) {
		this.name = name;
		this.weapon = weapon;
	}
	
	public abstract void attack(Living target);
	
	@Override
	public String toString() {
			String alert = "";
			if (this.hp <= 50) {
				alert = "★ HP残りわずか！アブナイ";
			} 
			return String.format("[名前]: %s, [ヒットポイント]: %d, [攻撃力]: %d %s", this.name, this.hp, this.offensive, alert);
	
	}
	
	
}
