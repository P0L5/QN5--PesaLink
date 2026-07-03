package com.pesalink.notification;

public class PushNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("[PUSH] " + message);
    }
}
