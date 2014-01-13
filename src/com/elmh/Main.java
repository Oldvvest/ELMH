package com.elmh;
import com.elmh.monsters.*;
import com.elmh.heroes.*;
import com.javafx.tools.doclets.formats.html.SourceToHTMLConverter;

public class Main {

    public static void main(String[] args) {

        Goblin goblin = new Goblin();
        Knight knight = new Knight();


        System.out.println("На вас напал " + goblin.getName() + " со здоровьем " + goblin.getHealth());
        int monsterHealth = goblin.getHealth();
        while (monsterHealth > 0) {
            System.out.println(monsterHealth);
            System.out.println(goblin.getName() + " ударил " + knight.getName() + " на " + goblin.getAttack());
            System.out.println(knight.getName() + " ударил " + goblin.getName() + " на " + knight.getAttack());
            monsterHealth = monsterHealth - goblin.getAttack();
        }
        System.out.print("Вы победили! " + goblin.getName() + " оставил вам: ");
        goblin.dropLoot();

    }

}
