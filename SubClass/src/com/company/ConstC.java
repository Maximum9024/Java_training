package com.company;

public class ConstC extends ConstB {

    public ConstC(String name){
        super(name,"Langisi");
        System.out.println("Class C:"+name);
    }
       public ConstC()
       {

           new ConstC("Maxwell");

       }

}
