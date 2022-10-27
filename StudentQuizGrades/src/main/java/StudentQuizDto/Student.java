/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentQuizDto;

/**
 *
 * @author rskandru
 */
public class Student {
     private String studentId;  
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", Score1=" + Score1 + ", Score2=" + Score2 + '}';
    }
   
    // Programming Language + cohort month/year
//    private String cohort;
    private int Score1;
    private int Score2;

    public int getScore1() {
        return Score1;
    }

    public void setScore1(int Score1) {
        this.Score1 = Score1;
    }

    public int getScore2() {
        return Score2;
    }

    public void setScore2(int Score2) {
        this.Score2 = Score2;
    }

      public Student(String studentId) {
        this.studentId = studentId;
    }

   
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
//
//    public String getCohort() {
//        return cohort;
//    }
//
//    public void setCohort(String cohort) {
//        this.cohort = cohort;
//    }
}
