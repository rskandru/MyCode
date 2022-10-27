/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentQuizUI;
import StudentQuizDto.Student;
import java.util.List;
/**
 *
 * @author rskandru
 */
public class StudentQuizView {
     public StudentQuizView(StudentIO io) {
        this.io = io;
    }
    
      private StudentIO io;
    
  
   
    
 
    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List Students");
        io.print("2. Create New Student");
        io.print("3. View a Student");
        io.print("4. Remove a Student");
        io.print("5. Enter 1St Score");
        io.print("6. Enter 2nd Score");
        io.print("7. View List of Score");
        io.print("8. View average Score");
        io.print("9. Exit");

        return io.readInt("Please select from the above choices.", 1, 9);
    }
    
    
    public Student getNewStudentInfo() {
    String studentId = io.readString("Please enter Student ID");
    String firstName = io.readString("Please enter First Name");
    String lastName = io.readString("Please enter Last Name");
//    String cohort = io.readString("Please enter Cohort");
    Student currentStudent = new Student(studentId);
    currentStudent.setFirstName(firstName);
    currentStudent.setLastName(lastName);
//    currentStudent.setCohort(cohort);
    return currentStudent;
}
    
    
   public void displayCreateStudentBanner() {
    io.print("=== Create Student ===");
}
   
   
    public void displayCreateSuccessBanner() {
    io.readString(
            "Student successfully created.  Please hit enter to continue");
    
}
  public void displayErrorMessage(String errorMsg) {
    io.print("=== ERROR ===");
    io.print(errorMsg);
}  
   
    public void displayStudentList(List<Student> studentList) {
    for (Student currentStudent : studentList) {
        String studentInfo = String.format("#%s : %s %s",
              currentStudent.getStudentId(),
              currentStudent.getFirstName(),
              currentStudent.getLastName(),
              currentStudent.getScore1(),
              currentStudent.getScore2());
              io.print(studentInfo);
    }
             io.readString("Please hit enter to continue.");
} 
  
  
    public void displayDisplayAllBanner() {
    io.print("=== Display All Students ===");
}    
    
    public void displayDisplayStudentBanner () {
    io.print("=== Display Student ===");
}

    public String getStudentIdChoice() {
    return io.readString("Please enter the Student ID.");
}

    public void displayStudent(Student student) {
    if (student != null) {
        io.print(student.getStudentId());
        io.print(student.getFirstName() + " " + student.getLastName());
//        io.print(student.getCohort());
        io.print("");
    } else {
        io.print("No such student.");
    }
    io.readString("Please hit enter to continue.");
}
    
   public void displayRemoveStudentBanner () {
    io.print("=== Remove Student ===");
}

    public void displayRemoveResult(Student studentRecord) {
    if(studentRecord != null){
      io.print("Student successfully removed.");
    }else{
      io.print("No such student.");
    }
    io.readString("Please hit enter to continue.");
} 
    
 public void displayExitBanner() {
    io.print("Good Bye!!!");
}

public void displayUnknownCommandBanner() {
    io.print("Unknown Command!!!");
}   
    
    
}
