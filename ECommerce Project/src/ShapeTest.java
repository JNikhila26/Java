public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5.0),
                new Rectangle(4.0, 6.0),
                new Circle(3.5)
        };
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println("------------");
        }
    }
}
