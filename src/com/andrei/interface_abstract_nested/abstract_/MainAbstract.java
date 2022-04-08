package com.andrei.interface_abstract_nested.abstract_;

public class MainAbstract {
    public static void main(String[] args) {
        Dog dog = new Dog("Azorel");
        System.out.println(dog.getName());
        dog.eat();
        System.out.println("---------------");

        Parrot parrot = new Parrot("Australian ringneck");
        System.out.println(parrot.getName());
        parrot.eat();
        parrot.breath();
        parrot.fly();
        System.out.println("---------------");

        Penguin penguin = new Penguin("Emperor");
        System.out.println(penguin.getName());
        penguin.eat();
        penguin.breath();
        penguin.fly();
    }
}
