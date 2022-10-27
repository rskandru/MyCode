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
public class Square extends Shape {
     int side =0;
    
    public void setSide(int sideLength){
        side= sideLength;
        area = side * side;
        perimeter = 4 * side;
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
