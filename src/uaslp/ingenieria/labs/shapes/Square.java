package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Square extends Shape {
    private int side;
    final int sides = 4;

    public Square(int side) {
        this.side = side;
        this.name = "Square";
    }

    public int getSidesCount(){
        return sides;
    }

    public int getPerimeter() {
        return side * 4;
    }

    public double getArea(){
        return Math.pow(side,2);
    }
}
