package com.gpteam.java_learning;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Product jablko = new Product("Jablko", 5, 1);
        Product gruszka = new Product("Gruszka", 3, 2);

        inventory.putProduct(jablko);
        inventory.putProduct(gruszka);
        inventory.print();
    }
}
