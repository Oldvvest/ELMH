package com.elmh.monsters;


public class Monster {

    private final String name;
    private final int health;
    private final int attack;


    public Monster( String name, int health, int maxAtt, int minAtt) {

        this.attack = (int)(3 + Math.random()*((minAtt - maxAtt)+1));
        this.name = name;
        this.health = health;

    }


    public int getAttack() {
        return attack;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }





}
