/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bibliotekaxml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String [] arg){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        context.registerShutdownHook();
        Ksiazka ksiazka1 = (Ksiazka) context.getBean("Ksiazka1");
        System.out.println(ksiazka1.toString());
        Wypozyczajacy wypozyczajacy1 = context.getBean("Wypozyczajacy1",Wypozyczajacy.class);
        System.out.println(wypozyczajacy1.toString());
        Ksiazka ksiazka2 = (Ksiazka) context.getBean("Ksiazka2");
        System.out.println(ksiazka2.toString());
        Wypozyczajacy wypozyczajacy2 = context.getBean("Wypozyczajacy2",Wypozyczajacy.class);
        System.out.println(wypozyczajacy2.toString());
        Ksiazka ksiazka3 = (Ksiazka) context.getBean("Ksiazka3");
        System.out.println(ksiazka3.toString());
        Wypozyczajacy wypozyczajacy3 = context.getBean("Wypozyczajacy3",Wypozyczajacy.class);
        System.out.println(wypozyczajacy3.toString());
    }
}
