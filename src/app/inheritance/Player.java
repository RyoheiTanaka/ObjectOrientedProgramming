package app.inheritance;

/**
 * extends Character で Character クラスを「継承」している
 */
public class Player extends Character {
    private int hp;
    private int power;

    public Player(String name, int hp, int power) {
        super(name);
        this.hp = hp;
        this.power = power;
    }

    public int getHp() {
        return this.hp;
    }

    public int attack() {
        return this.power;
    }

    public void damage(int attackPower) {
        this.hp -= attackPower;
        System.out.println(this.name + "は" + attackPower + "のダメージを受けた");
        System.out.println("--------------");
        if(this.hp <= 0) {
            this.die();
        }
    }

    private void die(){
        System.out.println(this.name + "はHPが0になりました");
        System.out.println("GAME OVER...");
        System.out.println("--------------");
    }
}
