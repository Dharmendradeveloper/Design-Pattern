package Decorator_Pattern.decorator_impl;

import Decorator_Pattern.component.Beverage;
import Decorator_Pattern.decorator.CondimentDecorator;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return 0.30+beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" with Milk \n";
    }
}
