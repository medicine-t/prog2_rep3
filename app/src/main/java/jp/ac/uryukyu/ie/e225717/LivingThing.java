package jp.ac.uryukyu.ie.e225717;

/**
 * 生き物用スーパークラス
 * String name; == 名前
 * int hitPoint; == HP
 * int attack; == 攻撃力
 * boolean dead; == 生死状態。true=死亡。
 * Created by tnal on 2022/11/15.
 */
public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * 
     * @param name      名前
     * @param maximumHP HP
     * @param attack    攻撃力
     */
    public LivingThing(String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * 攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、opponent.wounded()によりダメージ処理を実行。
     * 
     * @param opponent 攻撃対象
     */
    public void attack(LivingThing opponent) {
        if (this.dead != true) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * 
     * @param damage 受けたダメージ
     */
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

    /**
     * インスタンスの持つname変数をStringとして返す。
     * 
     * @return name:String
     */
    public String getName() {
        return name;
    }

    /**
     * インスタンスの持つHitPointをintとして返す
     * 
     * @return hitPoint:int
     */
    public int getHitPoint() {
        return hitPoint;
    }

    /**
     * インスタンスの持つattackをintとして返す
     * 
     * @return
     */
    public int getAttack() {
        return attack;
    }

    /**
     * インスタンスの持つdeadフラグの状態をbooleanで返す
     * 
     * @return
     */
    public boolean isDead() {
        return dead;
    }

    /**
     * インスタンスのname変数の値を設定する。
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * インスタンスのhitPoint変数の値を設定する
     * 
     * @param hitPoint
     */
    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    /**
     * インスタンスのattackの値を設定する
     * 
     * @param attack
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * インスタンスのdeadフラグの状態を設定する
     * 
     * @param dead
     */
    public void setDead(boolean dead) {
        this.dead = dead;
    }

}