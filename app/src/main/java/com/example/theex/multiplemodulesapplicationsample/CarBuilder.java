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
architecture clean by making the activity do stuff related to views only. I have to stress on making this
 in a separate module that is isolated from the presentation and data layers to make is easily testable
 and easily maintained. It should never know about the presentation layer nor data layer or android related
 stuff. It should be pure java code specific to business logic only.
***/

public class CarBuilder {
    //@Inject
    Tire mTire;
    //@Inject
    CarWindow mWindow;
    //@Inject
    CustomEngine mEngine;
    //@Inject
    Chassi mChassi;
    //@Inject
    Sterio mSterio;
    //@Inject
    Light mLight;
    //@Inject
    Wheel mWheel;

    @Inject
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
