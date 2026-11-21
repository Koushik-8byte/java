import pkg.Shape;

/**
 * Demonstrates runtime polymorphism using the {@link Shape} interface.
 * <p>
 * A single {@code Shape} reference is reused to call {@code area()} on a
 * {@link Square}, a {@link Rectangle} and a {@link Circle}. Java decides
 * at runtime which version of {@code area()} to run.
 *{ @Author is "koushik"}
 */
public class InterObj {

    /**
     * Program entry point.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Reference type is Shape, actual object is Square -> Square.area() runs
        Shape s = new Square(20);
        s.area();                    // 20 * 20 = 400

        // Same reference, now pointing to a Rectangle -> Rectangle.area() runs
        s = new Rectangle(10, 2);
        s.area();                    // 10 * 30 = 300

        // Same reference, now pointing to a Circle -> Circle.area() runs
        s = new Circle(3);
        s.area();                    // 3.14 * 3 * 3 = 28.26
    }
}

/**
 * A square defined by the length of one side.
 */
class Square implements Shape {

    /** Length of one side of the square. */
    private int len;

    /**
     * Creates a square.
     *
     * @param length the length of one side
     */
    public Square(int length) {
        len = length;
    }

    /**
     * Prints the area of the square (side &times; side).
     */
    @Override // compiler checks that we really implement Shape.area()
    public void area() {
        System.out.println(len * len);
    }
}

/**
 * A rectangle defined by its length and breadth.
 */
class Rectangle implements Shape {

    /** Length of the rectangle. */
    private int len;

    /** Breadth (width) of the rectangle. */
    private int breadth;

    /**
     * Creates a rectangle.
     *
     * @param length  the length of the rectangle
     * @param breadth the breadth of the rectangle
     */
    public Rectangle(int length, int breadth) {
        len = length;
        this.breadth = breadth; // "this" separates the field from the parameter
    }

    /**
     * Prints the area of the rectangle (length &times; breadth).
     */
    @Override
    public void area() {
        System.out.println(len * breadth);
    }
}

/**
 * A circle defined by its radius.
 */
class Circle implements Shape {

    /** Approximate value of pi; one shared constant for all circles. */
    private static final double PI = 3.14;

    /** Radius of the circle. */
    private int radius;

    /**
     * Creates a circle.
     *
     * @param r the radius of the circle
     */
    public Circle(int r) {
        radius = r;
    }

    /**
     * Prints the area of the circle (&pi; &times; r &times; r).
     */
    @Override
    public void area() {
        System.out.println(PI * radius * radius);
    }
}
