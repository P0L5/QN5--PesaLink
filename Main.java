package com.pesalink.notification;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== Q5 PESALINK NOTIFICATION DEMO ==========\n");

        System.out.println("=== Part (c): Singleton GatewayConfig ===");
        GatewayConfig config1 = GatewayConfig.getInstance();
        GatewayConfig config2 = GatewayConfig.getInstance();
        System.out.println("Same instance? " + (config1 == config2));
        config1.setApiEndpoint("https://api.pesalink.com/v2/notify");
        System.out.println("Config1 endpoint: " + config1.getApiEndpoint());
        System.out.println("Config2 endpoint: " + config2.getApiEndpoint());

        System.out.println("\n=== Part (b): Composition-based NotificationService ===");
        NotificationService service = new NotificationService();
        service.addChannel(new SmsNotifier());
        service.addChannel(new EmailNotifier());
        service.addChannel(new PushNotifier());
        service.addChannel(new WhatsAppNotifier());
        service.sendToAll("Your payment of UGX 50,000 was received.");

        System.out.println("\n=== Part (d): Generic TxnList<T> ===");
        TxnList<String> txnStrings = new TxnList<>();
        txnStrings.add("TXN-001");
        txnStrings.add("TXN-002");
        System.out.println("TxnList<String> size: " + txnStrings.size());
        System.out.println("Item 0: " + txnStrings.get(0));

        TxnList<Integer> txnValues = new TxnList<>();
        txnValues.add(50000);
        txnValues.add(75000);
        System.out.println("TxnList<Integer> size: " + txnValues.size());
        System.out.println("Item 1: " + txnValues.get(1));

        System.out.println("\n========== END ==========");
    }
}
