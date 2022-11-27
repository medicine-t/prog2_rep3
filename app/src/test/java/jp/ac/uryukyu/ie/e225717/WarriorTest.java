package jp.ac.uryukyu.ie.e225717;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {

    /**
     * Warrior.attackWithWeaponSkillでの攻撃によるHP減少がattackの150%になっているかの確認
     * 検証はWarriorの攻撃に十分な回数耐えることのできるEnemyを生成して行う。
     * attackWithWeaponSkillの仕様から、与えるダメージはattack * 1.5 (== attack * 3 / 2)である
     * Enemyの攻撃を受ける前後でのHPの減少分が先述の計算によるダメージと等しいことを期待する
     */
    @Test
    void warriorWeaponTest() {
        Warrior demoWarrior = new Warrior("デモ戦士", 100, 10);
        Enemy slime = new Enemy("スライムもどき", 100, 0);
        for (int index = 0; index < 3; index++) {
            int estimatedDiff = demoWarrior.getAttack() * 3 / 2;
            int beforeAttackHitPoint = slime.getHitPoint();
            demoWarrior.attackWithWeponSkill(slime);
            int afterAttackHitPoint = slime.getHitPoint();
            assertEquals(estimatedDiff, beforeAttackHitPoint - afterAttackHitPoint);
        }
    }
}
