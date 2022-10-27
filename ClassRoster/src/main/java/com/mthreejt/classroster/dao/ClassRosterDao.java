
package com.mthreejt.classroster.dao;

import com.mthreejt.classroster.dto.Student;
import java.util.List;

/**
 *
 * @author rskandru
 */
public interface ClassRosterDao {
    
     /**
     * @param studentId id with which student is to be associated
     * @param student student to be added to the roster
     * @return the Student object previously associated with the given  
     * student id if it exists, null otherwise
     */
    Student addStudent(String studentId, Student student) 
            throws ClassRosterDaoException;

    /**
     * @return List containing all students in the roster.
     */
    List<Student> getAllStudents() 
            throws ClassRosterDaoException;

    /**
     * @param studentId ID of the student to retrieve
     * @return the Student object associated with the given student id,  
     * null if no such student exists
     */
    Student getStudent(String studentId) 
            throws ClassRosterDaoException;

    /**
     * @param studentId id of student to be removed
     * @return Student object that was removed or null if no student
     * was associated with the given student id
     */
    Student removeStudent(String studentId) 
            throws ClassRosterDaoException;
    
    
}
