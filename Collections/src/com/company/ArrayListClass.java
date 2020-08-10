package com.company;

import javafx.scene.control.RadioButton;

import java.util.ArrayList;
        import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayListMethod();
    }

    static  void ArrayListMethod(){
        ArrayList<Long> RandNumb= new ArrayList<>();
        RandNumb.add(12l);
        RandNumb.add(24l);
        RandNumb.add(56l);
        RandNumb.add(13l);
        RandNumb.add(50l) ;
        RandNumb.add(30l);

        System.out.println("Numbers unsorted");
        System.out.println(RandNumb);
        System.out.println("Numbers sorted");
        Collections.sort(RandNumb);
        System.out.println(RandNumb);
    }
}
class  VectorClass{


    public static void main(String[] args) {
        Vector<String> phones= new Vector<>();
        phones.addElement("Huawei");
        phones.add("Samsung");
        phones.addElement("Apple");
        phones.add("Nokia");
        System.out.println("phones unsorted");
        System.out.println(phones);
        System.out.println("phones sorted");
        Collections.sort(phones);
        System.out.println(phones);


    }
        }
        class LinkedlistClass{
            public static void main(String[] args) {
                LinkedList<Character> CarClass= new LinkedList<>();
                CarClass.add('c');
                CarClass.add('b');
                CarClass.add('e');
                CarClass.add('d');
                CarClass.add('a');
                System.out.println("car class unsorted");
                System.out.println(CarClass);
                System.out.println("car Class sorted");
                Collections.sort(CarClass);
                System.out.println(CarClass);



            }
        }
