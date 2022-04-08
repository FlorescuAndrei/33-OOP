package com.andrei.oop_components.composition;

public class PC {

    //composition - pc has a case, a monitor, a motherboard

    private Monitor monitor;
    private Motherboard motherboard;
    private Case theCase;

    public PC(Monitor monitor, Motherboard motherboard, Case theCase) {
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.theCase = theCase;
    }
}
