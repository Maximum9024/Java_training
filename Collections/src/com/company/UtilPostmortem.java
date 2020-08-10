package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class UtilPostmortem {
    public static void main(String[] args) {
          String [] entries={"entry1","entry2"};
        int count =0;
     while (entries[count++]!=null){
         System.out.println(count);
     }
     System.out.println(count);
    }
}
class tester{
     int i;
    private static  int increment(int i){
        return ++i;
    }
    public tester(){
        i=1;
    }

    public static void main(String[] args) {
        System.out.println(new tester().i);
        System.out.println(new tester().i=new tester().increment(new tester().i));
    }
}
class Tester2{
    public static void main(String[] args) {
   String [] arr={"java","champ","champion"};
        System.out.println(Arrays.binarySearch(arr,"champion"));
   System.out.println(Arrays.binarySearch(arr,"YOU"));
        System.out.println(Arrays.binarySearch(arr,"One"));
    }
}

class Tester3{
    public static void main(String[] args) {
        Set<Foo> myFooSet=new HashSet<Foo>();
        myFooSet.add(new Foo(2));
        myFooSet.add(new Foo(1));
        myFooSet.add(new Foo(3));
        myFooSet.add(new Foo(3));
        myFooSet.add(new Foo(2));
        System.out.println(myFooSet.size());
    }
}
class Foo{
    Integer code;
    Foo(Integer c){
        code=c;
    }
    public boolean equals(Foo f){
        return false;
    }
    public boolean equals(Object f){
        return true;
    }
    public int hashcode(){
        return 17;
    }
}
class Hashset {
    private  String str;
    public Hashset(String str){
        this.str=str;

    }
    public String toString(){
        return this.str;
    }
    public static void main(String[] args) {
        Hashset h1= new Hashset("2");
        String s1=new String("1");
        List<Object> list = new LinkedList<Object>();
        list.add(h1);
        list.add(s1);


    }
}
class EquivalenceTest5{
    public static void main(String[] args) {
        String a= new String("a");
        boolean result = a.equals(null);
        System.out.println("Results"+result);
    }
}
