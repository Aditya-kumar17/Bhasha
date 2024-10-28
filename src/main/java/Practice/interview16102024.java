package Practice;

import java.util.ArrayList;
import java.util.List;

public class interview16102024 {


    public class Main {
        public static void main(String[] args) {
            // Create a list of students
            List<Student> students = new ArrayList<>();
            students.add(new Student(1, "John", "New York"));
            students.add(new Student(2, "Alice", "Los Angeles"));
            students.add(new Student(3, "Bob", "New York"));
            students.add(new Student(4, "Eve", "Chicago"));
            students.add(new Student(5, "Mike", "Los Angeles"));
            students.add(new Student(6, "Emma", "New York"));

//            Arrange in ASC order the cities with student count.
        }
    }
}

class Student {
    private int id;
    private String name;
    private String city;

    public Student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}
