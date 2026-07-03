package com.pesalink.notification;

public class WhatsAppNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("[WHATSAPP] " + message);
    }
}
