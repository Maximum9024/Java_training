package com.company;

public class Main {

    public static void main(String[] args)
    {
 /*      int []ia={1,3,5,7,9};
       for(int x :ia)
       {
           for (int j=0;j<3;j++) {
           if(x>4 && x<8) continue;
           System.out.print(" "+x);
           if(j==1) break;
           continue;
           }
           continue;
       }*/
       int []ia={1,3,5,7,9};
        for(int x :ia)
        {
            for (int j=0;j<3;j++) {
                if(x<4 || x<8) continue;
                System.out.print(" "+x);
                if(j==1) continue;
                continue;
            }
            continue;
        }
   /*   outer: for (int i =0;i<3;i++){
          for (int j =0;j<2;j++)
          {
              if(i==j)
              {
                  break ;
              }
              System.out.println("i="+i+",j="+j);
          }
      }*/
  /*  Main m= new Main();
    m.looper();
    System.out.println(m.x);
*/
  int i=0;
  for (;i<2;i=i+5)
    {
      if(i<5) continue;
    }
  System.out.println(i);
    /*
    int x=5;
    int get() { return x;}
    public void looper()
    {
        int x=0;
        while ((x=get())!=0)
        {
           for (int m=10;m>=0;m--)
           {
                         x=m;
           }
        }*/

    }
}
