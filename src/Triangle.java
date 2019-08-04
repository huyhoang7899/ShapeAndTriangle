
public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color) {
        super(color);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double perimeter = this.side1 + this.side2 + this.side3;
        perimeter /= 2;
        double area = perimeter * (perimeter - this.side1) * (perimeter - this.side2) * (perimeter - this.side3);
        return Math.sqrt(area);
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        return "Tam giac co canh thu nhat = " + this.side1 + " canh thu 2 = " + this.side2 +
                " canh thu 3 = " + this.side3 + super.toString();
    }
}