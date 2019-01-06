package com.example.theex.multiplemodulesapplicationsample.Components;

import javax.inject.Inject;

public class Light {
    enum brightness{};
    enum type{};
    enum shape{};
    String name;

    @Inject
    public Light(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
