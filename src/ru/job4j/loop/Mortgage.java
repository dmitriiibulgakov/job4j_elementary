package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double debt = amount;
        while (debt > 0) {
            debt *= 1 + percent / 100;
            debt -= salary;
            year++;
        }
        return year;
    }
}
