package com.observer.stock;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer user1Mobile = new MobileApp("User1");
        Observer user2Web = new WebApp("User2");
        Observer user3Mobile = new MobileApp("User3");

        stockMarket.registerObserver(user1Mobile);
        stockMarket.registerObserver(user2Web);
        stockMarket.registerObserver(user3Mobile);

        stockMarket.setStockPrice(250.50);
        stockMarket.setStockPrice(265.75);

        stockMarket.removeObserver(user3Mobile);
        stockMarket.setStockPrice(280.30);
    }
}
