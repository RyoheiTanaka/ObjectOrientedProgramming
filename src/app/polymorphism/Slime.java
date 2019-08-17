package app.polymorphism;

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

    public void attack(Player player) {
        System.out.println(this.getName() + "は" + player.getName() + "に攻撃");
        System.out.println("体当たりで攻撃");
        player.damage(this.power);
    }

    public void escape(){
        System.out.println(this.name + "は這いずって逃げた");
        System.out.println("--------------");
    }
}
