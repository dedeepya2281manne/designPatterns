package com.web.designPatterns.creational.factory.springbootexample;

import org.springframework.stereotype.Service;

@Service("emailService")
public class EmailNotificationService implements NotificationService{
    @Override
    public void sendMessage(String message) {
        System.out.println("In Email Notification Service");
    }
}
