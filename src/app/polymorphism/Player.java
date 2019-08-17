package app.polymorphism;

abstract class Player extends Character {
    private int hp;
    protected int mp;
    protected int power;

    public Player(String name, int hp, int mp, int power) {
        super(name);
        this.hp = hp;
        this.mp = mp;
        this.power = power;
    }

    public int getHp() {
        return this.hp;
    }

    public int getMp() {
        return this.mp;
    }

    /**
     * 抽象メソッドとして用意することで継承先でオーバーライドさせるようにする
     * 継承先でオーバーライドさせることで必要なメソッドのみ用意しそれぞれで振る舞いを変えることができる
     * 継承先でもオーバーライドされていないと継承先のクラスで抽象メソッドが存在するとしてエラーになる
     */
    public abstract void attack(Enemy enemy);

    public abstract void escape();

    public void damage(int attackPower) {
        if(attackPower > 0){
            this.hp -= attackPower;
            System.out.println(this.name + "は" + attackPower + "のダメージを受けた");
            System.out.println("--------------");
            if(this.hp <= 0) {
                this.die();
            }
        } else {
            System.out.println(this.name + "はダメージを受けなかった");
            System.out.println("--------------");
        }
    }

    private void die(){
        System.out.println(this.name + "はHPが0になりました");
        System.out.println("GAME OVER...");
        System.out.println("--------------");
    }
}
