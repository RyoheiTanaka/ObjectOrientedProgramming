package app.inheritance;

public class Enemy {
    protected String name;
    protected int hp;
    protected int power;
    protected int exp;

    public Enemy(String name) {
        this.name = name;
    }

    public Enemy(String name, int hp, int power, int exp) {
        this.name = name;
        this.hp = hp;
        this.power = power;
        this.exp = exp;
    }

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
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
        System.out.println("経験値が" + this.exp + "上がった");
        System.out.println("--------------");
    }

} 