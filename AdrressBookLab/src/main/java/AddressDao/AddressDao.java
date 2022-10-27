/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressDao;

import AddressDto.Address;
import java.util.List;

/**
 *
 * @author admin
 */
public interface AddressDao {
    
   /**
     * Adds the given Student to the roster and associates it with the given
     * student id.If there is already a student associated with the given
 student id it will return that student object, otherwise it will
 return null.
     *
     * @param AddressId with which student is to be associated
     * @param address student to be added to the roster
     * @return the Student object previously associated with the given  
     * student id if it exists, null otherwise
     * @throws StudentQuizDao.StudentQuizDaoException
     * 
     */
    Address addAddress(String AddressId, Address address)throws AddressDaoException;
    /**
     * Returns a List of all students in the roster.
     *
     * @return List containing all students in the roster.
     * @throws StudentQuizDao.StudentQuizDaoException
     */
    List<Address> getAllAddress() throws AddressDaoException;
    /**
     * Returns the student object associated with the given student id.Returns null if no such student exists
     *
     * @param lastName ID of the student to retrieve
     * @return the Student object associated with the given student id,  
     * null if no such student exists
     * @throws StudentQuizDao.StudentQuizDaoException
     */
    Address getAddress(String lastName)throws AddressDaoException;

    /**
     * Removes from the roster the student associated with the given id.Returns the student object that is being removed or null if
     there is no student associated with the given id
     *
     * @param AddressId id of student to be removed
     * @return Student object that was removed or null if no student
     * was associated with the given student id
     * @throws StudentQuizDao.StudentQuizDaoException
     */
    Address removeAddress(String AddressId)throws AddressDaoException;
    
  
    
    
    
    
    
}

   
    

