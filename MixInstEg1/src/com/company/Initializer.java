package com.company;

public class Initializer {

    public Initializer(){
        System.out.println("Constructor");
    }

    static{
        System.out.println("Static initialization block.");
    }
    {
        System.out.println("Instance initialization block.");
    }


}
