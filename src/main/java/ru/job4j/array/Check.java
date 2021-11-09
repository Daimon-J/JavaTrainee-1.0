package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean rsl = true;
        for (int i = 1; i < data.length; i++) {
            if (data[0] != data[1]) {
                rsl = false;
                break;
            }
            if (data[0] != data[i]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
