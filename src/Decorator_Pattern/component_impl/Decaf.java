package Decorator_Pattern.component_impl;

import Decorator_Pattern.component.Beverage;

public class Decaf extends Beverage {

    @Override
    public String getDescription() {
        return "Ordered Decaf";
    }

    @Override
    public double cost() {
        return 0.10;
    }
}
