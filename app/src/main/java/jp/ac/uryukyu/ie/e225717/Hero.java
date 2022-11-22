package jp.ac.uryukyu.ie.e225717;

/**
 * ヒーロークラス。
 * String name; //名前
 * int hitPoint; //HP
 * int attack; //攻撃力
 * boolean dead; //生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing {
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * 
     * @param name      ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack    ヒーローの攻撃力
     */
    public Hero(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * 
     * @param damage 受けたダメージ
     */
    @Override
    public void wounded(int damage) {
        this.setHitPoint(this.getHitPoint() - damage);
        if (this.getHitPoint() < 0) {
            this.setDead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", this.getName());
        }
    }
}