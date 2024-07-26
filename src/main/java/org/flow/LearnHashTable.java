package org.flow;

import java.util.Hashtable;

public class LearnHashTable {
    public static void main(String[] args) {
        Hashtable<Integer, Integer> hTable1 = new Hashtable<>();
        hTable1.put(0,123);
        hTable1.put(1,45);
        hTable1.put(2,99);
        hTable1.put(3,1253);
        hTable1.put(4,23);
        hTable1.put(5,3);
        System.out.println(hTable1);
        hTable1.remove(5);
        System.out.println(hTable1);
        System.out.println(hTable1.size());
    }
}
