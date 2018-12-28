package com.example.theex.multiplemodulesapplicationsample.Components;

public class Sterio {
    String name;

    public Sterio(String name, int cdamount, boolean hasCassette, boolean isTouchScreen,
                  boolean supportAndroidAuto, boolean supportsAppleAuto) {
        this.name = name;
        this.cdamount = cdamount;
        this.hasCassette = hasCassette;
        this.isTouchScreen = isTouchScreen;
        this.supportAndroidAuto = supportAndroidAuto;
        this.supportsAppleAuto = supportsAppleAuto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCdamount() {
        return cdamount;
    }

    public void setCdamount(int cdamount) {
        this.cdamount = cdamount;
    }

    public boolean isHasCassette() {
        return hasCassette;

    }

    public void setHasCassette(boolean hasCassette) {
        this.hasCassette = hasCassette;
    }

    public boolean isTouchScreen() {
        return isTouchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        isTouchScreen = touchScreen;
    }

    public boolean isSupportAndroidAuto() {
        return supportAndroidAuto;
    }

    public void setSupportAndroidAuto(boolean supportAndroidAuto) {
        this.supportAndroidAuto = supportAndroidAuto;
    }

    public boolean isSupportsAppleAuto() {
        return supportsAppleAuto;
    }

    public void setSupportsAppleAuto(boolean supportsAppleAuto) {
        this.supportsAppleAuto = supportsAppleAuto;
    }

    int cdamount;
    boolean hasCassette;
    boolean isTouchScreen;
    boolean supportAndroidAuto;
    boolean supportsAppleAuto;
    enum type{};
}
