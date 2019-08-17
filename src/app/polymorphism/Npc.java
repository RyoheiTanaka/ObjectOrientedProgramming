package app.polymorphism;

public class Npc extends Character {

    public Npc(String name) {
        super(name);
    }

    public void talk(Player player) {
        System.out.println(player.getName() + "は" + this.getName() + "に話しかけた");
        System.out.println("ここははじまりの町です。");
        System.out.println("まずはお城に行って王様に会ってみてはいかがですか？");
        System.out.println("--------------");;
    }
}