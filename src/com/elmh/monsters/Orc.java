package com.elmh.monsters;

import com.elmh.CharacterStats;

/**
 * Created by admin on 21.01.14.
 */
public class Orc extends CharacterStats {

    private static final String NAME = "Орк";
    private static final int HEALTH = 30;
    private static final int MIN_ATT = 5;
    private static final int MAX_ATT = 7;
    private static final int LEVEL = 1;

    public Orc() {
        super(NAME, HEALTH, MAX_ATT, MIN_ATT);
    }
}
