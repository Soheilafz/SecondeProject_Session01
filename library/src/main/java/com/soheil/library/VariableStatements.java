package com.soheil.library;

public class VariableStatements {

    static int year = 25;
    String countryName = "Iran";
    int myBrotherAge = 10;

    public static void main(String[] args) {

    }

    static String getTypeByAge(int age) {
        if (year <= 10) {
            return "Child";
        }
        if (year > 10 && year <= 19) {
            return "TeenAge";
        }
        if (year > 19 && year <= 40) {
            return "Young";
        }
        if (year > 40) {
            return "Old";
        }
        return " ";
    }

    int getPriceByCar(String car) {
        if (car == "Pride") {
            return 20000000;
        } else {
            return 0;
        }
    }

    boolean isIranian(String city) {
        if (city == "Tehran") {
            return true;
        } else if (city == "Dubai") {
            return false;
        } else if (city == "Tabriz") {
            return true;
        } else {
            return false;
        }
    }
}
