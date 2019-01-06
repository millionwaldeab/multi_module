package com.example.theex.multiplemodulesapplicationsample.Components;

import javax.inject.Inject;

public class CustomEngine {
    String name;
    int size;
    enum type{};

    @Inject
    public CustomEngine(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
