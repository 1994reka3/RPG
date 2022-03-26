package extend.practice;

public class Oak extends Monster {

	public Oak() {
		name = "オーク";
		hp = 300;
		offensive = 20;
	}

	@Override
	void attack(Living target) {
		// 攻撃力を決める
		int damage = offensive * Rand.get(10);
		// メッセージを出力
		System.out.println(name + "が槍で攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
		// 引数のターゲットのhpをへらす
		target.hp -= damage;
	}
	
}
