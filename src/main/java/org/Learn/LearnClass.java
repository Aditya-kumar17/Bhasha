package org.Learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearnClass {
    public static void main(String[] args) {

        // +------------------------------------+
        // |____sort an Array of Objects_____|
        // +------------------------------------+
        OfficeEmployee e1 = new OfficeEmployee(351,"Sam", "Phoenix");
        OfficeEmployee e2 = new OfficeEmployee(453,"Max", "NY");
        OfficeEmployee e3 = new OfficeEmployee(42,"Andre", "Brazil");
        OfficeEmployee e4 = new OfficeEmployee(6,"David", "Gaza");
        List<OfficeEmployee> empList1 = new ArrayList<>(Arrays.asList(e1,e2,e3,e4));
        System.out.println("Employee List: " + empList1.toString());
        Collections.sort(empList1);
        System.out.println("Employee List sorted: " + empList1.toString());

        // +------------------------------------+
        // |____reverse an Array of Objects_____|
        // +------------------------------------+
        OfficeEmployee e5 = new OfficeEmployee(453,"Max", "NY");
        OfficeEmployee e6 = new OfficeEmployee(42,"Andre", "Brazil");
        OfficeEmployee e7 = new OfficeEmployee(6,"David", "Gaza");
        OfficeEmployee e8 = new OfficeEmployee(351,"Sam", "Phoenix");

        List<OfficeEmployee> empList2 = new ArrayList<>(Arrays.asList(e1,e2,e3,e4));
        System.out.println("Employee List: " + empList2.toString());
        Collections.reverse(empList2);
        System.out.println("Employee List reversed: " + empList2.toString());
    }
}

class OfficeEmployee implements Comparable<OfficeEmployee> {
    public OfficeEmployee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "it=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(OfficeEmployee obj){
        return Integer.compare(this.id, obj.id);
//        Below is old/classic way of doing this
//        if(this.id>obj.id) return 1;
//        if(this.id<obj.id) return -1;
//        return 0;
    }

    public int id;
    public String name;
    public String address;
}
