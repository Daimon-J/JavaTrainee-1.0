package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surname = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Daimon";
        names[1] = "Linux";
        names[2] = "Lee";
        names[3] = "Marina";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println(ages.length);
        System.out.println(surname.length);
        System.out.println(prices.length);

    }

}
