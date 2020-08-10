package com.company;

public class InsCounterTest {
    public static void main(String[] args) {
        new InstanceCounter();
        new InstanceCounter();
        new InstanceCounter();
        new InstanceCounter();
        min m = new min();
        min.statv1=9;

    }
}

 class min{
    int v1=0;
    static  short statv1=15;
        }
