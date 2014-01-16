package com.elmh.monsters;


public class Monster {

    private final String name;
    private final int health;
    private final int maxAtt;
    private final int minAtt;

    private int attack;

    public Monster( String name, int health, int maxAtt, int minAtt) {

        this.name = name;
        this.health = health;
        this.maxAtt = maxAtt;
        this.minAtt = minAtt;

    }


    public int getMonsterAttack() {

        return attack = (int)(minAtt + Math.random()*((maxAtt - minAtt)+1)) ;

    }

    public String getMonsterName() {
        return name;
    }

    public int getMonsterHealth() {
        return health;
    }





}
