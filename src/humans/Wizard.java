package humans;

import bases.Human;
import utils.Dice;

public class Wizard extends Human {

	//コンストラクタ
	public Wizard (String name,String weapon) {
		
		//親クラスのコンストラクタを利用
		super(name,weapon);
		
		//ヒットポイントの乱数範囲：120～180
		hp = Dice.get(120,180);
		
		//攻撃力の乱数範囲：12～18
		offensive = Dice.get(12,18);

	}

}
