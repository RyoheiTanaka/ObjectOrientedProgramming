package app.inheritance;

import app.inheritance.Player;
import app.inheritance.Npc;
import app.inheritance.Slime;
import app.inheritance.Ogre;

public class Inheritance {
    public static void main (String[] args) {
        Player player = new Player("勇者", 100, 10);
        Npc npc = new Npc("町民");

        Slime slimeA = new Slime("スライムA");
        Slime slimeB = new Slime("スライムB", 1, 3, 3);
        
        Ogre ogreA = new Ogre("オーガA");
        Ogre ogreB = new Ogre("オーガB", 200, 230, 100);

        System.out.println("--------------");
        System.out.println(player.getName() + "のHPは" + player.getHp() + "です");
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
        System.out.println(player.getName() + "は" + npc.getName() + "に話しかけた");
        npc.talk();

        // 勇者は敵と遭遇し戦闘が始まった
        System.out.println(player.getName() + "はモンスターに遭遇した");
        // スライムAが勇者に攻撃
        System.out.println(slimeA.getName() + "は" + player.getName() + "に攻撃");
        player.damage(slimeA.attack());

        // 勇者がスライムAに攻撃
        System.out.println(player.getName() + "は" + slimeA.getName() + "に攻撃");
        slimeA.damage(player.attack());

        // スライムBが逃げた
        slimeB.escape();

        // オーガAが逃げた
        ogreA.escape();

        // オーガBが勇者に攻撃
        System.out.println(ogreB.getName() + "は" + player.getName() + "に攻撃");
        player.damage(ogreB.attack());
    }
}