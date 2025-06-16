package com.vasanth;

public class Laptop implements Computer {

    public Laptop(){
        System.out.println("lptaa obj created");
    }

    @Override
    public void code()
    {
        System.out.println("player codiingss using lap");
    }
}
