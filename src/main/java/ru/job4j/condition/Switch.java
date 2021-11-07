package ru.job4j.condition;

public class Switch {
    public static String nameOfDay(int day) {
        String name;
        switch (day){
            case 1:
                name = "Monday";
                break;
            case 2:
               name = "Tuesday";
                break;
            case 3:
                name = "Wednesday";
                break;
            case 4:
                name = "Thursday";
                break;
            case 5:
                name = "Friday";
                break;
            case 6:
                name = "Saturday";
                break;
            case 7:
                name = "Sunday";
                break;
            default:
                name = "Error";
        }
        return name;
    }

    public static void main(String[] args) {
        String rsl = Switch.nameOfDay(2);
        String rsl1 = Switch.nameOfDay(44);
        System.out.println(rsl);
        System.out.println(rsl1);
    }
}
