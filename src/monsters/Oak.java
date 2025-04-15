package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster {
	
	//コンストラクタ
	public Oak(String name,String weapon) {
		
		//親クラスのコンストラクタを利用
		super(name,weapon);
		
		//ヒットポイントの乱数範囲：170～230
		hp = Dice.get(170, 230);
		
		//攻撃力の乱数範囲：9～15
		offensive = Dice.get(9,15);
		
	}
}
