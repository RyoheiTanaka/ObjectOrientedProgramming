package app.encapsulation;

public class Player {
    // アクセス修飾子をprivateにすることで自クラス内のみアクセスできるようにする
    private String name;
    private int hp = 100; // 外部から直接アクセスされて突然HPが0になるのを回避する
    private int power = 10;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public int attack() {
        return this.power;
    }

    public void damage(int attackPower) {
        this.hp -= attackPower;
        System.out.println(this.name + "は" + attackPower + "のダメージを受けた");
        System.out.println("--------------");
        if(this.hp <= 0) {
            this.die();
        }
    }

    /***
     * 
     * 外部から直接呼び出されて突然GAME OVERにならないようにアクセス修飾子をprivateにする
     * 
     ***/
    private void die(){
        System.out.println(this.name + "はHPが0になりました");
        System.out.println("GAME OVER...");
        System.out.println("--------------");
    }
}
