package Decorator_Pattern.decorator_impl;

import Decorator_Pattern.component.Beverage;
import Decorator_Pattern.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    public Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+0.40;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" with Soy \n";
    }
}
