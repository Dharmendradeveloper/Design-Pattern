package Adapter_Pattern.adapter;

import Adapter_Pattern.duck.Duck;
import Adapter_Pattern.turkey.Turkey;

public class TurkeyAdapter implements Duck {
    private final Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
