package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class TriangleIsosceles extends Triangle{
    private int side;

    public TriangleIsosceles(int base,int side){
        this.base = base;
        this.side = side;
        this.height = (int) Math.sqrt(Math.pow(side,2)-Math.pow(side/2,2));
        this.name = "Triangle Isosceles";
    }

    public int getPerimeter() {
        return base + side * 2;
    }
}
