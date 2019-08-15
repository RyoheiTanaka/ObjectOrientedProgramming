package app.inheritance;

/**
 * extends Character で Character クラスを「継承」している
 */
public class Npc extends Character {

    public Npc(String name) {
        super(name);
    }

    public void talk() {
        System.out.println("ここははじまりの町です。");
        System.out.println("まずはお城に行って王様に会ってみてはいかがですか？");
        System.out.println("--------------");;
    }
}