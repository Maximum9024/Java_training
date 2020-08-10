package com.company;

public class equalClass {

}

class CompEg2 {
    public static void main(String[] args) {
        String a = "1";
        String b = "1";

        boolean result = a.equals(b);

        System.out.println("result = "+result);
    }
}

class CompEg3 {
    public static void main(String[] args) {
        String a = new String("1");
        String b = new String("1");

        boolean result = a==b;

        System.out.println("result = "+result);
    }
}

class CompEg1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;

        boolean result = a == b;

        System.out.println("result = " + result);
    }

}
