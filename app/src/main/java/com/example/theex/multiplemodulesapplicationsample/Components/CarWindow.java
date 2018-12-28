package com.example.theex.multiplemodulesapplicationsample.Components;

import com.example.theex.multiplemodulesapplicationsample.Components.CustomDesign.CarBrandWindow;
import com.example.theex.multiplemodulesapplicationsample.dimensions.Design;

public class CarWindow {
    String name;
    Design design;
    CarBrandWindow brandWindow;

    public CarWindow(String name, Design design, CarBrandWindow brandWindow) {
        this.name = name;
        this.design = design;
        this.brandWindow = brandWindow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Design getDesign() {
        return design;
    }

    public void setDesign(Design design) {
        this.design = design;
    }

    public CarBrandWindow getBrandWindow() {
        return brandWindow;
    }

    public void setBrandWindow(CarBrandWindow brandWindow) {
        this.brandWindow = brandWindow;
    }
}
