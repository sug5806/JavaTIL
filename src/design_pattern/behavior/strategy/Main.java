package design_pattern.behavior.strategy;

public class Main {
    public static void main(String[] args) {
        Duck myDuck = new NormalDuck();

        myDuck.performFly();
        myDuck.performQuack();
        System.out.println("=========================");

        myDuck.changeFlyBehavior(new FlyRocketPowered());

        myDuck.performFly();
        myDuck.performQuack();
    }
}
