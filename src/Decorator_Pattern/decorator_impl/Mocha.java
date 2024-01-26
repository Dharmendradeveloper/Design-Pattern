package Decorator_Pattern.decorator_impl;

import Decorator_Pattern.component.Beverage;
import Decorator_Pattern.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    public Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+0.70;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"with Mocha \n";
    }
}
