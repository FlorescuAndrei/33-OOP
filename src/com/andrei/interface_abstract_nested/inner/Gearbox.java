package com.andrei.interface_abstract_nested.inner;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGer = 0;
    boolean clutchIsIn;

    public Gearbox(int maxGears){
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

    }

    public void operateClutch(boolean in){
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio){
        if(number > 0 && number<= maxGears){
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear){
        if((newGear >= 0 && newGear <= this.gears.size())&& this.clutchIsIn){
            this.currentGer = newGear;
            System.out.println("Gear " + newGear + " selected");
        }else {
            System.out.println("Grind!");
            this.currentGer = 0;
        }
    }

    public double wheelSpeed(int revs){
        if(clutchIsIn){
            System.out.println("Scream!!!!");
            return 0.0;

        }
        return revs * gears.get(currentGer).getRatio();
    }

    //we use an inner class because it has no sens to talk about a Gear in other context that a Gearbox.
    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs){
            return revs * (this.ratio);
        }

        public double getRatio() {
            return ratio;
        }
    }
}
