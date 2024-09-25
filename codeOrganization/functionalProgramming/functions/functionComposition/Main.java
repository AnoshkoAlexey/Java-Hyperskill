package codeOrganization.functionalProgramming.functions.functionComposition;
import java.util.function.Function;
import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> adder = x -> x + 10;
        Function<Integer, Integer> multiplier = x -> x * 5;

        // compose: adder(multiplier(5))
        System.out.println("result: " + adder.compose(multiplier).apply(5));

        // andThen: multiplier(adder(5))
        System.out.println("result: " + adder.andThen(multiplier).apply(5));

        IntPredicate isOdd = n -> n % 2 != 0; // It's true for 1, 3, 5 and so on
        
        System.out.println(isOdd.test(10));
        System.out.println(isOdd.test(11));

        IntPredicate lessThan11 = n -> n < 11; // it's true for all numbers < 11
        System.out.println(lessThan11.test(10)); // prints "true"
        System.out.println(lessThan11.test(11)); // prints "false"

        IntPredicate isEven = isOdd.negate(); // it's true for 0, 2, 4 and so on
        System.out.println(isEven.test(10)); // prints "true"
        System.out.println(isEven.test(11)); // prints "false"

        IntPredicate isOddOrLessThan11 = isOdd.or(lessThan11);

        System.out.println(isOddOrLessThan11.test(10)); // prints "true"
        System.out.println(isOddOrLessThan11.test(11)); // prints "true"
        System.out.println(isOddOrLessThan11.test(12)); // prints "false"
        System.out.println(isOddOrLessThan11.test(13)); // prints "true"

        IntPredicate isOddAndLessThan11 = isOdd.and(lessThan11);

        System.out.println(isOddAndLessThan11.test(8));  // prints "false"
        System.out.println(isOddAndLessThan11.test(9));  // prints "true"
        System.out.println(isOddAndLessThan11.test(10)); // prints "false"
        System.out.println(isOddAndLessThan11.test(11)); // prints "false"
 
    }
}