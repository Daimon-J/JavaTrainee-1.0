package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пянтица", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        int rsl1 = MultipleSwitchWeek.numberOfDay("Monday");
        int rsl2 = MultipleSwitchWeek.numberOfDay("Понедельник");
        int rsl3 = MultipleSwitchWeek.numberOfDay("Sunday");
        int rsl4 = MultipleSwitchWeek.numberOfDay("Ssunnday");
        System.out.println(rsl1);
        System.out.println(rsl2);
        System.out.println(rsl3);
        System.out.println(rsl4);
    }
}
