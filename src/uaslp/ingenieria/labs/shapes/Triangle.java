package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public abstract class Triangle extends Shape {
    protected int base;
    protected int height;

    public Triangle(){
        this.sideCount = 3;
    }
    // No puedo crear un triángulo sin definir de qué tipo es

    public double getArea(){
        return base*height/2;
    }
}
