package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	 int c=0;
	 A: for (int i=0;i<2;i++) {
         B:
         for (int j = 0; j < 2; j++) {
             C:
             for (int k = 0; k < 3; k++) {
                 c++;
                 if (k > j) break;
             }
         }
     }
     System.out.println(c);
    }
}

class Switcher{
    public static void main(String[] args) {
        switch (Integer.parseInt(args[1])){
            case 0:
                boolean b=false;
                break;
            case 1:
                b=true;
        }
        //if (b)System.out.println(args[2]);
    }
}
class TestClass{
    static  boolean b;
    static int[] ia= new int[1];
    static  char ch;
    static  boolean[] ba=new boolean[1];

    public static void main(String[] args) {
        boolean x=false;
        if(b){
            x=(ch==ia[ch]);
        } else x=(ba[ch]=b);
        System.out.println(x+" "+ ba[ch]);
    }
}
class TestClass2{
    public static void main(String[] args) {
        Stack s1= new Stack();
        Stack s2 = new Stack();
        proccessStacks(s1,s2);
        System.out.println(s1+"  "+s2);

    }
    public static void proccessStacks(Stack x1,Stack x2){
        x1.push(new Integer("100"));
        x2=x1;
    }
}
class Triangle{
    public int base;
 //   public int final double ANGLE;
   //  public  void setAngle(double a){ ANGLE=a;}

    public static void main(String[] args) {
    //    Triangle t= new Triangle();
     //   t.setAngle(90);
    }
}

class TestClass3{
    static class Wrapper{
        int w =10;
    }
    static Wrapper changeWrapper(Wrapper w){
       w=new Wrapper();
       w.w+=9;
        return w;
    }
    public static void main(String[] args) {
         System.out.println(3+100/10*2-13);
    }
}
class Logger{
    private StringBuilder sb= new StringBuilder();
    public  void logMsg(String location, String message){
        sb.append(location);
        sb.append("-");
        sb.append(message);
    }
    public void dumpLog(){
        sb.delete(0,sb.length());
        System.out.println(sb.toString());

    }
}
class Testclass7{
    public static void main(String[] args) {
        B b= new B();
        A a=b;
        if (a instanceof A)System.out.println("A");
        if(a instanceof  B) System.out.println("B");
        if (a instanceof C) System.out.println("C");
        if (a instanceof D) System.out.println("D");
    }
}
class A{}
class B extends A{}
class C extends B{}
class D extends C{}
class X{
    B getB(){ return new B();}
}
class Y extends X{
    C getB(){ return new C();}

}
class TestClass8{
    public static void main(String[] args) {

    }
}
class Base{
    private float f=1.0f;
    void setF(float f1){this.f=f1;}
}
class Base2 extends Base{
    private float f=2.0f;
}
class Testclass9{
    public static void main(String[] args) {
        int i=0;
        boolean bool1= true;
        boolean bool2=false;
        boolean bool=false;
        bool=(bool2 & method1(i++));
        bool=(bool2 && method1(i++));
        bool=(bool1 | method1(i++));
        bool=(bool1 || method1(i++));
        System.out.println(i);
    }
    public static boolean method1(int i){
        return i>0? true:false;
    }
}