package com.elmh.heroes;

public class Knight {

private static final String NAME = "Рыцарь";
private int health = 30;
private int min_att = 4;
private int max_att = 6;
private int attack =(int)(min_att + Math.random()*((max_att-min_att)+1));
private int def = 0;


    public static String getName() {
        return NAME;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getDef() {
        return def;
    }

    public void setAttack(int addAttack) {
        this.min_att = min_att + addAttack;
        this.max_att = max_att + addAttack;
    }
}