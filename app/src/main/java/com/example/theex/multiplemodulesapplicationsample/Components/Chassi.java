package com.example.theex.multiplemodulesapplicationsample.Components;

import javax.inject.Inject;

public class Chassi {
    String name;
    int size;

    @Inject
    public Chassi(String name, int size) {
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
