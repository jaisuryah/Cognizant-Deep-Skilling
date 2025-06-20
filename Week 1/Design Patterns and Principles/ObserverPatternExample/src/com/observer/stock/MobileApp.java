package com.observer.stock;

public class MobileApp implements Observer {
    private String user;

    public MobileApp(String user) {
        this.user = user;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println("MobileApp (" + user + "): New Stock Price = ₹" + stockPrice);
    }

    @Override
    public String toString() {
        return "MobileApp[" + user + "]";
    }
}
