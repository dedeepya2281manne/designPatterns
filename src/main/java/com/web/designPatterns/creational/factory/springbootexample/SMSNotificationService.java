package com.web.designPatterns.creational.factory.springbootexample;

import org.springframework.stereotype.Service;

@Service("smsService")
public class SMSNotificationService implements NotificationService{
    @Override
    public void sendMessage(String message) {
        System.out.println("In SMS Notification Service");
    }
}
