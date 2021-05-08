package design_pattern.behavior.strategy;

public class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public void performQuack() {
        this.quackBehavior.quack();
    }

    public void performFly() {
        this.flyBehavior.fly();
    }

    public void changeFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void changeQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
