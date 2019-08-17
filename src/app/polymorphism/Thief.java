package app.polymorphism;

import java.util.Random;

public class Thief extends Player {
    private int steelSuccessRate = 25;
    public Thief(String name, int hp, int mp, int power) {
        super(name, hp, mp, power);
    }

    /**
     * Hero や Magician と同じ attack というメソッドだが攻撃方法がそれぞれ違う
     * これをポリモーフィズム(多態性、多様性)という
     * 
     */
    public void attack(Enemy enemy) {
        System.out.println(this.name + "は盗賊の短剣で攻撃");
        System.out.println("--------------");
        enemy.damage(this.power);
    }

    public void steal(Enemy enemy) {
        String targetName = enemy.getName();
        Random random = new Random();
        int randomValue = random.nextInt(100);
        System.out.println(targetName + "からアイテムを盗む");
        if (randomValue < this.steelSuccessRate) {
            System.out.println(targetName + "からアイテムを盗むのに成功した");
            System.out.println("--------------");
        } else {
            System.out.println(targetName + "からアイテムを盗むのに失敗した");
            System.out.println("--------------");
        }
    }

    public void escape() {
        System.out.println(this.name + "は忍び足で隠れながら逃げた");
        System.out.println("--------------");
    }
}
