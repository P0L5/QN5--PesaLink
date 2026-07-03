package com.pesalink.notification;

public final class GatewayConfig {
    private static volatile GatewayConfig instance;

    private String apiEndpoint;
    private String apiKey;
    private int retryCount;

    private GatewayConfig() {
        this.apiEndpoint = "https://api.pesalink.com/notify";
        this.apiKey = "default-key";
        this.retryCount = 3;
    }

    public static GatewayConfig getInstance() {
        if (instance == null) {
            synchronized (GatewayConfig.class) {
                if (instance == null) {
                    instance = new GatewayConfig();
                }
            }
        }
        return instance;
    }

    public String getApiEndpoint() {
        return apiEndpoint;
    }

    public void setApiEndpoint(String apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }
}
