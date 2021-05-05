package reduce;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

class CompareString implements BinaryOperator<String> {
    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length >= s2.getBytes().length) {
            return s1;
        } else {
            return s2;
        }
    }
}


public class ReduceTest {
    public static void main(String[] args) {
        String[] greetings = {"안녕하세요~~~", "hello", "Gooooood morning", "반갑습니다."};

        Stream<String> stream = Arrays.stream(greetings);

        String reduce = stream.reduce("", (s1, s2) -> {
            if (s1.getBytes().length >= s2.getBytes().length) {
                return s1;
            } else {
                return s2;
            }
        });

        System.out.println(reduce);

        String s = Arrays.stream(greetings).reduce(new CompareString()).get();
        System.out.println("s = " + s);
    }
}
