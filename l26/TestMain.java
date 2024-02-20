package l26;

public class TestMain {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle("yellow", 7),
                new Square("red", 3),
                new Rectangle("blue", 15.6,8),
                new Trapezoid("white", 8,17, 9.5, 14.7, 7),
                new Rhombus("braun", 15,11.3, 18.4),
                new Ellipse("green", 6,3.5),
                new Parallelepiped("black", 7,5.1, 4),
        };

        for (Shape shape : shapes) {
            shape.printInfo();
            System.out.println();
        }
    }
}
