package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] myArray ={2,4,55,78,12,54,9,0,6};
        Main m= new Main();
        System.out.println("Arrays before sort");
        System.out.print(Arrays.toString(myArray));
        m.Insertionsort(myArray);
        System.out.println("Arrays after sort");

        System.out.print(Arrays.toString(myArray));

    }

    private void Insertionsort( int myArray[])
    {
        int temp,i,j, key;
        for (i=1; i<myArray.length;i++)
        {
            key=myArray[i];
            j=i-1;
            while(j>=0 && key<myArray[j])
            {
                temp= myArray[j];
                myArray[j]= myArray[j+1];
                myArray[j+1]=temp;
            j--;
            }

        }
    }



}

