package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        Set<Integer> integers1 = new HashSet<>();
        integers1.add(0);
        integers1.add(1);
        integers1.add(2);

        System.out.println(symmetricDifference(integers, integers1));

    }

    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> newInteger = new HashSet<>(set1);
        newInteger.removeAll(set2);
        set2.removeAll(set1);
        newInteger.addAll(set2);
        return newInteger;
    }
}