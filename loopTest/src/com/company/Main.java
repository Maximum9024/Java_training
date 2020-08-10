package com.company;
import java.util.Arrays;
public class Main {

    public static  void main(String[] args) {
        int values[][][]={{{2,3,45},{9,24}},{{23,45},{36,12}},{{34,9},{54,43}}};
         int values2[][]= {{24,2,12,45,5},{165,65,32,67,89,4},{8,5,3,21,5,66}};
         int[] values3= new int[]{2,4,32,56,31,65,37,20};
         int[] intArray=values3 ;
       //  values3=new float []{(int)45.45,76,86,4,3,2};new int[][]{{24,54,3,67},{70,32,4,3}};
        int values4[][]= new int[3][2];
         int number;
        int[] values5 ={24,54,3,67};
           values4[1]=values5;
          while (number++<3);
            System.out.println(number);



             //System.out.println(Arrays.toString(values4));

       /*  for (int i=-8;i<2;i++)
       {
           System.out.println("Test "+values3[i]);
       }*/

 //  System.out.println( Main.doStuff());

    }
      static boolean doStuff()
    {
           for (int i=1; i<5;i++)
           {
               System.out.println(i);
              break;
           }
        return true;


    }
}
