package Decorator_Pattern.decorator_impl;

import Decorator_Pattern.component.Beverage;
import Decorator_Pattern.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
    public Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+0.60;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" with whip \n";
    }
}
