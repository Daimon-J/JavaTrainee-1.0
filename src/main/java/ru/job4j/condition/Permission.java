package ru.job4j.condition;

public class Permission {

    public static void permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the cinema.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        Permission.permission(true, true);
        Permission.permission(true, false);
        Permission.permission(false, true);
        Permission.permission(false, false);
    }
}
