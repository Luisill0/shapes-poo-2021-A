package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
        this.name = "Circle";
        this.sideCount = 1;
    }

    // Re-definir el método en una clase hija: SOBRE-ESCRITURA -> OVERWRITING

    // Sobrecarga = Overloading // polimorfismo

    // Polimorfismo: Enviar un mensaje a un objeto y que este responda de diferentes maneras

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
