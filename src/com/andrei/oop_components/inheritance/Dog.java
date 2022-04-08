package com.andrei.oop_components.inheritance;

//inheritance - is a - relationship. A dog is an animal, extend animal
//interface - can magic word.        A bird can fly, so we can create an interface name IFly.

public class Dog extends Animal{


    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //we need a constructor that call tha Animal class constructor because Dog extends Animal, so Dog have the Animal characteristics + extra characteristics ;
    public Dog(String name, int brain, int body, int size, int weight) {

        // super call the constructor from the Animal class
        //initialize the base characteristics of an animal;
        super(name, brain, body, size, weight);

        //we assign extra characteristic specific to a Dog
    }

    //in this constructor I give some default values: all dog have one brain, one body,
    public Dog(String name, int size, int weight ) {
        super(name, 1, 1, size, weight);

    }

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run(){
        System.out.println("Dog.run() called");
        //if I put super.move() instead move() if I override the move() method in Dog class, super.move() will still use the base animal method .move()
        move(10);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }
}
