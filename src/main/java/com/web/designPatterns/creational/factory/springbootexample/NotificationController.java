package com.web.designPatterns.creational.factory.springbootexample;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notify")
public class NotificationController {

    private final NotificationFactory factory;

    public NotificationController(NotificationFactory factory) {
        this.factory = factory;
    }

    @GetMapping("/{type}")
    public String sendNotification(@PathVariable String type, @RequestParam String message) {
        NotificationService service = factory.getService(type);
        if (service == null) return "Unknown notification type: " + type;

        service.sendMessage(message);
        return "Notification sent via " + type;
    }
}
