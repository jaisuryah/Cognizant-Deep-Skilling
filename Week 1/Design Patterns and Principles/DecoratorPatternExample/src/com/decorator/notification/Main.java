package com.decorator.notification;

public class Main {
    public static void main(String[] args) {
        // Basic Notifier: Email only
        Notifier emailNotifier = new EmailNotifier();

        // Decorated with SMS
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

        // Decorated with Slack on top of SMS + Email
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Send notification through all channels
        slackNotifier.send("System maintenance scheduled at 9 PM.");
    }
}
