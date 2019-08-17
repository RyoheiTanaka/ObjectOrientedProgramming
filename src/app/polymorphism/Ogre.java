package app.polymorphism;

public class Ogre extends Enemy {

    public Ogre(String name) {
        super(name);
        this.hp = 120;
        this.power = 150;
        this.exp = 50;
    }

    public Ogre(String name, int hp, int power, int exp) {
        super(name, hp, power, exp);
    }

    public void attack(Player player) {
        System.out.println(this.getName() + "は" + player.getName() + "に攻撃");
        System.out.println("こんぼうで攻撃");
        player.damage(this.power);
    }

    public void escape(){
        System.out.println(this.name + "は走って逃げた");
        System.out.println("--------------");
    }
}
