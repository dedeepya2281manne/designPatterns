package com.web.designPatterns.creational.singleton;

public class LazyInitiation {

    private static LazyInitiation lazyInitiation = null;

    private LazyInitiation(){
        System.out.println("Lazy Initialization");
    }
    public static LazyInitiation getInstance(){
        if(lazyInitiation==null){ //race condtion - more than one thread access at a time results in multiple instance creation violates the singleton pattern
            lazyInitiation = new LazyInitiation();
        }
        return lazyInitiation;
    }

    public static void main(String[] args) {
        LazyInitiation instance1 = LazyInitiation.getInstance();
        LazyInitiation instance2 = LazyInitiation.getInstance();
        System.out.println(instance1+" "+instance2);
    }
}
