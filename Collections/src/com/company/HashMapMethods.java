package com.company;

import java.util.*;
import java.util.HashMap;

public class HashMapMethods {
    public static void main(String[] args) {
        HashMap<Integer,String> hMap =new HashMap<Integer,String>();

        hMap.put(1,"Refiloe");
        hMap.put(2,"Lesego");
        hMap.put(5,"Nthabiseng");
        hMap.put(7,"Lerato");
        hMap.put(56,"Happiness");
        hMap.put(56,"Happiness");
        System.out.println(hMap.get(56));
        System.out.println(hMap.containsValue("REfiloe"));
        System.out.println(hMap.containsKey(70));
        hMap.remove(7);
        System.out.println(hMap.values());
        System.out.println(hMap.size());
        System.out.println(hMap.entrySet());
        System.out.println(hMap.keySet());

      hMap.clear();




    }
}



 class MapTest1 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        hashMap.put("China", "beijeng");
        hashMap.put("New York", "Paris");
        hashMap.put("SA", "Joburg");
        hashMap.put("Malawi", "Lilongwe");
        hashMap.put("SA", "Lagos");
        hashMap.put("SA", "Pretoria");
        hashMap.put("Japan", "Tokyo");

        Set keySet = hashMap.keySet();
        Collection values = hashMap.values();
        Iterator iterator= values.iterator();
        Iterator iterator1= keySet.iterator();

        System.out.println("Before clear");
        System.out.println(hashMap.values());
        System.out.println("after clear");
     //  hashMap.clear();
       System.out.println(hashMap.keySet());

    }
}

class PutMap{
    public static void main(String[] args) {
        HashMap firstMap= new HashMap();
        firstMap.put("101",45);
        firstMap.put("102",50);
        firstMap.put("103",12);
        firstMap.put("104",67);
        firstMap.put("105",36);

        HashMap secndMap= new HashMap();
        secndMap.put(45,"101");
        secndMap.put(50,"102");
        secndMap.put(12,"103");
        secndMap.put(67,"104");
        secndMap.put(36,"105");
        firstMap.putAll(secndMap);

        System.out.println(firstMap);

    }


}
