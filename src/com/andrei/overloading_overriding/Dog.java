package com.andrei.overloading_overriding;

public class Dog {

    public void bark(){
        System.out.println("woof");
    }

    //Overloading  - same name, same parameters, (can return different type), usually same class
    public void bark(int number){
        for(int i = 0; i < number; i++){
            System.out.println("woof");
        }

    }

    class GermanShepherd extends Dog{

        //Same name, same parameters, children class
        @Override
        public void bark(){
            System.out.println("woof, woof, woof");
        }
    }
}
