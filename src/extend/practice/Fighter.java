package extend.practice;

public class Fighter extends Human {

	public Fighter() {
		name = "戦士";
		hp = 450;
		offensive = 30;
	}

	@Override
	void attack(Living target) {
		// 攻撃力を決める
		int damage = offensive * Rand.get(10);
		// メッセージを出力
		System.out.println(name + "が斧で攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
		// 引数のターゲットのhpをへらす
		target.hp -= damage;
	}
	
}
