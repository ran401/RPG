package monsters;

import bases.Monster;
import utils.Dice;

public class Dragon extends Monster {
	
	//コンストラクタ
	public Dragon(String name,String weapon) {
		
		//親クラスのコンストラクタを利用
		super(name,weapon);
		
		//ヒットポイントの乱数範囲：270～330
		hp = Dice.get(270, 330);
		
		//攻撃力の乱数範囲：12～18
		offensive = Dice.get(12,18);
		
	}
}
