package com.house.examples;

public class Enemy implements Character{

    public String weapon = "Lightsaber";
    @Override
    public void attack() {
        System.out.println("The enemy attacks YOU!");
    }

    @Override
    public void heal() {
        System.out.println("The enemy heals themself");
    }

    @Override
    public String getWeapon(){
        return weapon;
    }

    public void weaponDraw(){
        System.out.println("Draw out weapon");
    }

}
