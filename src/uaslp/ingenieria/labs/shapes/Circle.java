package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Circle extends Shape {
    private int radius;
    final int sides = 1;

    public Circle(int radius) {
        this.radius = radius;
        name = "Circle";
    }

    // Re-definir el método en una clase hija: SOBRE-ESCRITURA -> OVERWRITING

    // Sobrecarga = Overloading // polimorfismo

    // Polimorfismo: Enviar un mensaje a un objeto y que este responda de diferentes maneras

    public int getSidesCount(){
        return sides;
    }

    public int getPerimeter(){
        return (int) (Math.PI*radius*2);
    }

    public double getArea(){
        return (Math.PI*radius*radius);
    }

    public int getRadius() {
        return radius;
    }
}
