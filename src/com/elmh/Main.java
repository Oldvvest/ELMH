package com.elmh;
import com.elmh.monsters.*;
import com.elmh.heroes.*;

public class Main {

    public static void main(String[] args) {

        Goblin goblin = new Goblin();
        Knight knight = new Knight();


        System.out.println("На вас напал " + goblin.getMonsterName() + " со здоровьем " + goblin.getMonsterHealth());
        int monsterHealth = goblin.getMonsterHealth();
        while (monsterHealth > 0) {
            System.out.println(monsterHealth);
            System.out.println(goblin.getMonsterName() + " ударил " + knight.getName() + " на " + goblin.getMonsterAttack());
            System.out.println(knight.getName() + " ударил " + goblin.getMonsterName() + " на " + knight.getAttack());
            monsterHealth = monsterHealth - knight.getAttack();
        }
        System.out.print("Вы победили! " + goblin.getMonsterName() + " оставил вам: ");
//        goblin.dropLoot();

    }

}
