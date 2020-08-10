package com.company;


import java.util.*;

import static java.util.Collections.list;
import static java.util.Collections.synchronizedList;

public class ListAdvanced {
    public static void main(String[] args) {
      TestLinkedlist();

    }
     static  void TestLinkedlist(){
        List<Double> weather = new LinkedList<Double>();

         weather.add(23.5);
         weather.add(26.);
         weather.add(45.6);
         List<Double> synclist= Collections.synchronizedList(weather);

         System.out.println("Weather forecast: ");
         System.out.println(synclist);

     }
    static void TestArrayList(){
        List<Integer> list= Arrays.asList(12,34,65,32,76,37);
        List coll = synchronizedList(list);

      //  System.out.println("Synchronized list"+coll);

      coll.contains(12);
        System.out.println(coll + "");



    }
    static  void TestVector(){
        Vector<String> City= new Vector<String>();
        City.add("Pretoria");
        City.add("Joburg");
        City.addElement("Capetown");
        City.addElement("Sandton");

        Enumeration e = City.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }
}
