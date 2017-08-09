package structures.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by denglob on 8/9/17.
 */
public class CompositeApp {
    public static void main(String[] args) {
        Square square = new Square();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();

        Composite composite1 = new Composite();
        composite1.addComponent(triangle);
        composite1.addComponent(circle);

        Composite composite = new Composite();
        composite.addComponent(square);
        composite.addComponent(triangle);
        composite.addComponent(circle);
        composite.addComponent(composite1);
        composite.draw();
    }
}

interface Shape {
    void draw();
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Hello, I'm Square");
    }
}


class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Hello, I'm Triangle");
    }
}


class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Hello, I'm Circle");
    }
}

class Composite implements Shape{
    private List<Shape> components = new ArrayList<>();

    public void addComponent(Shape shape) {
        components.add(shape);
    }

    public void removeComponent(Shape shape) {
        components.remove(shape);
    }

    @Override
    public void draw() {
        for (Shape shape : components) {
            shape.draw();
        }
    }
}