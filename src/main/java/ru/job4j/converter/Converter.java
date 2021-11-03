package ru.job4j.converter;

public class Converter {

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(900);
        System.out.println("Euro: " + euro + " Dollar: " + dollar);
    }
}
