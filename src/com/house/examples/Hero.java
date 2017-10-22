package com.house.examples;

public class Hero implements Character {

    public String weapon = "The force";

    @Override
    public void attack() {
        System.out.println("THe hero attacks the enemy");
    }

    @Override
    public void heal() {
        System.out.println("The hero heals you");
    }

    @Override
    public String getWeapon(){
        return weapon;
    }
}
