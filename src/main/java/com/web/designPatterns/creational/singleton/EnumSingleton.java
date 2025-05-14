package com.web.designPatterns.creational.singleton;

public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("Singleton with Enum is working!");
    }
}
