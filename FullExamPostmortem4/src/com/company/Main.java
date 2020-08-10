package com.company;

public class Main {

    public static void main(String[] args) {

    }
}
class TestClass{
    static TestClass ref;
    String[] arguments;

    public static void main(String[] args) {
        ref = new TestClass();
        ref.func(args);
    }
    public void func(String[] args){
        ref.arguments= args;
    }
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
        Alpha g1= new Alpha();
  Beta b1 = new Beta();
        Beta g2 = new Gamma();
        Alpha g3= new Gamma();
        Alpha g4 = new Beta();
        System.out.println(g1.getType()+" "+g1.getType());

    }
}




class feline{
    public String type="f";
    public feline(){
        System.out.println("feline");
        System.out.println("JBL");
    }

}
class Cougar extends  feline{
    public  Cougar(){
        System.out.println("cougar");
    }
    void go(){
        type ="c";
        System.out.println(this.type+ super.type);
    }
    public static void main(String[] args){
        new Cougar().go();
    }
}

