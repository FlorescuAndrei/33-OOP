package com.andrei.interface_abstract_nested.abstract_;

public abstract class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breath() {
        System.out.println("Breathe in , breathe out, repeat");
    }

    //all bird eat and breath, but not all bird fly,
    // so we create an abstract method fly to be implemented in different ways
    public abstract void fly();
}
