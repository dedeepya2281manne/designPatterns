package com.web.designPatterns.creational.singleton;

public class EagerInitiation {

    private static EagerInitiation eagerInitiation= new EagerInitiation();

    public static EagerInitiation getInstance(){
        return eagerInitiation;
    }
    private EagerInitiation(){
        System.out.println("Eager Initiation");
    }

    public static void main(String[] args) {
        EagerInitiation instance1 = EagerInitiation.getInstance();
        EagerInitiation instance2 = EagerInitiation.getInstance();
        System.out.println(instance1+" "+instance2);

    }

}
