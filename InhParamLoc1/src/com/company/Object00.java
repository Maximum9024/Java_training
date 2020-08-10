package com.company;

class Object00 {

}
class Object01 extends Object {

}
 class Object02 extends Object {

}
class Object03 {

    static {
        Object03 test = new Object03();
        System.out.println(test instanceof  Object);
    }
}
