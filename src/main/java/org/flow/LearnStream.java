package org.flow;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LearnStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = numbers.stream()
                                       .map(n -> n * n)
                                       .collect(Collectors.toList());
        System.out.println(squares); // Output: [1, 4, 9, 16, 25]

        Optional<Integer> f1 = numbers.stream()
                                       .map(n -> n * n)
                                       .findAny();
        boolean f2 = numbers.stream()
                                       .map(n -> n * n)
                                       .allMatch(t->t%2==0);
        boolean f3 = numbers.stream()
                                       .map(n -> n * n)
                                       .anyMatch(t->t%2==0);

        System.out.println("FindAny: " + f1);//return any number
        System.out.println("AllMatch: " + f2);//return true if all match condition else false
        System.out.println("AnyMatch: " + f3);//return true if any match condition else false


        List<List<Integer>> lists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
        );
        List<Integer> flattened = lists.stream()
                                       .flatMap(List::stream)
                                       .collect(Collectors.toList());
        System.out.println(flattened); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]

        // Using peek to inspect elements before and after transformation
        List<Integer> doubledNumbers = numbers.stream()
            .peek(n -> System.out.println("Original number: " + n)) // Peek before transformation
            .map(n -> n * 2) // Transform: double the number
            .peek(n -> System.out.println("Doubled number: " + n)) // Peek after transformation
            .collect(Collectors.toList());

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);


        // Reduce
        // Identity is initial value for that combiner
        
        // Using reduce to sum the numbers
        int sum = numbers2.stream()
                         .reduce(0, (a, b) -> a + b); // Identity: 0, Accumulator: (a, b) -> a + b

        System.out.println("Sum: " + sum); // Output: Sum: 15

        int product = numbers.stream()
                             .reduce(1, (a, b) -> a * b); // Identity: 1, Accumulator: (a, b) -> a * b

        System.out.println("Product: " + product);

        List<String> words = Arrays.asList("Hello", "world", "from", "Java");

        // Using reduce to concatenate the strings
        String concatenated = words.stream()
                                   .reduce("", (a, b) -> a + " " + b); // Identity: "", Accumulator: (a, b) -> a + " " + b

        System.out.println("Concatenated String: " + concatenated.trim()); // Output: Concatenated String: Hello world from Java

        Optional<Integer> max = numbers.stream()
                                       .reduce((a, b) -> a > b ? a : b);

        System.out.println("Max: " + max.orElse(null)); // Output: Max: 5
    
    }
}
