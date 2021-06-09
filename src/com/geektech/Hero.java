package com.geektech;

public class Hero {

    private int heroHealth;
    private int heroDamage;
    private int heroSuperAbilities;

    public Hero(int heroHealth, int heroDamage, int heroSuperAbilities) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.heroSuperAbilities  = heroDamage + 15;
    }

}
