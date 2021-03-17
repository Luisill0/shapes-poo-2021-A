package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
        this.name = "Square";
        this.sideCount = 4;
    }

    public int getPerimeter() {
        return side * 4;
    }

    public double getArea(){
        return Math.pow(side,2);
    }
}
