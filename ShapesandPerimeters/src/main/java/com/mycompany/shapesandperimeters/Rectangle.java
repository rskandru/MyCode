/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shapesandperimeters;

/**
 *
 * @author rskandru
 */
public class Rectangle extends Shape {
    
   int lenght =0;
    int height =0;

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
        area =lenght * height;
        perimeter = (2*lenght) + (2 * height);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        area =lenght * height;
        perimeter = (2*lenght) + (2 * height);
    }
    
    @Override
    public int getArea() {
        return area;
    }

    @Override
    public int getPerimeter() {
       return perimeter;
    }
    
}