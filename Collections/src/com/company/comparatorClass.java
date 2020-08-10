package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Child{
    int age;
    String name;

    Child(int age, String name){
        this.age= age;
        this.name= name;
    }
    public  String toString(){
        return "name "+name+" ,age "+ age;
    }

}

class MyComparator implements Comparator<Child>{


    @Override
    public int compare(Child o1, Child o2) {
        if (o1.age==o2.age) return 0;
        else if(o1.age>o1.age) return 1;
        else return -1;
    }
}


public class comparatorClass {
    public static void main(String[] args) {
        ArrayList<Child> Children= new ArrayList<Child>();
        Children.add( new Child(18,"Maxwell"));
        Children.add(new Child(14,"Sophie"));
        Children.add(new Child(17,"Adam"));
        Children.add(new Child(11,"Alex"));
        Collections.sort(Children, new MyComparator());
        System.out.println(Children);

    }

}
