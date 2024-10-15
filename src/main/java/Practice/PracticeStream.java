package Practice;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeStream {
        public static void main(String[] args) {
                // 1. Write a Java program to calculate the average of a list of integers using
                // streams.

                List<Integer> intList1 = new ArrayList<>(
                                Arrays.asList(1, 2, 3, 6, 5, 4, 8, 9, 5, 6, 5, 9, 12, 36, 65, 25, 45, 84, 76, 95));
                OptionalDouble avg = intList1.stream().mapToInt(Integer::intValue).average();
                System.out.println(avg.getAsDouble());

                // Write a Java program to convert a list of strings to uppercase or lowercase
                // using streams.
                List<String> strList1 = new ArrayList<>(Arrays.asList("Hello", "World"));
                List<String> upperCase = strList1.stream().map(String::toUpperCase).toList();
                List<String> lowerCase = strList1.stream().map(String::toLowerCase).toList();
                System.out.println(upperCase);
                System.out.println(lowerCase);

                // Write a Java program to calculate the sum of all even, odd numbers in a list
                // using streams.

                Integer sumEven = intList1.stream().mapToInt(Integer::intValue).filter(n -> n % 2 == 0)
                                .peek(t -> System.out.println("Even: " + t)).sum();
                System.out.println("Even sum: " + sumEven);
                System.out.println("Average of Even Number: " + sumEven / intList1.size());

                Integer sumOdd = intList1.stream().mapToInt(Integer::intValue).filter(n -> n % 2 != 0)
                                .peek(t -> System.out.println("Odd: " + t)).sum();
                System.out.println("Odd sum: " + sumOdd);
                System.out.println("Average of Odd Number: " + sumOdd / intList1.size());

                // Write a Java program to remove all duplicate elements from a list using
                // streams.
                List<Integer> removeDuplicate = intList1.stream().distinct()
                                .collect(Collectors.toCollection(ArrayList::new));
                System.out.println("Duplicates removed: " + removeDuplicate);

                // Write a Java program to count the number of strings in a list that start with
                // a specific letter using streams.
                List<String> stringList = Arrays.asList("Apple", "Banana", "Avocado", "Blueberry", "Cherry", "Apricot",
                                "Aardvark");
                long count = stringList.stream().filter(t -> t.charAt(0) == 'A').count();
                System.out.println("Starting with letter A: " + count);

                // Map<Character, List<String>> countOccuranceBasedOnFirstLetter =
                // stringList.stream().map()

                List<Employee> empList = Arrays.asList(new Employee(1, "ram", "UP"),
                        new Employee(2, "max", "london"),
                        new Employee(3, "tan", "artimis"),
                        new Employee(4, "ran", "uropa"),
                        new Employee(5, "eva", "edith"),
                        new Employee(6, "eva", "ranson")
                        );
//              Print all name
                empList.stream().forEach(x->System.out.println(x.getName()));
                empList.forEach(x->System.out.println(x.getName()));
                empList.forEach(System.out::println);

//                print where id is greater than 3
                System.out.println("\nprint where id is greater than 3 ");
                empList.stream().filter(x->x.getId()>3).forEach(System.out::println);

                System.out.println("\nHighest id");
                System.out.println( empList.stream().mapToInt(x->x.getId()).max().getAsInt());
                String s = empList.stream()
                        .max(Comparator.comparing(Employee::getId))
                        .map(Employee::getName)
                        .get();
                System.out.println(s);

                System.out.println("\nlowest id");
                System.out.println( empList.stream().mapToInt(x->x.getId()).min().getAsInt());
                String s1 = empList.stream()
                        .min(Comparator.comparing(Employee::getId))
                        .map(Employee::getName)
                        .get();
                System.out.println(s1);

//                print count of employee
                System.out.println("\ncount");
                System.out.println(empList.stream().count());

                System.out.println("\nprint unique name");
                empList.stream().map(Employee::getName).distinct().forEach(System.out::println);

//                if we want to print comma seperated value then
                String e= empList.stream().map(Employee::getName).distinct().collect(Collectors.joining(","));
                System.out.println(e);


                System.out.println("\nsort based on name");
                empList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

                System.out.println("\nsort based on name in reverse order");
                empList.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);

                System.out.println("\nsort based on name and address");
                empList.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getAddress)).forEach(System.out::println);

                System.out.println("\nprint by grouping name");
                Map<String, List<Employee>> map1 = empList.stream().collect(Collectors.groupingBy(Employee::getName));
                Map<String, Long> map2 = empList.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
                System.out.println(map1);
                System.out.println(map2);

                System.out.println("\nprint duplicate name");
                Map<String, Long> map3 = empList.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
                map3.entrySet().stream().filter(x->x.getValue()>1).forEach(System.out::println);
                String ssdf = "sdf";

        }

        
}
