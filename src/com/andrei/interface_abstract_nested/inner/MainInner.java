package com.andrei.interface_abstract_nested.inner;

public class MainInner {
    public static void main(String[] args) {


        Gearbox mcLaren = new Gearbox(6);

        // if the inner class is public we can instantiate and access it with the following code:
//        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
//        System.out.println(first.driveSpeed(1000));

        //if the inner class is not public  we cannot access it. We will use it and construct instance of it
        // throw the public method of the outer class

        mcLaren.addGear(1, 5.3);
        mcLaren.addGear(2, 10.6);
        mcLaren.addGear(3, 15.9);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));
            }

}
