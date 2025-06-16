package com.vasanth;

public class Desktop implements Computer{

    public Desktop()
    {
        System.out.println("Desktop Obj created");
    }

    @Override
    public void code()
    {
        System.out.println("player codingss using desktop");
    }

}
