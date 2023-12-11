package EXE3;

abstract class Shape {
    int x, y;
    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    abstract void area();
}
class Circle extends Shape {
    double radius;
    Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }
    void area() {
        System.out.println("Area of Circle: " + 3.14 * radius * radius);
    }
}
class Rectangle extends Shape {
    int length, width;
    Rectangle(int x, int y, int length, int width) {
        super(x, y);
        this.length = length;
        this.width = width;
    }
    void area() {
        System.out.println("Area of Rectangle: " + length * width);
    }
}
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5, 10, 2.5);
        c.area();
        Rectangle r = new Rectangle(10, 15, 5, 7);
        r.area();
    }
}

