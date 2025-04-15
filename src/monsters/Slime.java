package monsters;

import bases.Monster;
import utils.Dice;

public class Slime extends Monster {
	
	//コンストラクタ
	public Slime(String name,String weapon) {
		
		//親クラスのコンストラクタを利用
		super(name,weapon);
		
		//ヒットポイントの乱数範囲：70～130
		hp = Dice.get(70, 130);
		
		//攻撃力の乱数範囲：5～11
		offensive = Dice.get(5,11);
		
	}

}
