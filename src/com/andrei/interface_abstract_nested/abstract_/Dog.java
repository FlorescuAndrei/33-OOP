package com.andrei.interface_abstract_nested.abstract_;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");

    }

    @Override
    public void breath() {
        System.out.println("Breathe in , breathe out, repeat");

    }
}
