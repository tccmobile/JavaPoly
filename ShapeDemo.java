// Main class to demonstrate the concepts
public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Red", 5.0);
        shapes[1] = new Rectangle("Blue", 4.0, 6.0);
        shapes[2] = new Circle("Green", 3.0);

        for (Shape shape : shapes) {
            System.out.println("Shape Type: " + shape.getClass().getSimpleName());
            System.out.println("Color: " + shape.getColor());
            System.out.println("Area: " + shape.getArea());

            // Demonstrate RTTI
            if (shape instanceof Circle) {
                System.out.println("This is a Circle");
            } else if (shape instanceof Rectangle) {
                System.out.println("This is a Rectangle");
            }

            System.out.println();
        }
    }
}