package com.web.designPatterns.creational.singleton;

import java.lang.reflect.Constructor;

public class DoubleCheck {
    private static DoubleCheck doubleCheck;
    private DoubleCheck(){ //external object creation is restricted due to private
        System.out.println("creation Object by Double checking");
    }
    public static DoubleCheck getInstance(){
        if(doubleCheck==null){
            synchronized (DoubleCheck.class){
                if(doubleCheck==null){
                    doubleCheck = new DoubleCheck();
                }
            }
        }
        return doubleCheck;
    }

    public static void main(String[] args) {
        DoubleCheck inst1 = DoubleCheck.getInstance();
        DoubleCheck inst2 = DoubleCheck.getInstance();
        System.out.println(inst1+" "+inst2);
    }
}
