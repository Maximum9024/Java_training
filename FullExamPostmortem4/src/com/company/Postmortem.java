package com.company;

public class Postmortem {
    public static void main(String[] args) {
        int i=0, j=11;
        do {
            if (i>j){break;}
            j--;
        }while (++i<5);
        System.out.println(i+" "+j);
    }
}

class MySuper{
    public MySuper(int i){}
}
abstract class MySub extends MySuper{
    public MySub(int i){super(i);}
    public abstract void m1();
}
class MyTest{
    public static void main(String[] args) {
        MySub ms = new MySub(2) {
            @Override
            public void m1() {
                System.out.println("In MySub.m1()");
            };

        };
        ms.m1();
    }
}
class TestClass20{
    char c;
    public static void main(String[] args) {
        new TestClass20().m1();
    }
    public void m1(){
        char[] cA={'a','b'};
        m2(c,cA);
        System.out.println((int)c+", "+cA[1]);
    }
    public void m2(char c, char[] cA){
        c='b';
        cA[1]=cA[0]='m';
    }

}
class Testclass21{
    public static void main(String[] args) {
        int j=1;

        try {
            int i= doIt()/(j=1);
        } catch (Exception e){
            System.out.println("j = "+j);
        }

    }
    public static int doIt() throws Exception{ throw  new Exception("1");}
}
class TestClass22{
    public static void main(String[] args) {
            }

    public static void main(){ new TestClass22();}
   // public static void sayHello(){ System.out.println("Static Hello World");}
    public void sayHello(){System.out.println("Hello World");}

}
class TestClass23{
   public int c=0;
    void crazyLoop(){
        JACK: while(c<8){
            JILL: System.out.println(c);
        if(c>3)break JACK; else c++;
        }
    }
}
class TestClass24{
    static boolean a;
    static boolean b;
    static boolean c;

    public static void main(String[] args) {
        boolean bool=(a=true)||(b=true) &&(c=true);
        System.out.print(a+", "+b+", "+c);
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
            throw new E1();
        }catch (E1 e){
            System.out.println("E1");
        }catch (Exception e){
            System.out.println("E");
        }
        finally {
            System.out.println(("Finally").intern());
        }
    }
}
class TestClass25{
    static TestClass25 ref;
    String[] arguments;

    public static void main(String[] args) {
        ref = new TestClass25();
        ref.arguments=args;
    }

}
abstract class Testclass26{
     public static void main(String[] args) {
        int INT=2,INT2=4;
        for (int i=INT;i<INT2; System.out.println(++i)){

        }
    }
    abstract  public void add() throws  Exception;
}
class Parser{
    public static void main(String[] args) {
        try{
            int i =0;
            i=Integer.parseInt(args[0]);

        }catch (NumberFormatException e){
          //  System.out.println("Problem in "+i);
        }
    }
  //  void perform_work(int time){}
    int perform_work(int time){ return time;}
}
class Testclass27 implements T1,T2{
    @Override
    public void m1() {
        System.out.println(T2.VALUE);
    }

}

interface T1{
    int VALUE =1;
    void m1();
}
interface T2{
    int VALUE =2;

    void m1();
}
class TestClass28{
    int a;
  //  static int a;
 //   int f(){ return a;}
   // static int f(){return  a;}
}
class TestClass30{
    static int someInt=10;
    public static void changeIt(int a){
        a=20;
    }
    public static void main(String[] args){
        changeIt(someInt);
        System.out.println(someInt);
    }
}
class Sample{
    public static void main(String[] args) {
        String s1= new String("java");
        StringBuilder s2= new StringBuilder("java");

    }
    static void replaceString(String s){
        s=s.replace('j','i');
    }
    static void replaceStringBuilder(StringBuilder s){
        s.append("c");
    }
}