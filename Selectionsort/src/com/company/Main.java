package com.company;
import  java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Main m= new Main();
        System.out.print("Array before sort \n");
        int[] myRay ={34,5,6,43,32,11,87,65,76,14,19};
        System.out.print(Arrays.toString(myRay));
        m.selectionSort(myRay);
        System.out.print("Array after sort \n");
        System.out.print(Arrays.toString(myRay));

        m.selectionSort(myRay);
    }

    private int[] selectionSort(int[] list)
    {
        int temp=0,j,i,minIndex,minValue;

        for (i=0;i<list.length;i++)
        {
            minValue=list[i];
            minIndex=i;

            for (j=i;j<list.length;j++)
            {
              if (list[j]<minValue)
              {
                  minValue=list[j];
                  minIndex=j;


              }
            }
            if (minValue<list[i])
            {
                temp= list[i];
                list[i]=list[minIndex];
                list[minIndex]=temp;

            }

        }
           return  list;
    }

}
