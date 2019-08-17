package app.polymorphism;

public class Wolf extends Enemy {

    public Wolf(String name) {
        super(name);
        this.hp = 90;
        this.power = 20;
        this.exp = 15;
    }

    public Wolf(String name, int hp, int power, int exp) {
        super(name, hp, power, exp);
    }

    // Enemyの抽象メソッドの attack() をオーバーライドしていないのでインスタンス化できない
    // public void attack(Player player) {
    //     System.out.println(this.getName() + "は" + player.getName() + "に攻撃");
    //     System.out.println("体当たりで攻撃");
    //     player.damage(this.power);
    // }

    public void escape(){
        System.out.println(this.name + "は駆けて逃げた");
        System.out.println("--------------");
    }
}
