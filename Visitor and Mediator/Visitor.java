interface Shape {
    void accept(ShapeVisitor visitor);
}

interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Square square);
    void visit(Triangle triangle);
    void visit(Rectangle rectangle);
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }

    public double getRadius() {
        return radius;
    }
}

class Square implements Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }

    public double getSide() {
        return side;
    }
}

class Triangle implements Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}

class Rectangle implements Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

class AreaCalculator implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        double area = Math.PI * circle.getRadius() * circle.getRadius();
        System.out.println("Circle Area: " + area);
    }

    @Override
    public void visit(Square square) {
        double area = square.getSide() * square.getSide();
        System.out.println("Square Area: " + area);
    }

    @Override
    public void visit(Triangle triangle) {
        double area = 0.5 * triangle.getBase() * triangle.getHeight();
        System.out.println("Triangle Area: " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Rectangle Area: " + area);
    }
}

class PerimeterCalculator implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        double perimeter = 2 * Math.PI * circle.getRadius();
        System.out.println("Perimeter of Circle: " + perimeter);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double perimeter = 2 * (rectangle.getWidth() + rectangle.getHeight());
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }

    @Override
    public void visit(Triangle triangle) {
        double side = triangle.getBase(); 
        double perimeter = 3 * side;
        System.out.println("Perimeter of Triangle: " + perimeter);
    }

    @Override
    public void visit(Square square) {
        double perimeter = 4 * square.getSide();
        System.out.println("Perimeter of Square: " + perimeter);
    }
}

public class Visitor {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(2),
            new Square(3),
        };

        ShapeVisitor areaCalculator = new AreaCalculator();
        for (Shape shape : shapes) {
            shape.accept(areaCalculator);
        }

    }
}