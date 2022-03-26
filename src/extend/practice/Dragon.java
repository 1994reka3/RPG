package extend.practice;

public class Dragon extends Monster {
	
	public Dragon() {
		name = "ドラゴン";
		hp = 500;
		offensive = 40;
	}

	@Override
	void attack(Living target) {
		// 攻撃力を決める
		int damage = offensive * Rand.get(10);
		// メッセージを出力
		System.out.println(name + "が炎で攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
		// 引数のターゲットのhpをへらす
		target.hp -= damage;
	}
	
}
