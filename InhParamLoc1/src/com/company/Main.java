package com.company;

public class Main {

    public static void main(String[] args) {
        Foo m = new Foo();
    }
}

 class Foo{
    int size;
    String name;
    Foo(){

    }
    Foo(String name, int size)
    {
      this.name =name;
      this.size=size;
    }
    void Foo(){

    }
}
interface FrogBoliable{

   default    int getCtoF(int cTemp)
    {
        return (cTemp*9/5)+32;
    }
}