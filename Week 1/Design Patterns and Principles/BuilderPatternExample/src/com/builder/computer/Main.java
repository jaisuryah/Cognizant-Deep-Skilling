package com.builder.computer;

public class Main {
    public static void main(String[] args) {
        // Basic Computer
        Computer basicComputer = new Computer.Builder()
            .setCpu("Intel i3")
            .setRam("8GB")
            .setStorage("256GB SSD")
            .build();

        basicComputer.showSpecs();

        System.out.println("------------------------");

        // Gaming Computer
        Computer gamingComputer = new Computer.Builder()
            .setCpu("AMD Ryzen 9")
            .setRam("32GB")
            .setStorage("1TB NVMe")
            .setGraphicsCard(true)
            .setWiFi(true)
            .build();

        gamingComputer.showSpecs();
    }
}
