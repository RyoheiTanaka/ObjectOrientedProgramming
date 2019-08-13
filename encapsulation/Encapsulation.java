package app.encapsulation;

import app.encapsulation.Player;
import app.encapsulation.Slime;
import app.encapsulation.Ogre;

public class Encapsulation {
    public static void main (String[] args) {
        Player player = new Player("勇者");
        Slime slime = new Slime("スライム");
        Ogre ogre = new Ogre("オーガ");

        System.out.println("--------------");
        System.out.println(player.getName() + "のHPは" + player.getHp() + "です");
        System.out.println("--------------");
        System.out.println(slime.getName() + "のHPは" + slime.getHp() + "です");
        System.out.println("--------------");
        System.out.println(ogre.getName() + "のHPは" + ogre.getHp() + "です");
        System.out.println("--------------");
        
        // スライムが勇者に攻撃
        System.out.println(slime.getName() + "は" + player.getName() + "に攻撃");
        player.damage(slime.attack());

        // 勇者がスライムに攻撃
        System.out.println(player.getName() + "は" + slime.getName() + "に攻撃");
        slime.damage(player.attack());

        // オーガが勇者に攻撃
        System.out.println(ogre.getName() + "は" + player.getName() + "に攻撃");
        player.damage(ogre.attack());
    }
}