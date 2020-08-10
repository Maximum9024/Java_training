package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class TestMethods {

  static   LinkedList<String> names = new LinkedList<String>();

    public static void main(String[] args) {
          push_Method();
             Object[] Arraynames=names.toArray();
             for (int i =0;i<Arraynames.length;i++){
                 System.out.println(Arraynames[i]);
             }
    }
    static    void push_Method(){
        names.push("Maxwell");
        names.push("David");
        names.push("Jessy");
        names.push("Presca");
        names.push("Officious");

    }
    static void  Iterator_meth(){
        Iterator iterate = names.iterator();
        while (iterate.hasNext()){
            String obj= (String)iterate.next();
            System.out.println(obj);

        }

    }
    static boolean containsAll(){
        LinkedList<String> list = new LinkedList<String>();
        list.push("Maxwell");
        list.push("David");
        list.push("Jessy");
        list.push("Presca");
        list.push("Jessy");
        list.contains(names);
        return names.containsAll(list);
    }
    static void addAll_Method(){
        names.addAll(names);

    }

    static String get_Method(){
        return names.get(2);

    }
    static boolean contains_Method(){
        return names.contains("Maxwell");

    }
    static int size_Method(){
       return names.size();

    }

    static void clear_Method(){
        names.clear();

    }

    static  void pop_Method(){
        names.pop();
        names.pop();
        names.pop();


    }





}
