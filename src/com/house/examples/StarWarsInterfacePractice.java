package com.house.examples;

import java.util.Random;

public class StarWarsInterfacePractice{

    public static Character summonCharacter(){
        Random rand = new Random();
        if (Math.abs(rand.nextInt())%2 == 0){
            return new Enemy();
        }
        else return new Hero();
    }

    public static void main(String[] args) {
        Enemy darthVader =  new Enemy();
        Hero lukeSkyWalker = new Hero();

        darthVader.attack();
        lukeSkyWalker.attack();
        darthVader.heal();
        lukeSkyWalker.heal();
        System.out.println("Enemy's weapon: " + darthVader.getWeapon());
        System.out.println("Hero's weapon: " + lukeSkyWalker.getWeapon());

        Character spy = summonCharacter();
        spy.attack();
        spy.heal();
    }
}
