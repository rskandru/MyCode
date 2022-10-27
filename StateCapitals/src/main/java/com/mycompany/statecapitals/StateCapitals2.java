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


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class StateCapitals2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              
//PrintWriter out = new PrintWriter(new FileWriter("StateCapitals.txt"));
//      
//out.println("alabama::Montgomery");
//out.println("Alaska::Juneau");
//out.println("Arizona::Phoenix");
//out.println("Arkansas::Little Rock");
//out.println("California::Sacramento");
//out.println("Colorado::Denver");
//out.println("Connecticut::Hartford");
//out.println("Delaware::Dover");
//out.println("Florida::Tallahassee");
//out.println("Georgia::Atlanta");
//out.println("Hawaii::Honolulu");
//out.println("Idaho::Boise");
//out.println("Illinois::Springfield");
//out.println("Indiana::Indianapolis");
//out.println("Iowa::Des Moines");
//out.println("Kansas::Topeka");
//out.println("Kentucky::Frankfort");
//out.println("Louisiana::Baton Rouge");
//out.println("Maine::Augusta");
//out.println("Maryland::Annapolis");
//out.println("Massachusetts::Boston");
//out.println("Michigan::Lansing");
//out.println("Minnesota::Saint Paul");
//out.println("Mississippi::Jackson");
//out.println("Missouri::Jefferson City");
//out.println("Montana::Helena");
//out.println("Nebraska::Lincoln");
//out.println("Nevada::Carson City");
//out.println("New Hampshire::Concord");
//out.println("New Jersey::Trenton");
//out.println("New Mexico::Santa Fe");
//out.println("new York::Albany");
//out.println("North Carolina::Raleigh");
//out.println("North Dakota::Bismarck");
//out.println("Ohio::Columbus");
//out.println("Oklahoma::Oklahoma City");
//out.println("Oregon::Salem");
//out.println("Pennsylvania::Harrisburg");
//out.println("Rhode Island::Providence");
//out.println("South Carolina::Columbia");
//out.println("South Dakota::Pierre");
//out.println("Tennessee::Nashville");
//out.println("Texas::Austin");
//out.println("Utah::Salt Lake City");
//out.println("Vermont::Montpelier");
//out.println("Virginia::Richmond");
//out.println("Washington::Olympia");
//out.println("West Virginia::Charleston");
//out.println("Wisconsin::Madison");
//out.println("Wyoming::Cheyenne");
//out.flush();
//out.close();

Map<String, String> StateCapitals = new HashMap<>();
     
StateCapitals.put("Alabama","Montgomery");
StateCapitals.put("Alaska","Juneau");
StateCapitals.put("Arizona","Phoenix");
StateCapitals.put("Arkansas","Little Rock");
StateCapitals.put("California","Sacramento");
StateCapitals.put("Colorado","Denver");
StateCapitals.put("Connecticut","Hartford");
StateCapitals.put("Delaware","Dover");
StateCapitals.put("Florida","Tallahassee");
StateCapitals.put("Georgia","Atlanta");
StateCapitals.put("Hawaii","Honolulu");
StateCapitals.put("Idaho","Boise");
StateCapitals.put("Illinois","Springfield");
StateCapitals.put("Indiana","Indianapolis");
StateCapitals.put("Iowa","Des Moines");
StateCapitals.put("Kansas","Topeka");
StateCapitals.put("Kentucky","Frankfort");
StateCapitals.put("Louisiana","Baton Rouge");
StateCapitals.put("Maine","Augusta");
StateCapitals.put("Maryland","Annapolis");
StateCapitals.put("Massachusetts","Boston");
StateCapitals.put("Michigan","Lansing");
StateCapitals.put("Minnesota","Saint Paul");
StateCapitals.put("Mississippi","Jackson");
StateCapitals.put("Missouri","Jefferson City");
StateCapitals.put("Montana","Helena");
StateCapitals.put("Nebraska","Lincoln");
StateCapitals.put("Nevada","Carson City");
StateCapitals.put("New Hampshire","Concord");
StateCapitals.put("New Jersey","Trenton");
StateCapitals.put("New Mexico","Santa Fe");
StateCapitals.put("new York","Albany");
StateCapitals.put("North Carolina","Raleigh");
StateCapitals.put("North Dakota","Bismarck");
StateCapitals.put("Ohio","Columbus");
StateCapitals.put("Oklahoma","Oklahoma City");
StateCapitals.put("Oregon","Salem");
StateCapitals.put("Pennsylvania","Harrisburg");
StateCapitals.put("Rhode Island","Providence");
StateCapitals.put("South Carolina","Columbia");
StateCapitals.put("South Dakota","Pierre");
StateCapitals.put("Tennessee","Nashville");
StateCapitals.put("Texas","Austin");
StateCapitals.put("Utah","Salt Lake City");
StateCapitals.put("Vermont","Montpelier");
StateCapitals.put("Virginia","Richmond");
StateCapitals.put("Washington","Olympia");
StateCapitals.put("West Virginia","Charleston");
StateCapitals.put("Wisconsin","Madison");
StateCapitals.put("Wyoming","Cheyenne");
    
     
     


       
     
       Set <String> keys = StateCapitals.keySet();
       Collection<String> capValues = StateCapitals.values();
     
        

        System.out.println(StateCapitals.size()+ "  STATES & CAPITALS ARE LOADED");
        System.out.println("================================");
        System.out.println("HERE ARE THE STATES");
        System.out.println("=====================");
        
        for (String states : keys){
            System.out.println(states);
        }
       
             
    while(true){
        
        Object[] theState = StateCapitals.keySet().toArray();
        Object key = theState[new Random().nextInt(theState.length)];
        
        System.out.println("READY TO TEST YOUR KNOWLEDGE? WAHT IS THE CAPITAL OF "+key);
        System.out.println(StateCapitals.get(key));
        String theCapital = (StateCapitals.get(key));
        
        
        
        Scanner UserInput = new Scanner(System.in);
        System.out.println("The Capital is ------>");
        String UserAns = UserInput.nextLine();
        
        if (UserAns.equalsIgnoreCase(theCapital)){
            System.out.println("NICE WORK!!   " + theCapital +"IS CORRECT");
            
        }
        else{
            System.out.println("Sorry Wrong Answer...");
        }
        
       }     
    }
    
}
