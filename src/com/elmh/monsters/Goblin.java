package com.elmh.monsters;
import com.elmh.heroes.Knight;
import com.elmh.loot.*;

public class Goblin extends Monster{

    private static final String NAME = "Гоблин";
    private static final int HEALTH = 20;
    private static final int MIN_ATT = 1;
    private static final int MAX_ATT = 5;

    public Goblin() {
        super(NAME, HEALTH, MAX_ATT, MIN_ATT);
    }

    //    WoodenShield woodenShield = new WoodenShield();
//    WoodenSword woodenSword = new WoodenSword();
//
//
//    public void dropLoot() {
//
//        if (DROP_CHANCE == 1) {
//            System.out.println(woodenShield.getMonsterName());
//        } else if (DROP_CHANCE == 2) {
//            System.out.println(woodenSword.getMonsterName());
//        } else {
//            System.out.println("Ничего...Хахахах!!!");
//        }
//
//    }



}
