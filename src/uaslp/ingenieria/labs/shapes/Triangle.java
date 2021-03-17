package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public abstract class Triangle extends Shape {
    protected int base;
    protected int height;
    protected final int sides = 3;
    // No puedo crear un triángulo sin definir de qué tipo es

    public double getArea(){
        return base*height/2;
    }

    public int getSidesCount(){
        return sides;
    }
}
