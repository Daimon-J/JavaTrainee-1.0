package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        int rsl = left > right ? left : right;
        return rsl;
    }

    public static void main(String[] args) {
        int rsl = Max.max(22, 33);
        System.out.println(rsl);
        int rsl2 = Max.max(22, 3);
        System.out.println(rsl2);
    }
}
