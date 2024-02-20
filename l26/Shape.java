package l26;

public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public void printInfo () {
        System.out.println("Цвет: " + color);
        System.out.println("Площадь: " + getArea());
        System.out.println("Периметр: " + getPerimeter());
    }
}
    class Circle extends Shape {

        private double radius;

        public Circle(String color, double radius) {
            super(color);
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    class Square extends Shape {
        private double side;

        public Square(String color, double side) {
            super(color);
            this.side = side;
        }

        @Override
        public double getArea() {
            return side * side;
        }

        @Override
        public double getPerimeter() {
            return 4 * side;
        }
    }

    class Rectangle extends Shape {
        private double side1;
        private double side2;

        public Rectangle(String color, double side1, double side2) {
            super(color);
            this.side1 = side1;
            this.side2 = side2;
        }

        @Override
        public double getArea() {
            return side1 * side2;
        }

        @Override
        public double getPerimeter() {
            return (2 * side1) + (2 * side2);

        }
    }

    class Trapezoid extends Shape {
        private double base1;
        private double base2;
        private double side1;
        private double side2;
        private double height;

        public Trapezoid(String color, double base1, double base2, double side1, double side2, double height) {
            super(color);
            this.base1 = base1;
            this.base2 = base2;
            this.side1 = side1;
            this.side2 = side2;
            this.height = height;
        }

        @Override
        public double getArea() {
            return height * (base1 + base2) / 2 ;
        }

        @Override
        public double getPerimeter() {
            return base1 + base2 + side1 + side2;
        }
    }

    class Rhombus extends Shape {
        private double side;
        private double diagonal1;
        private double diagonal2;

        public Rhombus(String color, double side, double diagonal1, double diagonal2) {
            super(color);
            this.side = side;
            this.diagonal1 = diagonal1;
            this.diagonal2 = diagonal2;
        }

        @Override
        public double getArea() {
            return 0.5 * (diagonal1 * diagonal2);
        }

        @Override
        public double getPerimeter() {
            return 4 * side;
        }
    }

    class Ellipse extends Shape {
        private double semiAxis1;
        private double semiAxis2;

        public Ellipse(String color, double semiAxis1, double semiAxis2) {
            super(color);

            this.semiAxis1 = semiAxis1;
            this.semiAxis2 = semiAxis2;
        }

        @Override
        public double getArea() {
            return Math.PI * semiAxis1 * semiAxis2;
        }

        @Override
        public double getPerimeter() {
            return 4 * ((Math.PI * semiAxis1 * semiAxis2) + (semiAxis1 - semiAxis2) * (semiAxis1 - semiAxis2)) / (semiAxis1 + semiAxis2);
        }
    }
    class Parallelepiped extends Shape {
        private double edge1;
        private double edge2;
        private double edge3;

        public Parallelepiped (String color, double edge1, double edge2, double edge3 ) {
            super(color);

            this.edge1 = edge1;
            this.edge2 = edge2;
            this.edge3 = edge3;
        }
        @Override
        public double getArea() {
            return 2 * (edge1 * edge2 + edge2 * edge3 + edge1 * edge3);
        }
        @Override
        public double getPerimeter() {
            return 4 * (edge1 + edge2 + edge3);
        }

    }















