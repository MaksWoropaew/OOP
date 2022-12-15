package game;

import java.util.Random;

public class Magician {
    private static int number;
    private static Random r;

    private String name;
    private int hp;
    private int maxHp;

    private int mana;
    private int maxMana;

    static{
        Magician.number = 0;
        Magician.r = new Random();
    }

    public Magician(String name, int hp, int mana){
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.mana = mana;
        this.maxMana = mana;
    }

    public Magician(){
        this(String.format("Hero_Magician #%d", ++Magician.number),
        Magician.r.nextInt(100 ,200),
        Magician.r.nextInt(50, 100));
    }

    public int Attack() {
        int damage = Magician.r.nextInt(20,30);
        this.mana -= (int)(damage * 0.8);
        if (mana < 0)return 0;
        else return damage;
    }
    
}
