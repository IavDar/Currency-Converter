package l27;

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


        Drawable figure = new Circle("yellow", 7);
        figure.draw();
        figure.resize();
        figure = new Square("red", 3);
        figure.draw();
        figure.resize();
        figure = new Rectangle("blue", 15.6,8);
        figure.draw();
        figure.resize();
        figure = new Trapezoid("white", 8,17, 9.5, 14.7, 7);
        figure.draw();
        figure.resize();
        figure = new Rhombus("braun", 15,11.3, 18.4);
        figure.draw();
        figure.resize();
        figure = new Ellipse("green", 6,3.5);
        figure.draw();
        figure.resize();
        figure = new Parallelepiped("black", 7,5.1, 4);
        figure.draw();
        figure.resize();
        System.out.println();


        Deletable figure2 = new Circle("yellow", 7);
        figure2.delete();
        figure2 = new Square("red", 3);
        figure2.delete();
        figure2 = new Rectangle("blue", 15.6,8);
        figure2.delete();
        figure2 = new Trapezoid("white", 8,17, 9.5, 14.7, 7);
        figure2.delete();
        figure2 = new Rhombus("braun", 15,11.3, 18.4);
        figure2.delete();
        figure2 = new Ellipse("green", 6,3.5);
        figure2.delete();
        figure2 = new Parallelepiped("black", 7,5.1, 4);
        figure2.delete();
        System.out.println();
    }

}
