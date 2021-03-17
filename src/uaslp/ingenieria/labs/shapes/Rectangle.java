package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Rectangle extends Shape {

    private int base;
    private int height;
    final int sides = 4;

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
        this.name = "Rectangle";
    }

    public int getSidesCount(){
        return sides;
    }

    public int getPerimeter(){
        return base * 2 + height * 2;
    }

    public double getArea(){
        return base * height;
    }
}
