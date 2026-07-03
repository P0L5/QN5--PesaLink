package com.pesalink.notification;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private List<Notifier> channels;

    public NotificationService() {
        this.channels = new ArrayList<>();
    }

    public void addChannel(Notifier notifier) {
        channels.add(notifier);
    }

    public void removeChannel(Notifier notifier) {
        channels.remove(notifier);
    }

    public void sendToAll(String message) {
        for (Notifier n : channels) {
            n.send(message);
        }
    }

    public int channelCount() {
        return channels.size();
    }
}
