package com.example.theex.multiplemodulesapplicationsample.Components;

import javax.inject.Inject;

public class Wheel {
    String name;

    @Inject
    public Wheel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    enum type{};
}
