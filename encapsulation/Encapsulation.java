package app.encapsulation;

import app.encapsulation.Player;

public class Encapsulation {
    public static void main (String[] args) {
        Player player = new Player();
        System.out.println(player.getHp());
        System.out.println(player.attack());
        player.damage(20);
        System.out.println(player.getHp());
    }
}