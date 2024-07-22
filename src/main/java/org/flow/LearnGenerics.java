package org.flow;

import com.google.gson.JsonArray;

public class LearnGenerics {
    public static void main(String[] args) {
        Test<Integer> obj = new Test<>(15);
        System.out.println(obj.getObj());
        Test<String> obj2 = new Test("Test");
        System.out.println(obj2.getObj());

        Test2Generics<String, String> obj3 = new Test2Generics<>("Test1", "Test2");
        System.out.println(obj3.getObj1() + " " + obj3.getObj2());

        Test2Generics<Integer, Integer> obj4 = new Test2Generics<>(12, 13);
        System.out.println(obj4.getObj1() + " " + obj4.getObj2());

        Test2Generics obj5 = new Test2Generics();
        System.out.println(obj5.printPassedValue("args"));
        System.out.println(obj5.printPassedValue(123));
        System.out.println(obj5.printPassedValue(new JsonArray()));
        obj5.printValue("args");
        obj5.printValue(123);
        obj5.printValue(new JsonArray());

    }
}

class Test<T> {
    // Generic class with one generic variable
    T obj;

    public Test(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

}

class Test2Generics<T, U> {
    // Generic class with one generic variable

    T obj1;
    U obj2;

    public Test2Generics() {

    }

    public Test2Generics(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1() {
        return obj1;
    }

    public U getObj2() {
        return obj2;
    }

    // Generic method with one generic variable
    public T printPassedValue(T value) {
        return value;
    }

    // <X> -> new generic parameter needs to be added in method if its not already
    // added at class level
    // if its already there then below method can be public void printValue(T value)
    // without <X>
    // Generic method with one new generic variable
    public <X> void printValue(X value) {
        System.out.println(value);
    }
}
