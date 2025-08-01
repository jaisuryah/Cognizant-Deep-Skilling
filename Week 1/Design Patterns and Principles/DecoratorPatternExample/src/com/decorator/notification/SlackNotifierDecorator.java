package com.decorator.notification;

public class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // Send previous notifications
        System.out.println("Sending Slack Message: " + message); // Add Slack functionality
    }
}
