package com.company;


class NewException extends Exception{}
class AnotherException extends Exception{}
public class Main {

    public static void main(String[] args) throws Exception {
	try{
       m2();
    }finally {
        //  m3();
    }

    }
    public static void m2() throws  NewException{
        throw new NewException();
    }
    public static void m3() throws AnotherException{
        throw new AnotherException();
    }
}
