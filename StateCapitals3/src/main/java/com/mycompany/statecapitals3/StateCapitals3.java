/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.statecapitals3;

/**
 *
 * @author rskandru
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StateCapitals3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
Map <String, Capital> SC = new HashMap<>();   



Set <String> keys = SC.keySet();
 Collection<Capital> capValues = SC.values();
// Collection<String> capValues = SC.values();
        
SC.put("Alabama ", new Capital("Montgomery",205764,155.4));
SC.put ("Alaska ", new Capital("Juneau",1275,2716.7));
SC.put ("Arizona ",new Capital ("Phoenix",1445632,474.9));
SC.put("Arkansas", new Capital ("Little Rock",193524,116.2));
SC.put("California", new Capital( "Sacramento",466488,97.2));
SC.put("Colorado" ,new Capital ("Denver",600158,153.4));
SC.put("Connecticut" ,new Capital ("Hartford",124775,17.3));
SC.put("Delaware" ,new Capital ("Dover",36047,22.4));
SC.put("Florida" ,new Capital ("Tallahassee",181376,95.7));
SC.put("Georgia" ,new Capital ("Atlanta",420003,131.7));
SC.put("Hawaii" ,new Capital ("Honolulu",337256,85.7));
SC.put("Idaho" ,new Capital ("Boise City",205671,63.8));
SC.put("Illinois" ,new Capital ("Springfield",116250,54));
SC.put("Indiana" ,new Capital ("Indianapolis",820445,361.5));
SC.put("Iowa" ,new Capital ("Des Moines",203433,75.8));
//SC.put(Kansas Topeka::127473::56);
//SC.put(Kentucky Frankfort::25527::14.7);
//SC.put(Louisiana Baton Rouge::229493::76.8);
//SC.put(Maine Augusta::19136::55.4);
//SC.put(Maryland Annapolis::38394::6.73)
//SC.put(Massachusetts Boston::617594::48.4);
//SC.put(Michigan::Lansing::114297::35);
//SC.put(Minnesota St. Paul::285068::52.8);
//SC.put(Mississippi Jackson::173514::104.9);
//SC.put(Missouri Jefferson City::43079::27.3);
//SC.put(Montana Helena::28190::14);
//SC.put(Nebraska Lincoln::258379::74.6);
//SC.put(Nevada Carson City::55274::143.4);
//SC.put(New Hampshire Concord::42695::64.3);
//SC.put(New Jersey Trenton::84913::7.66);
//SC.put(New Mexico Santa Fe::67947::37.3);
//SC.put(New York Albany::97856::21.4);
//SC.put(North Carolina Raleigh::403892::114.6);
//SC.put(North Dakota Bismarck::61272::26.9);
//SC.put(Ohio Columbus::787033::210.3);
//SC.put(Oklahoma Oklahoma City::579999::607);
//SC.put(Oregon Salem::154637::45.7);
//SC.put(Pennsylvania Harrisburg::49528::8.11);
//SC.put(Rhode Island Providence::178042::18.5);
//SC.put(South Carolina Columbia::129272::125.2);
//SC.put(South Dakota Pierre::13646::13);
//SC.put(Tennessee Nashville-Davidson::601222::473.3);
//SC.put(Texas Austin::790390::251.5);
//SC.put(Utah Salt Lake City::186440::109.1);
//SC.put(Vermont Montpelier::7855::10.2);
//SC.put(Virginia Richmond::204214::60.1);
//SC.put(Washington Olympia::46478::16.7);
//SC.put(West Virginia Charleston::51400::31.6);
//SC.put(Wisconsin Madison::233209::68.7);
//SC.put(Wyoming Cheyenne::59466::21.1 );
//        
 //printout how many State/capital pair loaded;  
     System.out.println(SC.size()+ "  STATES & CAPITALS ARE LOADED");
     System.out.println("======================================");
     System.out.println();    

//loop to printout the CityName/Capitital/popupaltion&Area;
     for (String c : keys){    
        System.out.println(c+  " - "  +SC.get(c));
     }
     
  
     
    Scanner UserInput = new Scanner(System.in); 
    System.out.println("Please enter the lower limit Capital city population::");
    int UserIn = UserInput.nextInt();
    
    
   
     
     
     
    }
    
    
    
} 
    