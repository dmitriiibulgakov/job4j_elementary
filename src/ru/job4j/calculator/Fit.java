package ru.job4j.calculator;
public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15f;
    }
    public static double womanWeight(short height) {
        return (height - 110) * 1.15f;
    }
    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        height = 180;
        double woman = Fit.womanWeight(height);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 180 is " + woman);
    }
}
