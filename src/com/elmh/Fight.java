package com.elmh;
import com.elmh.monsters.*;
import com.elmh.heroes.*;

/**
 * Created by admin on 21.01.14.
 */
public class Fight{

    public String startFight() {

        Goblin goblin = new Goblin();
        Knight knight = new Knight();


        System.out.println("На вас напал " + goblin.getName() + " со здоровьем " + goblin.getHealth());
        int monsterHealth = goblin.getHealth();
        int knightHealth = knight.getHealth();
        while (monsterHealth > 0) {
            System.out.println(monsterHealth);
            int monsterAttack = goblin.getAttack();
            int heroAttack = knight.getAttack();
            System.out.println(goblin.getName() + " ударил " + knight.getName() + " на " + monsterAttack);
            System.out.println(knight.getName() + " ударил " + goblin.getName() + " на " + heroAttack);
            monsterHealth = monsterHealth - heroAttack;
            knightHealth = knightHealth - monsterAttack;

        }
       // System.out.print("Вы победили! " + goblin.getName() + " оставил вам: " +knightHealth);
        return "Вы победили! " + goblin.getName() + " оставил вам: " +knightHealth ;
    }
}
