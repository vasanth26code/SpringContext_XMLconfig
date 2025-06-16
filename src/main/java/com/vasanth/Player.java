package com.vasanth;

public class Player {

    private int age;
//    private Laptop lap;
    private Computer com;

    public Player()
    {
        System.out.println("player obj create");
    }

//    @ConstructorProperties({"age","lap"})
//    public Player(int age, Laptop lap)
//    {
//        System.out.println("params constr called");
//        this.age = age;
//        this.lap = lap;
//    }

    public int getAge() { return age; }
    public void setAge(int age)
    {
      //  System.out.println("setter callled");
        this.age = age;
    }

//    public Laptop getLap() { return lap; }
//    public void setLap(Laptop lap)
//    {
//        System.out.println("setter lap cal");
//        this.lap = lap;
//    }

    public Computer getCom(){ return com; }
    public void setCom(Computer com)
    {
        this.com = com;
    }

    public void play()
    {
        System.out.println("playing");
        com.code();
    }

}
