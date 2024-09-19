import java.util.ArrayList;
import java.util.List;

// Base class Shape
abstract class Shape {
    private String color;
    private boolean filled;

    // Constructor to initialize color and filled
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Method to draw the shape
    public void draw() {
        System.out.println("Drawing a shape");
    }

    // Method to calculate the area (default implementation returns 0.0)
    public double calculateArea() {
        return 0.0;
    }
}

// Subclass Circle
class Circle extends Shape {
    private double radius;

    // Constructor to initialize color, filled, and radius
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    // Implement draw() method to display "Drawing a circle"
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    // Implement calculateArea() method to calculate the area of the circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor to initialize color, filled, width, and height
    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    // Implement draw() method to display "Drawing a rectangle"
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    // Implement calculateArea() method to calculate the area of the rectangle
    @Override
    public double calculateArea() {
        return width * height;
    }
}

// Class Drawing with method renderShapes to demonstrate polymorphism
class Drawing {
    public void renderShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println("Area: " + shape.calculateArea());
        }
    }
}

// Main class to test the polymorphism
public class Main {
    public static void main (String[] args) {
        // Create instances of Circle and Rectangle
        Shape circle = new Circle("Red", true, 5.0);
        Shape rectangle = new Rectangle("Blue", false, 4.0, 6.0);

        // Add the shapes to a list
        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);

        // Create an instance of Drawing and render the shapes
        Drawing drawing = new Drawing();
        drawing.renderShapes(shapes);
    }
}

// Output :- 
// Drawing a circle
// Area: 78.53981633974483
// Drawing a rectangle
// Area: 24.0