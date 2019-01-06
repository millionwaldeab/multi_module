package com.example.theex.multiplemodulesapplicationsample.Components.CustomDesign;

import android.util.Log;
import javax.inject.Inject;



public class CarBrandWindow {
    String[] cars = {"Toyota", "Honda", "Volvo", "Nissan", "Hyndai", "Kia", "Cadillac", "Lincoln", "Buick"
            , "Ford", "Chevrolet"};

    String carvalue;

    @Inject
    public CarBrandWindow(String car) {
        this.carvalue = car;
    }


    public String setValue(String car) {
        for (String c: cars){
            if (car.equals(c)){
                return c;
            } else{
                Log.e("out", "Doesn't exist");
            }
        }
        return carvalue;
    }

    public void getLogs(){
        Log.e("log", "log messages");
    }
}
