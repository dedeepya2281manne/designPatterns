package com.web.designPatterns.creational.singleton;

public class ThreadsafeCreation {
    private static ThreadsafeCreation threadsafeCreation ;
    private ThreadsafeCreation(){
        System.out.println("Threadsafe creation of object");
    }
    public static synchronized ThreadsafeCreation getInstance(){
        //this is slow because everytime when we try to access the object synchronized locks the method for remaining threads and slows down the execution
        // so we can have double check for creation of object
        if(threadsafeCreation == null){
            threadsafeCreation=new ThreadsafeCreation();
        }
        return threadsafeCreation;
    }
}
