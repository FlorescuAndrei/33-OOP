package com.andrei.oop_components.inheritance;

public class MainComponents {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();

        dog.run();
        System.out.println(dog.getBrain());

        }


}
