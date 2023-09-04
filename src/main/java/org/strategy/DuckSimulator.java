package org.strategy;

public class DuckSimulator {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        // 주입
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
