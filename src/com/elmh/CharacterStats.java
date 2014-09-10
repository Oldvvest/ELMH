package com.elmh;

/**
 * Created by admin on 21.01.14.
 */
public class CharacterStats extends Fight {


    private final String name;
    private final int health;
    private final int maxAtt;
    private final int minAtt;

    private int attack;

    public CharacterStats( String name, int health, int maxAtt, int minAtt) {

        this.name = name;
        this.health = health;
        this.maxAtt = maxAtt;
        this.minAtt = minAtt;

    }


    public int getAttack() {

        return attack = (int)(minAtt + Math.random()*((maxAtt - minAtt)+1)) ;

    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }


}
