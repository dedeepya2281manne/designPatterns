package com.web.designPatterns.creational.builder.userexample;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Dedeepya", "Manne").build();
        User user1 = new User.UserBuilder("Lokeswar", "Manne").setAge(23).setPhno("1234567890").build();
        System.out.println(user.toString());
        System.out.println(user1.toString());
    }
}
