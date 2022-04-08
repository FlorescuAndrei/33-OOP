package com.andrei.interface_abstract_nested.abstract_;

public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I'm not very good of that , can I go for a swim instead?");
    }
}
