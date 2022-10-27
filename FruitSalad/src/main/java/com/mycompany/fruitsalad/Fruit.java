/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fruitsalad;

/**
 *
 * @author rskandru
 */
public class Fruit {
    
    private String name;
    private double price;

    Fruit(String name, double price) {
        setName(name);
        setPrice(price);
    }

    String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }
}
