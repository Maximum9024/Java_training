package com.company;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableList {
    public static void main(String[] args) {
        NavigableSet<Long> NavigableList= new TreeSet<>();
        NavigableList.add(12l);
        NavigableList.add(43l);
        NavigableList.add(10l);
        NavigableList.add(10l);
        NavigableList.add(67l);
        System.out.println(NavigableList.pollFirst());
       System.out.println(NavigableList.pollFirst());
    }
}
