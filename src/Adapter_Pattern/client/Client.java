package Adapter_Pattern.client;

import Adapter_Pattern.adapter.TurkeyAdapter;
import Adapter_Pattern.duck.Duck;
import Adapter_Pattern.turkey.Turkey;
import Adapter_Pattern.turkey.WildTurkey;

public class Client {
    public static void main(String[] args) {
        Turkey turkey =  new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        duck.quack();
        duck.fly();
    }
}
