package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {
	
	//コンストラクタ
	public Brave(String name,String weapon) {
		
		//親クラスのコンストラクタを利用
		super(name,weapon);
		
		//ヒットポイントの乱数範囲：170～230
		hp = Dice.get(170,230);
		
		//攻撃力の乱数範囲：7～13
		offensive = Dice.get(7,13);
		
	}

}
