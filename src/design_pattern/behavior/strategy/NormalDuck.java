package design_pattern.behavior.strategy;

public class NormalDuck extends Duck {
    public NormalDuck() {
        this.quackBehavior = new KoreanQuack();
        this.flyBehavior = new FlyWithWings();
    }
}
