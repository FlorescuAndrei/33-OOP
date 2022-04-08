package com.andrei.this_super;

//this() and super() can be used only in constructor
public class Shape {
    private int x;
    private int y;

    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Rectangle extends Shape{
    private int height;
    private int width;

    //1st constructor
    public Rectangle(int width, int height){
        this(0, 0, width, height);// call 2nd constructor
    }

    //2nd constructor
    public Rectangle(int x, int y, int width, int height){
        super(x, y);
        this.width = width;
        this.height = height;
    }
}
