package jp.ac.uryukyu.ie.e225717;

public class Warrior extends Hero {
    public Warrior(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent) {
        if (this.isDead() != true) {
            int damage = this.getAttack() * 3 / 2;
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！", this.getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}
