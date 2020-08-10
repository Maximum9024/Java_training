package com.company;


import javax.sound.sampled.Port;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Employee{
    static  int i=10;
    {
        System.out.println(" Employee static "+i);
    }
    static { System.out.println(" Employee static "+i);}
}
class Manager extends Employee{
    static {
        i=45;
        System.out.println(" Manager static ");
    }{
        i=30;
        System.out.println(" Manager "+i);
    }

}
class  Owner extends Manager{
    static {System.out.println("Owner");}
}

class TestClass{
    public static void main(String[] args) {
        Manager m= new Manager();

    }
}
class Test{
    public static void main(String[] args) throws Exception {
        int[] a =null;
        int i =a[m1()];
    }
    public static int m1() throws Exception{
        throw new Exception("Some Exception");
    }
}
class TestClass2{
    public static void main(String[] args) {
        try {
            RuntimeException re=null;
            throw re;
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
class Testclass3{
    public static void main(String[] args) {
        int x=1;
        int y=0;
     //   if(x/y) System.out.println("Good");
       // else System.out.println("Bad");
    }
}
class TestClass4{
    public static void main(String[] args) {
        int i=Integer.parseInt(args[1]);
        System.out.println(args[i]);
    }
}
class Test5{
    public static void main(String[] args) {
        int[][] a ={{00,01},{10,11}};
        int i=99;
        try{
            a[val()][i=1]++;
        } catch ( Exception e){
            System.out.println(i+", "+a[1][1]);
        }
    }
    static int val() throws Exception{
        throw new Exception("unimplemented");
    }
}
class Test6{
    public static void main(String[] args) {
        int a= Integer.MIN_VALUE;
        int b=-a;
        System.out.println(a+"  "+b);
    }
}
class Car{
    public int gearRatio =8;
    public  String accelerate(){ return "Accerelate : Car";}
}
class SportCar extends Car{
    public  int gearRatio= 9;
    public String acccelerate(){ return "Accelerate : SportCar"; }

    public static void main(String[] args) {
        Car c= new SportCar();
        System.out.println(c.gearRatio+" "+ c.accelerate());
    }
}
class E1 extends Exception{}
class E2 extends  E1{}
class  Test7{
    public static void main(String[] args){
        try {
            throw new E2();
        }catch (E1 e){
            System.out.println("E1");
        }catch (Exception e){
            System.out.println("E");
        }
        finally {
            System.out.println("Finally");
        }
    }
}
class test7{
    public  static final int i=10;
    public int i2 =10;
    public int i3=10;
    public int i4=10;


    public static void main(String[] args) {

    }
}
class Doll{
    String name;
    Doll(String nm){
        this.name=nm;
    }
}
class Barbie extends Doll{
    Barbie(){
        super("unknown");
    }
    Barbie(String nm){
        super(nm);
    }
}
class Test8{
    public static void main(String[] args) {
        Barbie b= new Barbie("mydoll");

    }
}
class PortConnector {
    public PortConnector(int port) throws Exception{
        if(Math.random()>0.5){
            throw new IOException();
        }
        throw new RuntimeException();
    }
}
class Test9{
    public static void main(String[] args) throws Exception {
        try{
            PortConnector pc= new PortConnector(10);

        }catch (RuntimeException re){
            re.printStackTrace();
        }
    }
}
class  ScopeTest{
    static int x=5;

    public static void main(String[] args) {
        int x=(x=3)*4;
        System.out.println(x);
    }
}
class Test10{
    final public static void main(String args[]){}

}
class Test11{
    int i;

    public Test11(int i){ this.i=i;}
    public  String toString(){
        if(i==0) return null;
        else return ""+i;
    }

    public static void main(String[] args) {
        Test11 t1= new Test11(0);
        Test11 t2=new Test11(2);
        System.out.println(t2);
        System.out.println(" "+t1);
    }
}
class A{
    private int i=10;
    public  void f(){}
    public  void g(){}
}
class B extends A{
    public  int i=20;
    public void g(){}
}
 class C{
 A a= new A();
 A b= new B();

     public static void main(String[] args) {
      //   System.out.println(b.f());
     }
}

class ListTest{
    public static void main(String[] args) {
        List s1 =new ArrayList();
        s1.add("a");
        s1.add("b");
        s1.add(1,"c");
        List s2= new ArrayList(s1.subList(1,1));
        s1.addAll(s2);
        System.out.println(s1);
    }
}
abstract  class  TestClass1{
    transient int j;
      int k;
    final void   TestClass1(){

    }
}
class  Baap{

    public  int h=4;
    public int getH(){
        System.out.println("Beta "+h);
        return h;
    }
}
class  Beta extends Baap{
    public int getH(){
        System.out.println("Beta "+h);
        return h;
    }

    public static void main(String[] args) {
        Baap b= new Beta();
        System.out.println(b.h+" "+b.getH());
        Beta bb=(Beta)b;
        System.out.println(bb.h+" "+bb.getH());
    }
}

class Test12{


    public static void main(String[] args) {
        int i=0,j=0;
        X1:for(i=0;i<3;i++){
            X2:for (j=3;j>0;j--){
            if(i<j){
                continue X1;
            }else break X2;
            }
        }
        System.out.println(i+" "+j);
    }

}
class Holder{
    int value =1;
    Holder link;
    public Holder(int val){ this.value=val;}

    public static void main(String[] args) {
        final Holder a= new Holder(10);
        Holder b = new Holder(10);
        a.link=b;
        b.link= setIt(a,b);
        System.out.println(a.link.value+" "+b.link.value);
    }
    public  static Holder setIt(final Holder x, final Holder y){
        x.link=y.link;
        return x;
    }
}
class Test13{
    public static void main(String[] args) {
        int i=0;
        boolean bool1= true;
        boolean bool2=false;
        boolean bool=false;
        bool=(bool2 & method("1"));
        bool=(bool2 && method("2"));
        bool=(bool1 | method("3"));
        bool=(bool1 = method("4"));
    }
    public  static  boolean method(String str){
        System.out.println(str);
        return true;
    }
}
class Test14{
    public static void main(String[] args) {
        String hello="Hello", lo="lo";
        System.out.println();

    }
}
abstract class TestClass10{
    transient  int j;
     int k;
    final void TestClass10(){
        k=j++;
        }
    }
class AA{
    private int i=10;
    public void f(){}
    public void g(){}
}
class BB extends AA{
    public int i=20;
    public void g(){}
}
class CC{


    public static void main(String[] args) {
        A a= new A();
        A b= new B();
        b.f();
        a.g();
    }
}
enum Season{SUMMER,WINTER,SPRING,FALL}
class  Sea{


    public static void main(String[] args) {
        Season s= Season.SPRING;
        switch (s){
            case SUMMER:System.out.println("SUMMER");
            default : System.out.println("SEASON");
            case WINTER:System.out.println("SUMMER");
        }
    }
}