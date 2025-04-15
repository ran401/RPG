package bases;

import utils.Dice;

//人間を表現する抽象クラス
public abstract class Human extends Living{
	
	//コンストラクタ
	public Human (String name,String weapon) {
		super(name,weapon);
	}
	
	//attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {
		
		//1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		int damage = offensive * Dice.get(1, 10);
		
		//相手のHPをダメージ値だけ減らす
		target.hp -= damage;
		
		//自分の攻撃力を1だけ減らす
		offensive -= 1;
		
		//コンソールにステータスを表示
		System.out.println("\n「" + name + "」が「" + weapon + "」で攻撃！「" + target.name +"」に" + damage + "のダメージを与えた。");
		System.out.println("しかし自分の攻撃力も１減少した。");
		
	}
	
	
}
