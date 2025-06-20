package com.observer.stock;

public class WebApp implements Observer {
    private String user;

    public WebApp(String user) {
        this.user = user;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println("WebApp (" + user + "): New Stock Price = ₹" + stockPrice);
    }

    @Override
    public String toString() {
        return "WebApp[" + user + "]";
    }
}
