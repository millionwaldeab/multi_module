package com.example.theex.multiplemodulesapplicationsample.Components;

public class Tire {
    String name;
    boolean isAllSeasonal;

    public Tire(String name, boolean isAllSeasonal) {
        this.name = name;
        this.isAllSeasonal = isAllSeasonal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAllSeasonal() {
        return isAllSeasonal;
    }

    public void setAllSeasonal(boolean allSeasonal) {
        isAllSeasonal = allSeasonal;
    }

    enum type{};
}
