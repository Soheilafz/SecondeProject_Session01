package com.soheil.library;

public class VariableSample {

    boolean iAmLive = true;
    String city = "Tehran";
    String name = "Soheil";
    String family = "Afzali";
    int Age = 25;
    boolean isIranian = true;
    double pNumber = 3.144444444;
    float latitude = 35.23454f;

    boolean isAlive() {
        return true;
    }

    String getMyName() {
        return "Soheil Afzali";
    }

    int getUserAge(int userID){
        if (userID ==10){
            return 36;
        }
        return 0 ;
    }

    String getUser (int id , boolean isIranian){
        if (id == 10 && isIranian == true)
        {
            return "Soheil";
        }else {
            return "Afzali";
        }
    }

    void printUser(){
        String user = getUser(10,true);
    }
}
