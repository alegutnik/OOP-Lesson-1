package Task_2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangleFirst = new Rectangle(1.5, 3);
        Rectangle rectangleSecond = new Rectangle(7.25, 4);

        System.out.println("Результат розрахунку першого прямокутника");
        rectangleFirst.areaCalculator();
        rectangleFirst.perimeterCalculator();

        System.out.println("----------");

        System.out.println("Результат розрахунку другого прямокутника");
        rectangleSecond.areaCalculator();
        rectangleSecond.perimeterCalculator();
    }
}
