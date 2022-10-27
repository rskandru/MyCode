/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressDao;

import AddressDto.Address;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

/**
 *
 * @author admin
 */
public class AddressDaoFileImpl implements AddressDao {

     

      public  final String  ADDRESS_FILE;
      public static final String DELIMITER = "::";
        
      private Map<String, Address> addresS = new HashMap<>();

   //My jUnit Testing constructor

    public AddressDaoFileImpl() {
      this.ADDRESS_FILE = "addressbook.txt";  
    }

    public AddressDaoFileImpl(String ADDRESS_FILE) {
        this.ADDRESS_FILE = ADDRESS_FILE;
    }
      
      
          
      
      
      private Address unmarshallAddress(String addressAsText){
          
    // studentAsText is expecting a line read in from our file.
    // For example, it might look like this:
    // 1234::Ada::Lovelace::Java-September1842
    //
    // We then split that line on our DELIMITER - which we are using as ::
    // Leaving us with an array of Strings, stored in studentTokens.
    // Which should look like this:
    // ______________________________________
    // |    |   |        |                  |
    // |1234|Ada|Lovelace|Java-September1842|
    // |    |   |        |                  |
    // --------------------------------------
    //  [0]  [1]    [2]         [3]
    String[] addressTokens = addressAsText.split(DELIMITER);

    // Given the pattern above, the student Id is in index 0 of the array.
    String  AddressId = addressTokens[0];
    
 
    // Which we can then use to create a new Student object to satisfy
    // the requirements of the Student constructor.
     Address addressFromFile = new Address(AddressId);

    // However, there are 3 remaining tokens that need to be set into the
    // new student object. Do this manually by using the appropriate setters.

    // Index 1 - FirstName
    addressFromFile.setFirstName(addressTokens[1]);

    // Index 2 - LastName
    addressFromFile.setLastName(addressTokens[2]);
    
//    studentFromFile.setScore1();
//     
//    studentFromFile.setScore2(studentTokens[4]);

    // Index 3 - Cohort
    addressFromFile.setAddress(addressTokens[3]);

    // We have now created a student! Return it!
     return addressFromFile;
}
      
  
    
    private void loadRoster() throws AddressDaoException {
    Scanner scanner;

    try {
        // Create Scanner for reading the file
      scanner = new Scanner( new BufferedReader(new FileReader(ADDRESS_FILE)));
      } catch (FileNotFoundException e) {
        throw new AddressDaoException(
                "-_- Could not load address data into memory.", e);
     }
    // currentLine holds the most recent line read from the file
    String currentLine;
    // currentStudent holds the most recent student unmarshalled
    Address currentAddress;
    // Go through ROSTER_FILE line by line, decoding each line into a 
    // Student object by calling the unmarshallStudent method.
    // Process while we have more lines in the file
    while (scanner.hasNextLine()) {
        // get the next line in the file
        currentLine = scanner.nextLine();
        // unmarshall the line into a Student
        currentAddress = unmarshallAddress(currentLine);

        // We are going to use the student id as the map key for our student object.
        // Put currentStudent into the map using student id as the key
        addresS.put(currentAddress.getLastName(), currentAddress);
    }
    // close scanner
    scanner.close();
} 
   
    
    private String marshallAddress(Address aAddress){
    // We need to turn a Student object into a line of text for our file.
    // For example, we need an in memory object to end up like this:
    // 4321::Charles::Babbage::Java-September1842

    // It's not a complicated process. Just get out each property,
    // and concatenate with our DELIMITER as a kind of spacer. 

    // Start with the student id, since that's supposed to be first.
    String addressAsText = aAddress.getAddressId() + DELIMITER;

    // add the rest of the properties in the correct order:

    // FirstName
    addressAsText += aAddress.getFirstName() + DELIMITER;

    // LastName
    addressAsText += aAddress.getLastName() + DELIMITER;

//    // Cohort - don't forget to skip the DELIMITER here.
    addressAsText += aAddress.getAddress();
    

    // We have now turned a student to text! Return it!
    return addressAsText;
}
    
    

    
    /**
 * Writes all students in the roster out to a ROSTER_FILE.  See loadRoster
 * for file format.
 * 
 * @throws ClassRosterDaoException if an error occurs writing to the file
 */
  private void writeAddress() throws AddressDaoException, FileNotFoundException {
    // NOTE FOR APPRENTICES: We are not handling the IOException - but
    // we are translating it to an application specific exception and 
    // then simple throwing it (i.e. 'reporting' it) to the code that
    // called us.  It is the responsibility of the calling code to 
    // handle any errors that occur.
    PrintWriter out;

    try {
        out = new PrintWriter(new FileWriter(ADDRESS_FILE));
    } catch (IOException e) {
        throw new AddressDaoException(
                "Could not save address data.", e);
    }

    // Write out the Student objects to the roster file.
    // NOTE TO THE APPRENTICES: We could just grab the student map,
    // get the Collection of Students and iterate over them but we've
    // already created a method that gets a List of Students so
    // we'll reuse it.
    String addressAsText;
    List<Address> addressList = this.getAllAddress();
    for (Address currentAddress : addressList) {
        // turn a Student into a String
        addressAsText = marshallAddress(currentAddress);
        // write the Student object to the file
        out.println(addressAsText);
        // force PrintWriter to write line to the file
        out.flush();
    }
    // Clean up
    out.close();
   
  }
     
  
  
  
  
  
  
  
  
          
     @Override
     public Address addAddress(String AddressId, Address address) throws AddressDaoException {
        loadRoster();
        
         Address newAddress = addresS.put(AddressId, address);
          try {
              writeAddress();
          } catch (FileNotFoundException ex) {
              Logger.getLogger(AddressDaoFileImpl.class.getName()).log(Level.SEVERE, null, ex);
          }
         return newAddress;  
    }

    @Override
    public List<Address> getAllAddress() throws AddressDaoException {
        loadRoster();
         return new ArrayList(addresS.values());
    }

    @Override
    public Address getAddress(String LastName) throws AddressDaoException {
        loadRoster();
        return addresS.get(LastName);
    }
    

    @Override
    public Address removeAddress(String LastName) throws AddressDaoException {
        loadRoster();
        Address removedAddress = addresS.remove(LastName);
          try {
              writeAddress();
          } catch (FileNotFoundException ex) {
              Logger.getLogger(AddressDaoFileImpl.class.getName()).log(Level.SEVERE, null, ex);
          }
      return removedAddress;
    }

    
   
   
  
}
