package com.vasanth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Player obj1 = (Player) context.getBean("player1");
//
//        obj1.age = 24;
//        System.out.println(obj1.age);
//        obj1.play();
//
//        Player obj2 = (Player) context.getBean("player1");
//
//        System.out.println(obj1.age);
//        obj2.play();

//        Player obj1 = (Player) context.getBean("player1");
          Player obj1 = context.getBean("player1",Player.class);

//        obj1.setAge(24);
        System.out.println(obj1.getAge());
        obj1.play();

//        Computer com = context.getBean(Computer.class);
//
//        Desktop deskobj = context.getBean(Desktop.class);

    }
}
