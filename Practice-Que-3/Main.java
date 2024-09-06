
class Shape {

    public double area() {
        return 0;
    }
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

}

class Rectangle extends Shape {

    private double length;
    private double bredth;

    public Rectangle(double length, double bredth) {
        this.length = length;
        this.bredth = bredth;
    }

    @Override
    public double area() {
        return length * bredth;
    }
}

class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Area of the Circle: " + circle.area());
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Area of the Rectangle: " + rectangle.area());
    }
}
