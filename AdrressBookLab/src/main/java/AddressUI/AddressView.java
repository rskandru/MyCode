/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressUI;

import AddressDto.Address;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author admin
 */
public class AddressView {
    
    
    

   
    public AddressView(AddressIO io) {
        this.io = io;
    }
    
      private AddressIO io;
    
  
   
    
 
    public int printMenuAndGetSelection() {
        io.print("Initial Menu");
        io.print("Please select the operation you wish to perform :");
        
        io.print("1. Add Address");
        io.print("2. Delete Address");
        io.print("3. Find Address");
        io.print("4. List Address Count");
        io.print("5. List All Address");
        io.print("6. Exit");

        return io.readInt("Please select from the above choices.", 1, 6);
    }
    
    
    public Address getNewAddressInfo() {
        
//   String AddressId = io.readString("Please enter Address File Number");
     String firstName = io.readString("Please Enter First Name");
     String lastName = io.readString ( "Please Enter Last Name");
     String Address = io.readString  ( "Please Enter Street Address");
    
    Address currentAddress = new Address(lastName);
    currentAddress.setFirstName(firstName);
    currentAddress.setLastName(lastName);
    currentAddress.setAddress(Address);
    
       
    return currentAddress;
}
    
    
   public void displayCreateAddressBanner() {
    io.print("=== Create Address ===");
}
   
   
    public void displayCreateSuccessBanner() {
    io.readString(
            "Address successfully created.  Please hit enter to continue");
    
}
  public void displayErrorMessage(String errorMsg) {
    io.print("=== ERROR ===");
    io.print(errorMsg);
}  
   
    public void displayAddressList(List<Address> AddressList) {
    for (Address currentAddress : AddressList) {
         String Addressinfo = String.format("%s : %s %s",
                 
            
              currentAddress.getFirstName(),
              currentAddress.getLastName(),
              currentAddress.getAddress());
             
             
              io.print(Addressinfo);
        }
               io.readString("Press Enter to continue.");
 } 
  
  
    public void displayDisplayAllBanner() {
    io.print("=== Display All Address ===");
        }    
    
    public void displayDisplayAddressBanner () {
    io.print("===  Address ===");
    }

    public String getAddressIdChoice() {
    return io.readString("Please enter the Last Name.");
    }

    public void displayAddress(Address address) {
    if (address != null) {
//      io.print(address.getAddressId());
        io.print(address.getFirstName() + " " + address.getLastName());
        io.print(address.getAddress());
        io.print("");
    } else {
        io.print("No such Address.");
    }
    io.readString("Press Enter to continue.");
    }
    
     public void displayRemoveAddresstBanner () {
     io.print("=== Remove Address ===");
    }
      

    public void displayRemoveResult(Address addressRecord) {
    if(addressRecord != null){
      io.print("Address successfully removed.");
    }else{
      io.print("No such Address.");
    }
    io.readString("Please hit enter to continue.");
    } 
    
    public void displayExitBanner() {
    io.print("Good Bye!!!");
    }

    public void displayUnknownCommandBanner() {
    io.print("Unknown Command!!!");
    }   

    //lineNumberReader
    //open file and read  and count line by line 
    //display output of line counted.
  
    public void displaysCount() {
        
     
      File file = new File("addressbook.txt");

      long lines = 1;

      try (LineNumberReader lnr = new LineNumberReader(new FileReader(file))) {

          while (lnr.readLine() != null) ;

          lines = lnr.getLineNumber();
          

      } catch (IOException e) {
          e.printStackTrace();
      }
       io.print("Number of File(s) Entered : <<<"+ lines  +">>> file(s) in total ");
       
    }
    
}    
    

    
    
  

             
//        
//        io.print("====== <"  +myFile.length()+"> Address loaded in file ======");
//    }

    
    

