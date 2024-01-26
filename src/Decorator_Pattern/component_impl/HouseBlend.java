package Decorator_Pattern.component_impl;

import Decorator_Pattern.component.Beverage;

public class HouseBlend extends Beverage {

    @Override
    public String getDescription() {
        return "Ordered HouseBlend ";
    }

    @Override
    public double cost() {
        return 0.50;
    }
}
