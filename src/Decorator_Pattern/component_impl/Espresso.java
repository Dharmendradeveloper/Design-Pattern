package Decorator_Pattern.component_impl;

import Decorator_Pattern.component.Beverage;

public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return "Ordered Espresso ";
    }

    @Override
    public double cost() {
        return 0.20;
    }
}
