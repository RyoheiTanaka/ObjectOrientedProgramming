package app.polymorphism;

public class Hero extends Player {
    public Hero(String name, int hp, int mp, int power) {
        super(name, hp, mp, power);
    }

    /**
     * Magician や Thief と同じ attack というメソッドだが攻撃方法がそれぞれ違う
     * これをポリモーフィズム(多態性、多様性)という
     * 
     */
    public void attack(Enemy enemy) {
        System.out.println(this.name + "は伝説の剣で攻撃");
        System.out.println("--------------");
        enemy.damage(this.power);
    }

    public void buildUp() {
        if (this.mp >= 10){
            this.mp -= 10;
            this.power *= 2;
            System.out.println(this.name + "はMPを消費して");
            System.out.println("攻撃力がアップした");
            System.out.println("--------------");
        } else {
            System.out.println("MPが足りない");
            System.out.println("--------------");
        }
    }

    public void escape() {
        System.out.println(this.name + "は全力で逃げた");
        System.out.println("--------------");
    }
}
