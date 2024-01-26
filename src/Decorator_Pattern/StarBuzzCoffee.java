package Decorator_Pattern;

import Decorator_Pattern.component.Beverage;
import Decorator_Pattern.component_impl.HouseBlend;
import Decorator_Pattern.decorator_impl.Milk;
import Decorator_Pattern.decorator_impl.Mocha;
import Decorator_Pattern.decorator_impl.Soy;
import Decorator_Pattern.decorator_impl.Whip;

public class StarBuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
         beverage = new Milk(beverage);
         beverage = new Soy(beverage);
         beverage = new Mocha(beverage);
         beverage = new Whip(beverage);


        System.out.println(beverage.getDescription()+" Price : " +beverage.cost());
    }
}
