package com.kgisl.qs1;

public class Parent {
    public Parent() {
        System.out.println("First");
    }
    static {
        System.out.println("First static block");
    }
    {
        System.out.println("First initialisation  block");
    }
 }
 
  class Child extends Parent {
    {
        System.out.println("Second initialisation block");
    }
    static {
        System.out.println("Second static block");
    }
 
    public Child() {
        System.out.println("Second");
    }
    public static void main(String[] args) {
        new Child();
    }
 }