package com.web.designPatterns.creational.factory.springbootexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class NotificationFactory {

    private final Map<String, NotificationService> services;

    @Autowired
    public NotificationFactory(Map<String, NotificationService> serviceMap) {
        this.services = serviceMap;
        System.out.println(services.toString());
    }

    public NotificationService getService(String type) {
        return services.get(type + "Service"); // e.g., "emailService"
    }
}
