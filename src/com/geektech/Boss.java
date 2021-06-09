package com.geektech;

public class Boss {

    private int bossHealth;
    private int bossDamage;
    private int bossProtection;

    public Boss(int bossHealth, int bossDamage, int bossProtection) {
        this.bossHealth = bossHealth;
        this.bossDamage = bossDamage;
        this.bossProtection = bossProtection + 100;
    }

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public int getBossProtection() {
        return bossProtection;
    }

    public void setBossProtection(int bossProtection) {
        this.bossProtection = bossProtection;
    }


    public  void BossProtection(){

        setBossProtection(150);



    }
}
