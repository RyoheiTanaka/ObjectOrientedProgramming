package app.polymorphism;

import app.polymorphism.Hero;
import app.polymorphism.Magician;
import app.polymorphism.Thief;
import app.polymorphism.Npc;
//import app.polymorphism.Wolf;
import app.polymorphism.Slime;
import app.polymorphism.Ogre;

import java.util.Random;

public class Polymorphism {
    public static void main(String[] args) {
        Hero hero = new Hero("勇者", 100, 10, 10);
        Magician magician = new Magician("魔法使い", 50, 30, 5);
        Thief thief = new Thief("盗賊", 80, 5, 8);
        Npc npc = new Npc("町民");

        // Enemy wolf = new Enemy("ウルフ"); ← 抽象クラスのためインスタンス化できない
        // Wolf wolf = new Wolf("ウルフ"); ← 抽象メソッドがオーバーライドされていないのでインスタンス化できない
        Slime slimeA = new Slime("スライムA");
        Slime slimeB = new Slime("スライムB", 1, 3, 3);
        
        Ogre ogreA = new Ogre("オーガA");
        Ogre ogreB = new Ogre("オーガB", 200, 230, 100);

        System.out.println("--------------");
        System.out.println(hero.getName() + "のHPは" + hero.getHp() + "です");
        System.out.println("--------------");
        System.out.println(magician.getName() + "のHPは" + magician.getHp() + "です");
        System.out.println("--------------");
        System.out.println(thief.getName() + "のHPは" + thief.getHp() + "です");
        System.out.println("--------------");
        System.out.println(npc.getName() + "のHPはありません");
        System.out.println("--------------");
        System.out.println(slimeA.getName() + "のHPは" + slimeA.getHp() + "です");
        System.out.println("--------------");
        System.out.println(slimeB.getName() + "のHPは" + slimeB.getHp() + "です");
        System.out.println("--------------");
        System.out.println(ogreA.getName() + "のHPは" + ogreA.getHp() + "です");
        System.out.println("--------------");
        System.out.println(ogreB.getName() + "のHPは" + ogreB.getHp() + "です");
        System.out.println("--------------");

        // 町民に話しかける
        npc.talk(hero);

        // 勇者たちは敵と遭遇し戦闘が始まった
        System.out.println("モンスターに遭遇した");

        // 盗賊はスライムAからアイテムを盗む
        thief.steal(slimeA);

        // 魔法使いはオーガBにランダムに魔法で攻撃
        Random random = new Random();
        for(int i = 1;i <= 5; i++){
            int magicNumber = random.nextInt(5);
            magician.attackMagic(ogreB, magicNumber);
        }

        // 勇者が攻撃力アップの特技を使用
        hero.buildUp();

        // スライムAが勇者に攻撃
        slimeA.attack(hero);

        // 勇者がスライムAに攻撃
        hero.attack(slimeA);

        // スライムBが逃げた
        slimeB.escape();

        // オーガAが逃げた
        ogreA.escape();

        // 魔法使いが逃げた
        magician.escape();

        // 盗賊が逃げた
        thief.escape();

        // オーガBが勇者に攻撃
        ogreB.attack(hero);
    }
}