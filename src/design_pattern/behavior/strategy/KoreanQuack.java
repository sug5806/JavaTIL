package design_pattern.behavior.strategy;

public class KoreanQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("꽤괙");
    }
}
