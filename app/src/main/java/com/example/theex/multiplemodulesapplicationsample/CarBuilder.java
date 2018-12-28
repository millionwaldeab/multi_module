package com.example.theex.multiplemodulesapplicationsample;

import com.example.theex.multiplemodulesapplicationsample.Components.CarWindow;
import com.example.theex.multiplemodulesapplicationsample.Components.Chassi;
import com.example.theex.multiplemodulesapplicationsample.Components.CustomEngine;
import com.example.theex.multiplemodulesapplicationsample.Components.Light;
import com.example.theex.multiplemodulesapplicationsample.Components.Sterio;
import com.example.theex.multiplemodulesapplicationsample.Components.Tire;
import com.example.theex.multiplemodulesapplicationsample.Components.Wheel;

import javax.inject.Inject;

/***
This class will be the main class that will utilize the modules to manufacture the different
components needed to have a functional car. Those module classes will be injected to this class
that way the heavy lifting would be done by them and not this class. They have used this methodolgy
with the main activity to make the activity do less work related to views only. This makes the
architecture clean by making the activity do stuff related to views only.
***/

public class CarBuilder {
    private Tire mTire;
    private CarWindow mWindow;
    private CustomEngine mEngine;
    private Chassi mChassi;
    private Sterio mSterio;
    private Light mLight;
    private Wheel mWheel;

    //@Inject
    public CarBuilder(Tire tire, CarWindow window, CustomEngine engine, Chassi chassi, Sterio sterio,
                       Light light, Wheel wheel){
    this.mTire = tire;
    this.mWindow = window;
    this.mEngine = engine;
    this.mChassi = chassi;
    this.mSterio = sterio;
    this.mLight = light;
    this.mWheel = wheel;
    }

    public void makeCar(){
        mTire.getName();
        mWindow.getBrandWindow();
        mWindow.getDesign();
        mWindow.getName();
        mEngine.getName();
        mEngine.getSize();
        mChassi.getName();
        mChassi.getSize();
        mSterio.getName();
        mSterio.getCdamount();
        mLight.getName();
        mWheel.getName();
    }

}
