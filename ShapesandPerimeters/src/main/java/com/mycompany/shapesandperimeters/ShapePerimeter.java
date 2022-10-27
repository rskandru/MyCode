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
public class ShapePerimeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        Square s = new Square();
        s.setSide(4);
        System.out.println("the radius of the circle  is >>>>   "+ s.getArea());
        System.out.println("the perimeter of the square  is >>>>   "+ s.getPerimeter());
        
        
        
        Circle c = new Circle();
        c.setRadius(5);
        System.out.println("the radius of the circle  is >>>>   "+ c.getArea());
        
        
        
        Rectangle r = new Rectangle();
        r.setLenght(5);
        r.setHeight(7);
        System.out.println("the area of the rectangle  is >>>>   "+ r.getArea());
        System.out.println("the perimeter of the rectangle  is >>>>   "+ r.getPerimeter());
        
        
        Triangle t = new Triangle();
        t.setBase(8);
        t.setSide2(5);
        t.setSide3(4);
        System.out.println("the area of the triangle  is >>>>   "+ t.getArea());
        System.out.println("the perimeter of the triangle  is >>>>   "+ t.getPerimeter());
        
        
        
    }
    
}
