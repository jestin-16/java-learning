abstract class Shapes {
    public abstract double area();
}

class Circle extends Shapes {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shapes {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

class Triangle extends Shapes {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Shapes myCircle = new Circle(5);
        Shapes myRectangle = new Rectangle(4, 6);
        Shapes myTriangle = new Triangle(3, 7);

        System.out.println("Circle area: " + myCircle.area());
        System.out.println("Rectangle area: " + myRectangle.area());
        System.out.println("Triangle area: " + myTriangle.area());
    }
}
