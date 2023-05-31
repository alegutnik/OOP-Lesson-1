package Task_2;

public class Rectangle {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double areaCalculator() {
        double area = this.side1 * this.side2;
        System.out.println("Площа прямокутника: " + area);
        return area;
    }

    public double perimeterCalculator() {
        double perimeter = (this.side1 + this.side2) * 2;
        System.out.println("Периметр прямокутника: " + perimeter);
        return perimeter;
    }
}
