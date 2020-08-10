package com.company;

public class InstanceCounter {

         static int counter;

    public InstanceCounter(){
        counter++;
        System.out.println("I am instance number:"+counter);
    }


}
