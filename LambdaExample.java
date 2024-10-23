/**
 * Description: This program uses lambda expressions and the Stream API to filter and print even numbers from a list of integers.
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Predicate<Integer> isEven = number -> number % 2 == 0;

        System.out.println("Even numbers:");
        numbers.stream()
               .filter(isEven)
               .forEach(number -> System.out.println(number));
    }
}
