
public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle.toString());

        triangle = new Triangle("red");
        System.out.println(triangle.toString());

        triangle = new Triangle("yellow", 3, 4, 5);
        System.out.println(triangle.toString());
        System.out.println("Dien tich tam giac:" + triangle.getArea());
        System.out.println("Chu vi tam giac:" + triangle.getPerimeter());
    }
}