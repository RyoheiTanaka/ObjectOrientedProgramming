package app.encapsulation;

public class Player {
    private int hp = 100;
    private int power = 10;

    public int getHp() {
        return this.hp;
    }

    private void setHp(int hp) {
        this.hp = hp;
    }

    public int attack() {
        return this.power;
    }

    public void damage(int attackPower) {
        int hp = this.hp - attackPower;
        this.setHp(hp);
        System.out.println(attackPower + "のダメージを受けた");
    }
}
