package app.inheritance;

/**
 * extends Enemy で Enemy クラスを「継承」している
 */
public class Slime extends Enemy {
    public Slime(String name) {
        super(name);
        this.hp = 5;
        this.power = 2;
        this.exp = 1;
    }

    public Slime(String name, int hp, int power, int exp) {
        super(name, hp, power, exp);
    }

    public int attack() {
        System.out.println("体当たり攻撃");
        return this.power;
    }

    public void escape(){
        System.out.println(this.name + "は這いずって逃げた");
        System.out.println("--------------");
    }
}
