package com.company;

public class Inheritance11 {
   static  void test(){
    System.out.println("test");
}
}

 class Inheritance12 extends Inheritance11{

   protected  static  void test(){
         System.out.println("test");
     }
}

class Inheritance13 extends Inheritance12{

  protected  static  void test(){
        System.out.println("test");
    }
}
class Inheritance14 extends Inheritance13{

  protected static void test(){
        System.out.println("test");
    }
}
abstract  class myAb{

    abstract void m();
}