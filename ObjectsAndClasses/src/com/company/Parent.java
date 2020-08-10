package com.company;

public class Parent {
    public  Parent(){
        System.out.println("Parent...");
    }
    public  Parent(String name){
        System.out.println("Parent...");
    }
    public  static void main(String[] args){
    //    Child1 c1 = new Child1();
        Child2 c2 = new Child2();
    }
}
 class Child1 extends Parent{
    public Child1(){

    }
    public Child1( String name){

        System.out.println("Child1...");
    }

 }
class Child2 extends Parent{
    public Child2(){
  super();
        System.out.println("Child2...");
    }
}