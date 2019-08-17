package app.polymorphism;

abstract class Enemy {
    protected String name;
    protected int hp;
    protected int power;
    protected int exp;

    public Enemy(String name) {
        this.name = name;
    }

    public Enemy(String name, int hp, int power, int exp) {
        this.name = name;
        this.hp = hp;
        this.power = power;
        this.exp = exp;
    }

    /**
     * 抽象メソッドとして用意することで継承先でオーバーライドさせるようにする
     * 継承先でオーバーライドさせることで必要なメソッドのみ用意しそれぞれで振る舞いを変えることができる
     * 継承先でもオーバーライドされていないと継承先のクラスで抽象メソッドが存在するとしてエラーになる
     */
    public abstract void attack(Player player);

    public abstract void escape();

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

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
        System.out.println("経験値が" + this.exp + "上がった");
        System.out.println("--------------");
    }

} 