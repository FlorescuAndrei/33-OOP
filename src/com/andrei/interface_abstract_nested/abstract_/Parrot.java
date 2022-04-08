package com.andrei.interface_abstract_nested.abstract_;

public class Parrot extends Bird{

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Flitting from branch to branch");
    }
}
