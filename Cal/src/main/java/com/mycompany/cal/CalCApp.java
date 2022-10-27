/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cal;

import java.util.Scanner;

/**
 *
 * @author rskandru
 */
public class CalCApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String operand = null;
      
        
     while(true){
           
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter First Number >>");
        int firstNum = Integer.parseInt(userInput.nextLine());
        System.out.println("Enter Second Number >>");
        int secondNum = Integer.parseInt(userInput.nextLine());
        
        System.out.println("Please Enter operand (+)Addition.. (*)Multiplication..(/)Division..(-)Subtraction..");
        operand = userInput.nextLine();
        
         if (operand.equals("/")) {
                
              Calculator myCalculator = new Calculator();
              double answer = myCalculator.div(firstNum,secondNum);
              System.out.println("The Answer is >>>> " +answer);     
             }
             else if (operand.equals("+")){
                Calculator myCalculator = new Calculator();
                int answer = myCalculator.add(firstNum,secondNum);
                System.out.println("The Answer is >>>> " +answer);   
              }
             else if (operand.equals("-")){
                 Calculator myCalculator = new Calculator();
                 int answer = myCalculator.subtract(firstNum,secondNum);
                System.out.println("The Answer is >>>> " +answer); 
           
             }
       
             else if (operand.equals("-")){
                 Calculator myCalculator = new Calculator();
                 int answer = myCalculator.subtract(firstNum,secondNum);
                 System.out.println("The Answer is >>>> " +answer); 
           
             }
             else if (operand.equals("*")){
                Calculator myCalculator = new Calculator();
                int answer = myCalculator.mult(firstNum,secondNum);
                System.out.println("The Answer is >>>> " +answer); 
           
             }
             else
                 System.out.println("invalid operand");
     }
       
    }
    
    
   
}
