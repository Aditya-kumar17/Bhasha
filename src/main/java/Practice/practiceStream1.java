package Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class practiceStream1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("square and collect to list");
        List<Integer> arr = numbers.stream().map(x->x*x).toList();
        System.out.println(numbers.stream().map(x->x*x).collect(Collectors.toList()));

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
        System.out.println("\nUse Stream API to find the length of the longest name in the list");
        System.out.println(names.stream().max(Comparator.comparing(x->x.length())));
        System.out.println(names.stream().max((x,y)->x.length()-y.length()));
        System.out.println(names.stream().max(Comparator.comparingInt(String::length)));


        List<Student12> students = Arrays.asList(
                new Student12(1, "Alice", "New York"),
                new Student12(2, "Bob", "Los Angeles"),
                new Student12(3, "Charlie", "New York"),
                new Student12(4, "David", "Chicago"),
                new Student12(5, "Eva", "Los Angeles"),
                new Student12(6, "Frank", "Chicago")
        );

        Map<String, Long> cityCount = students.stream()
                .collect(Collectors.groupingBy(Student12::getCity, Collectors.counting()));

        System.out.println(cityCount);

        // Step 2: Sort the map entries by city name in ascending order.
        cityCount.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }
}

class Student12 {
    int id;
    String name;
    String city;

    public Student12(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', city='" + city + "'}";
    }
}
