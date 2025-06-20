package com.proxy.image;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // First time load
        image1.display();
        System.out.println();

        // Second time - should load from cache
        image1.display();
        System.out.println();

        // First time load for second image
        image2.display();
    }
}
