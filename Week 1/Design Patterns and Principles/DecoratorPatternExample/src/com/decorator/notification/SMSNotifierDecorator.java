package com.decorator.notification;

public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // Send previous notifications
        System.out.println("Sending SMS: " + message); // Add SMS functionality
    }
}
