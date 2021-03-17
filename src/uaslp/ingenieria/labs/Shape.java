package uaslp.ingenieria.labs;

// No tiene sentido instanciar Shape

public abstract class Shape {
    protected String name;

    public String getName() {
        return name;
    }

    // Tarea
    public int getSidesCount() {
        return 0;
    }

    public int getPerimeter() {
        return 0;
    }

    public double getArea() {
        return 0;
    }
}
