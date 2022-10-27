/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressDao;

import AddressDto.Address;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author admin
 */
public class AddressDaoFileImplTest {
    
    public AddressDaoFileImplTest() {
    }
    
    
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//  
    
   AddressDao testDao;
   private Map<String, Address> addresS = new HashMap<>();
   
  
   @BeforeEach
   public void setUp() throws IOException {
       
       String testFile = "testaddressbook.txt";
       new FileWriter(testFile);
       testDao = new AddressDaoFileImpl(testFile);
  }
//   
    
//    
//    
//    @AfterEach
//    public void tearDown() {
//    }

    /**
     * Test of addAddress method, of class AddressDaoFileImpl.
     */
    @Test
    public void testAddGetAddress() throws Exception {
     
        //create method test inputs
        //ARRANGE
        Address address1 = new Address("Bonie","Ferrer","5580-Sheppard Ave east");
        
        //ACT
        //Add student to the Dao
        testDao.addAddress("Ferrer", address1);
        //get the student fron Dao
        Address address2 = testDao.getAddress("Ferrer");
        
       
        assertEquals(address1.getFirstName(),address2.getFirstName());
        assertEquals(address1.getLastName(),address2.getLastName());
        assertEquals(address1.getAddress(),address2.getAddress());
        assertEquals(address1,address2 );    
              
    }
    
    

    /**
     * Test of getAllAddress method, of class AddressDaoFileImpl.
     */
    @Test
    public void testGetAllAddress() throws Exception {
      //arrange
        //create 2 students
        
         Address address1 = new Address("Bonie","Ferrer","5580 - sheppard ave east");
         Address address2 = new Address("Bruce","Wayne"," 6730 - gotham city");
         
        //add bothour students
        
        testDao.addAddress("Ferrer",address1);
        testDao.addAddress("Wayne",address2);
        
        //act
        //retrieve the list of all students to the Dao
        List<Address>addresS = testDao.getAllAddress();
        
        //assert
        //first check the general contents of the list
        
        assertNotNull(addresS);
        assertEquals(2,addresS.size());
        
        //then the specifics
        
        assertTrue(addresS.contains (address1));
        assertTrue(addresS.contains (address2));   
        
    }

    /**
     * Test of getAddress method, of class AddressDaoFileImpl.
     */
//    @Test
//    public void testGetAddress() throws Exception {
//    }

    /**
     * Test of removeAddress method, of class AddressDaoFileImpl.
     */
    @Test
    public void testRemoveAddress() throws Exception {
         //arrange
        //create 2 students
        
         Address address1 = new Address("Bonie","Ferrer","5580 - sheppard ave east");
         Address address2 = new Address("Bruce","Wayne"," 6730 - gotham city");
         
        //add bothour students
        
        testDao.addAddress("Ferrer",address1);
        testDao.addAddress("Wayne",address2);
        
        //remove the first student - bonie
        Address removedAddress =testDao.removeAddress("Ferrer");
        
        //check that the correct object was removed
        assertEquals(removedAddress, address1);
        
        //get all the students
        List<Address>addresS = testDao.getAllAddress();
        
        //first check the generalcontent of the list
         
        assertNotNull(addresS);
        assertEquals(1,addresS.size());
        
        //then the specifics
        
        assertFalse(addresS.contains(address1));
        assertTrue(addresS.contains(address2));
        
                 
        
    }
    
}
