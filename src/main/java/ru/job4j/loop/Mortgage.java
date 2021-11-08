package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount += amount * (percent / 100) - salary;
            year++;
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(Mortgage.year(4000, 15000, 0.2));
    }
}
