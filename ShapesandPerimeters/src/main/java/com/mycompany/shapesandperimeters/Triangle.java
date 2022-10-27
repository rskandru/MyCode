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
public class Triangle extends Shape {
    int base =0;
    int height =0;
    int side2=0;
    int side3=0;
    

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
        area = base * height / 2;
        perimeter = base + side2 + side3;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
         area =base * height / 2;
       
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
        perimeter = base + side2 + side3;
        
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
        perimeter = base + side2 + side3;
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
