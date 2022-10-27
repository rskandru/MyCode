/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.statecapitals;

/**
 *
 * @author rskandru
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StateCapitals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
   Map<String, String> stateCapitals = new HashMap<>();
   
   // adding  States and thier capitals
   
     stateCapitals.put("Alabama", "Montgometry");
     stateCapitals.put("Alaska", "Juneau");
     stateCapitals.put("Arizona", "Phoenix");
     stateCapitals.put("Arkansas", "Little Rock");

     Set <String> keys = stateCapitals.keySet();
     Collection<String> capValues = stateCapitals.values();
     
     //Displaying the States
     
        System.out.println("STATES");
        System.out.println("========");
        for (String states : keys){
            System.out.println(states);
        }
        System.out.println(".....");
        System.out.println(".....");

     // displaying the capitals
        System.out.println("CAPITALS");
        System.out.println("========");
        
        for (String capitals : capValues ){
         System.out.println(capitals);        
        }
       
        System.out.println(".....");
        System.out.println(".....");
        
     
        //displaying all the values
        System.out.println("STATE/CAPITAL PAIRS:");
        System.out.println("====================");
        for (String c : keys){    
        System.out.println(c+  " - "  +stateCapitals.get(c));
     }
   
    }
} 
        

