package com.gpteam.java_learning;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<Product>();
    }

    public void putProduct(Product product) {
        products.add(product);
    }

    public void print() {
        for (int i = 0; i < products.size(); i++) {
            getProductInfo(i);
        }
    }

    private void getProductInfo(int index) {
        System.out.println(products.get(index).getNazwa() + " cena: " +
        products.get(index).getCena() + " ilosc w magazynie: " +
        products.get(index).getQuantity());
    }
}