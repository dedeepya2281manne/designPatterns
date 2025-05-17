package com.web.designPatterns.creational.factory.springbootexample;

import org.springframework.stereotype.Service;

@Service("whatsappService")
public class WhatsAppNotificationService implements NotificationService{
    @Override
    public void sendMessage(String message) {
        System.out.println("In WhatsApp Notification Service");
    }
}
