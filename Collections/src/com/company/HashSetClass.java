package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetClass {
    public static void main(String[] args) {

        java.util.HashSet<String> Social_Network= new java.util.HashSet<>();

        Social_Network.add("Intagram");
        Social_Network.add("Facebook");
        Social_Network.add("WhatsApp");
        Social_Network.add("Facebook");

        Set CloneHash= new java.util.HashSet();
        System.out.println(Social_Network.clone());

        System.out.println(Social_Network.isEmpty());

        System.out.println(Social_Network.contains("OLX"));

        System.out.println(Social_Network.size());

        System.out.println(Social_Network.remove("Twitter"));
        System.out.println(Social_Network);
    }
}

class GetString{
    public static void main(String[] args) {
        Set Cars= new HashSet();
        Cars.add("BMW");
        Cars.add("BMW");
        Cars.add("Benz");
        Cars.add("Toyota");
       Cars.add("fORD");

             System.out.println(Cars.size());
        Iterator<String> it= Cars.iterator();
        while (it.hasNext()){

                System.out.println(it.next());

        }


    }
}
