package extend.practice;

public class Slime extends Monster {

	public Slime() {
		name = "スライム";
		hp = 200;
		offensive = 10;
	}

	@Override
	void attack(Living target) {
		// 攻撃力を決める
		int damage = offensive * Rand.get(10);
		// メッセージを出力
		System.out.println(name + "が体当たりで攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
		// 引数のターゲットのhpをへらす
		target.hp -= damage;
	}
	
}
