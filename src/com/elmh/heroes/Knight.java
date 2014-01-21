package com.elmh.heroes;

import com.elmh.CharacterStats;

public class Knight extends CharacterStats {

    private static final String NAME = "Рыцарь";
    private static final int HEALTH = 30;
    private static final int MIN_ATT = 4;
    private static final int MAX_ATT = 6;
    private static final int DEF = 0;

    public Knight() {
        super(NAME, HEALTH, MAX_ATT, MIN_ATT);
    }
}