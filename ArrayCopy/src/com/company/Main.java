package com.company;

public class Main {

    public static void main(String[] args) {

        int[] src={21,20,27,19,17};
        int[] dest=new int[6];
        System.arraycopy(src,5,dest,0,1);
        for (int i=0;i<dest.length;i++)
        {
            System.out.println(dest[i]);
        }
    }
}
