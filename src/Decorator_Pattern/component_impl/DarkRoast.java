package Decorator_Pattern.component_impl;

import Decorator_Pattern.component.Beverage;

public class DarkRoast extends Beverage {

    @Override
    public String getDescription() {
        return "Ordered Dark Roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
