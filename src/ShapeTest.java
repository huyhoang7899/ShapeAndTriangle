public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.toString());
        shape = new Shape("red");
        System.out.println(shape.toString());
    }
}