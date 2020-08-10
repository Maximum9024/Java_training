package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Vector;

class myVector  {


   static    Vector<String> names= new Vector<String>();
    public static void main(String[] args) {
        testAdd();


        Object[] others= names.toArray();

        System.out.println(Arrays.toString(others));

    }

    public static void testRemove(){

        names.remove(1);



    }
    public static void testClear(){

        names.clear();
        ListIterator iterator = names.listIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());


    }
    public static void testSize(){

        names.size();



    }
    public static   void  testAdd(){

        names.add("Paballo");
        names.add("Paballo");
        names.add("Officious");
        names.add("Shubi");
        System.out.println(names);
    }
}
