package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        float height = (float) p / (2 * (k + 1));
        return  (height * k) * height;
    }

    public static void main(String[] args) {
        System.out.println(" p = 4, k = 1, s = 1, real = " + SqArea.square(4, 1));
        System.out.println(" p = 6, k = 2, s = 2, real = " + SqArea.square(6, 2));
    }
}
