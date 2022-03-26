package extend.practice;

public class Wizard extends Human {

	public Wizard() {
		name = "魔法使い";
		hp = 300;
		offensive = 15;
	}

	@Override
	void attack(Living target) {
		// 攻撃力を決める
		int damage = offensive * Rand.get(10);
		// メッセージを出力
		System.out.println(name + "が魔法で攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
		// 引数のターゲットのhpをへらす
		target.hp -= damage;
	}
	
}
