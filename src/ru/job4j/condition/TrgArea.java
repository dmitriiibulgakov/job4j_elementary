package ru.job4j.condition;
public class TrgArea {
    public static double area(double a, double b, double c) {
        double semiPerimeter = (a + b + c) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
    }
    public static void main(String[] args) {
        System.out.println("area (2, 2, 2) = " + TrgArea.area(2, 2, 2));
    }
}
