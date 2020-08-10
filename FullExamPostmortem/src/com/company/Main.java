package com.company;

public class Main {

    public static void main(String[] args) {


    }
}
class Calculator{
    int num =100;
    public static void main(String[] args) {
        Calculator obj =new Calculator();
        obj.calc(2);
        obj.printNum();

    }
    public void calc(int num){
        this.num=num*10;

    }
    public void printNum(){
        System.out.println(num);
    }
}
 class MyLoop{
     public static void main(String[] args) {
         String[] sa={"tom","jerry"};
         for(int x=0;x<3;x++){
             for ( String s:sa) {
                 System.out.println(x+" "+s);
                 if (x==1){
                     break;
                 }

             }
         }
     }
}
interface Rideable{ String getGait();}
 class Camel implements Rideable{
    int Weight=2;
    public String getGait(){return "mph,lope";};
}
class Alpha{
    String getType(){
        return "alpha";
    }
}
class Beta extends Alpha{
    String getType(){
        return "beta";
    }
}
 class Gamma extends Beta{
    String getType(){
        return "gamma";
    }
    public static void main(String[] args){
      //  Gamma g1= new Beta();

    }
}
class feline{
    public String type="f";
    public feline(){
        System.out.println("feline");
    }

}
class Cougar extends  feline{
    public  Cougar(){
        System.out.println("cougar");
    }
    void go(){

        System.out.println(this.type+ super.type);
    }
    public static void main(String[] args){
        new Cougar().go();
    }
}
class Ex1{
    static  int x=10;
    public  static void main(String[] args){
        for (int x=0;x<5;x++){}
        System.out.print(x);
    }
}
class Person{
    Person(String s, int i){
        ++pid;
        name=s;
        age=i;

    }
    static int pid;
    int age;
    String name;
}
class Test{
    public static void main(String[] args){
        Person p1= new Person("John",22);
        Test te= new Test();
        Person p2=te.change(p1);
        System.out.println(p2.pid+" "+p2.name+" "+p2.age);
        System.out.println(p1.pid+" "+p1.name+" "+p1.age);
    }
    private Person change(Object o){
        Person p2=(Person)o;
        p2.age=25;
        return p2;
    }
}
class App{
    public static void main(String[] args) {
        try{
            switch (Integer.parseInt(args[0])){
                case 1:
                    throw new IllegalStateException();
                case 2:
                    throw new IllegalArgumentException();
                case 3:
                    throw new RuntimeException();
            }
        }finally {

        }
    }
}
class Pro{
    public static void main(int[] args) {
        System.out.println("main1");
    }

    public static void main(String...c) {
        System.out.println("main2");
    }
    public static void main(String[][] c) {
        System.out.println("main3");
    }
}
class One{
    static int x;

    public static void main(String[] args) {
        int x=1;
        for (int a=5;x<a;a--){
            System.out.print(a);
        }
    }
}
class DoCompare4{
    public static void main(String[] args) {
        String[] table={"dd","oo","pp"};
        int temp=0;
        do

        while(temp<table.length)
            System.out.print((temp++)+"");
          while (temp<table.length);
    }
}
class Triangle{
    public int base;
    public int height;
    private static  double ANGLE;

    public static void main(String[] args) {

    }
}
class NewException extends Exception{}
class AnotherException extends Exception{}
 class ExceptionTest{
     public static void main(String[] args) throws Exception {
         try {

             m2();
         }finally {
          m3();
         }
     }
     public static void m2() throws NewException{
         throw new NewException();
     }
     public static void m3() throws AnotherException{
         throw new AnotherException();
     }
}
class Four{
    static int x;

    public static void main(String[] args) {
        String ss="aBc";
        String s="ABC";
        switch (s){
            case "":x++;
            case "AbC":x++;break;
            case "ABC":x--;
            default:x++;

        }
    }
}
class TestClass{
   String str="Hello World";
   static void changeIt(String s){

       s="Good bye world";
    }
   public static void main(String[] args){
       changeIt(new TestClass().str);
       System.out.println(new TestClass().str);
    }
}
class Game{
    public void play() throws Exception{
        System.out.println("Playing...");
    }
}
class Soccer extends Game{
    public void play(String ball){
        System.out.println("Playing Soccer with "+ball);
    }
}
class TestClass2{
    public static void main(String[] args) throws Exception{
        Game g= new Soccer();
        g.play();
        Soccer s=(Soccer)g;
        s.play("cosco");
    }
}
class Testclass2{
    public static void main(String[] args) {
        String s="hello";
        StringBuilder sb= new StringBuilder("hello");
        sb.reverse();

    }

}
class Testclass4{

    public static void main(String[] args) {
          A a= new A();
          B b= new B();
          A c=(B)(i)b;
    }
}
interface i{

}
class A implements i{}
class B extends A{}
class C extends B{}
class TestClass5{
    static  int value=0;
    public  static void main(String args[]){
        int 2ndArgument=Integer.parseInt(args[2]);
        if (true==2>10){
            value=-10;
        }else {
            value= 2ndArgument;
        }
        for (;value>0;value--) System.out.println("A");
    }
}