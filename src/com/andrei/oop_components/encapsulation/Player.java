package com.andrei.oop_components.encapsulation;

public class Player {

    //Encapsulation
    // restrict access from other classes
    //protect the members of the class from external
    // use private


    private String name;

    // public is not good because we do not have encapsulation
    public int hitPoints = 100;
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;

        if(health >0 && health <= 100) {
            this.hitPoints = health;
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <=0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
