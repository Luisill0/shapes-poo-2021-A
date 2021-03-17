package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Rectangle extends Shape {

    private int base;
    private int height;

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
        this.name = "Rectangle";
        this.sideCount = 4;
    }

    public int getPerimeter(){
        return base * 2 + height * 2;
    }

    public double getArea(){
        return base * height;
    }
}
