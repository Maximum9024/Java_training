package com.company;


class Display{
    public void display()
    {
        System.out.println("Display.display");
    }
}
class  Monitor extends  Display{
    public long pixelCount(){
        return 1024*768;
    }
}
public class Main {

    public static void main(String[] args) {
        Monitor display= new Monitor();
        long pixelCount = display.pixelCount();

    }
}