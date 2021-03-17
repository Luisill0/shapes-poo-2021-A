package uaslp.ingenieria.labs;

// No tiene sentido instanciar Shape

public abstract class Shape {
    protected String name;
    protected int sideCount;

    public String getName() {
        return name;
    }

    public int getSidesCount() {
        return sideCount;
    }

    public int getPerimeter(){
        return 0;
    }

    public double getArea(){
        return 0;
    }
}
