package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class TriangleScalene extends Triangle{
    private double hypotenuse;

    public TriangleScalene(int base, int height){
        this.base = base;
        this.height = height;
        this.hypotenuse = Math.sqrt(Math.pow(base,2)+Math.pow(height,2));
        this.name = "Triangle Scalene";
    }

    public int getPerimeter(){
        return base+height+ (int) hypotenuse;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public int getHypotenuse() {
        return (int) hypotenuse;
    }
}
