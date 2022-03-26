package extend.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Human> humanList = new ArrayList<>();
		humanList.add(new Brave());
		humanList.add(new Fighter());
		humanList.add(new Wizard());

		List<Monster> monsterList = new ArrayList<>();
		monsterList.add(new Slime());
		monsterList.add(new Oak());
		monsterList.add(new Dragon());

		// 対戦回数に初期値代入
		int battleCount = 1;
		// 人間のリストが1以上の場合かつモンスターのリストが1以上の場合繰り返す。
		while (humanList.size() >= 1 && monsterList.size() >= 1) {
			// 人間をランダムで取得
			int humanIndex = Rand.get(humanList.size());
			Human human = humanList.get(humanIndex);
			// モンスターをランダムで取得
			int monsterIndex = Rand.get(monsterList.size());
			Monster monster = monsterList.get(monsterIndex);
			// 人間とモンスター交互に攻撃
			if (battleCount % 2 == 1) {
				System.out.println("人間のターン！");
				human.attack(monster);
				// 攻撃対象のモンスターのHPが0以下になった場合
				if (monster.hp <= 0) {
					System.out.println(monster.name + "は倒れた。");
					monsterList.remove(monster);
					// モンスターリストが0になった場合
					if (monsterList.size() == 0) {
						System.out.println("人間達は勝利した！");
					}
				}
			} else {
				System.out.println("モンスターのターン！");
				monster.attack(human);
				// 攻撃対象の人間のHPが0以下になった場合
				if (human.hp <= 0) {
					System.out.println(human.name + "は倒れた。");
					humanList.remove(human);
					// 人間リストが0担った場合
					if (humanList.size() == 0) {
						System.out.println("モンスター達は勝利した！");
					}
				}
			}
			battleCount += 1;
		}
	}
}
