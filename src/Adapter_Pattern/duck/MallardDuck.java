package Adapter_Pattern.duck;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Duck Quacks");
    }

    @Override
    public void fly() {
        System.out.println("Ducks can fly longer distance");
    }
}
