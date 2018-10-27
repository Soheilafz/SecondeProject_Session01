package com.soheil.library;

public class SampleC {

    static int year = 1397;
    static int price = 30000;
    static String address = "SarAfraz , Beheshti";
    static boolean expencive = true;

    public static void main(String[] args) {
//        System.out.println("This Year Is " + year);
        printYear(year);
        printYear(1400);
        print("My Name Soheil");
    }


    static void printYear(int year){
        print("This Year IS " + year);
    }

    static void print(String msg){
        System.out.println(msg);
    }
}
