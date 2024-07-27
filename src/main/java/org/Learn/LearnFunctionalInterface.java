package org.Learn;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import com.google.gson.Gson;

@FunctionalInterface
interface TestInterface {
    public abstract int test();

    // only one abstract method
    default void print() {
        System.out.println("Functional Interface");
    }

    public static int add(int a, int b) {
        return a + b;
    }
    // any number of default and static method
}

public class LearnFunctionalInterface {
    public static void main(String[] args) {
        // 1. Consumer -- only consume_________ .accept
        // 2. Predicate -- return boolean______ .test
        // 3. Function -- input and output_____ .apply
        // 4. Supplier -- only output, no input .get

        // Predicate
        // BiPredicate is also there which takes two arguments
        Predicate<String> checkLength = str -> str.length() > 5;
        System.out.println(checkLength.test("qwerty"));
        System.out.println(checkLength.test("qwer"));

        BiPredicate<Integer, String> checkGreaterThan5AndStringLength5 = (a, b) -> a > 5 && b.length() == 5;
        System.out.println("=============BiPredicate=============");
        System.out.println(checkGreaterThan5AndStringLength5.test(6, "qwerty"));

        // Consumer
        // BiConsumer is also there which takes two arguments
        Person p = new Person();
        Consumer<Person> setName = t -> t.setName("Consumer Test");
        setName.accept(p);
        System.out.println(p.getName());

        BiConsumer<Person, String> setNameUsingBiConsumer = (a, b) -> a.setName(b);
        setNameUsingBiConsumer.accept(p, "Rohan");
        System.out.println(new Gson().toJson(p));

        System.out.println("===========Real world use Consumer==============");

        p.realWorldConsumerTest("address", "name").accept(null);
        System.out.println(new Gson().toJson(p));

        // Function
        // BiFunction is also there which takes two arguments

        // Unary Operator extends Function
        // accepts only one argument and returns a single argument only
        // both the input and output values must be identical and of the same type

        // Binary Operator extends Bi-Function
        // takes two values and returns one value
        // input and output value types must be identical and of the same type

        Function<Integer, String> getInt = t -> t * 10 + " Data multiplied by 10";
        // ......input... result
        System.out.println(getInt.apply(2));

        BiFunction<Integer, Integer, String> addAndConvertToStrint = (a, b) -> "Adding two Number: " + (a + b);
        // .......input.....input....result
        System.out.println(addAndConvertToStrint.apply(10, 20));

        UnaryOperator<Integer> unaryOperator = t -> t * 10;
        System.out.println("UnaryOperator: " + unaryOperator.apply(10));

        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        System.out.println("BinaryOperator " + binaryOperator.apply(10, 10));

        // Supplier
        Supplier<Double> getRandomDouble = () -> Math.random();
        System.out.println(getRandomDouble.get());
    }

}

class Person {
    private String name;
    public String address;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public <X> Consumer<X> realWorldConsumerTest(String address, String name) {

        return set -> {
            this.name = name;
            this.address = address;
        };
    }
}
