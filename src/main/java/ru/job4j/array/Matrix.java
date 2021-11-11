package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int cell = 0; cell < size; cell++) {
            for (int row = 0; row < size; row++) {
                table[cell][row] = (cell + 1) * (row + 1);
            }
        }
        return table;
    }
}
