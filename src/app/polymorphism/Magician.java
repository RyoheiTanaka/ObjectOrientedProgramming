package app.polymorphism;

public class Magician extends Player {
    public Magician(String name, int hp, int mp, int power) {
        super(name, hp, mp, power);
    }

    /**
     * Hero や Thief と同じ attack というメソッドだが攻撃方法がそれぞれ違う
     * これをポリモーフィズム(多態性、多様性)という
     * 
     */
    public void attack(Enemy enemy) {
        System.out.println(this.name + "は魔法の杖で攻撃");
        System.out.println("--------------");
        enemy.damage(this.power);
    }

    public void attackMagic(Enemy enemy, int magicNumber) {
        int magicPower;
        String targetName = enemy.getName();

        switch(magicNumber) {
            case 1:
                magicPower = this.fireMagic(targetName);
                break;
            case 2:
                magicPower = this.thunderMagic(targetName);
                break;
            case 3:
                magicPower = this.frostMagic(targetName);
                break;
            default:
                magicPower = this.notKnowMagic();
                break;
        }

        enemy.damage(magicPower);
    }

    private int fireMagic(String targetName) {
        int useMp = 5;
        System.out.println(this.name + "は" + targetName +"にファイアを唱えた");
        if(this.mp >= useMp){
            this.mp -= useMp;
            return 12;
        } else {
            System.out.println("MPが足りない");
            return 0;
        }
    }

    private int thunderMagic(String targetName) {
        int useMp = 7;
        System.out.println(this.name + "は" + targetName +"にサンダーを唱えた");
        if(this.mp >= useMp){
            this.mp -= useMp;
            return 15;
        } else {
            System.out.println("MPが足りない");
            return 0;
        }
    }

    private int frostMagic(String targetName) {
        int useMp = 4;
        System.out.println(this.name + "は" + targetName +"にフロストを唱えた");
        if(this.mp >= useMp){
            this.mp -= useMp;
            return 10;
        } else {
            System.out.println("MPが足りない");
            return 0;
        }
    }

    private int notKnowMagic() {
        System.out.println(this.name + "は覚えていない魔法を唱えた");
        return 0;
    }

    public void escape() {
        System.out.println(this.name + "は魔法で透明になって逃げた");
        System.out.println("--------------");
    }
}
