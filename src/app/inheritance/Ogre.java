package app.inheritance;

/**
 * extends Enemy で Enemy クラスを「継承」している
 */
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

    public int attack() {
        System.out.println("こんぼうで攻撃");
        return this.power;
    }

    public void escape(){
        System.out.println(this.name + "は走って逃げた");
        System.out.println("--------------");
    }
}
