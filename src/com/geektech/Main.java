package com.geektech;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Boss protection= new Boss(1000,50,100);
        protection.BossProtection();
        System.out.println( "BossProtection " + " 100 " + "before");
        System.out.println( "BossProtection " + protection.getBossProtection() + " " + "after");

        MagicDoor heroNames = new MagicDoor();
        System.out.println(Arrays.toString(heroNames.magicHeroes()));
    }
}
