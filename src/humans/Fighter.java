package humans;

import bases.Human;
import utils.Dice;

public class Fighter extends Human {
	
	//コンストラクタ
	public Fighter(String name,String weapon) {
		
		//親クラスのコンストラクタを利用
		super(name,weapon);
		
		//ヒットポイントの乱数範囲：240～300
		hp = Dice.get(240,300);
		
		//攻撃力の乱数範囲：17～23
		offensive = Dice.get(17,23);
		
	}
	
}
