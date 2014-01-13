package com.elmh.monsters;
import com.elmh.loot.*;

public class Goblin {

    private static final String NAME = "Гоблин";
    private static final int HEALTH = 20;
    private int attack =(int)(3 + Math.random()*((5-3)+1));
    private static final int DROP_CHANCE = (int)(Math.random()*3);



    public int getAttack() {
        return attack;
    }

    public static String getName() {
        return NAME;
    }

    public static int getHealth() {
        return HEALTH;
    }

    WoodenShield woodenShield = new WoodenShield();
    WoodenSword woodenSword = new WoodenSword();


    public void dropLoot() {

        if (DROP_CHANCE == 1) {
            System.out.println(woodenShield.getName());
        } else if (DROP_CHANCE == 2) {
            System.out.println(woodenSword.getName());
        } else {
            System.out.println("Ничего...Хахахах!!!");
        }

    }



}
