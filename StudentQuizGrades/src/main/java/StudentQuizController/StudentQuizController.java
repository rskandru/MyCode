/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentQuizController;
import StudentQuizDao.StudentQuizDao;
import StudentQuizDao.StudentQuizDaoException;
import StudentQuizDto.Student;
import StudentQuizUI.StudentQuizView;
import java.util.List;

/**
 *
 * @author rskandru
 */
public class StudentQuizController {
       private StudentQuizView view;
     private StudentQuizDao dao;

    public StudentQuizController(StudentQuizView view, StudentQuizDao dao) {
        this.view = view;
        this.dao = dao;
    }

         
     
     

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        try {
        while (keepGoing) {

            menuSelection = getMenuSelection();

            switch (menuSelection) {
                case 1:
                    listStudents();
                    break;
                case 2:
                    createStudent();
                    break;
                case 3:
                    viewStudent();
                    break;
                case 4:
                    removeStudent();
                    break;
                    
                case 5:
                    getScore1();
                    break;
                    
                case 6:
                    getScore2();
                    break;
                    
                 case 7:
                    ListofScore();
                    break;
                    
                 case 8:
                    ViewAverage();
                    break;
                        
                        
                    
                case 9:
                    keepGoing = false;
                    break;
                default:
                    unknownCommand();
            }

        }
        exitMessage();
    } catch (StudentQuizDaoException e) {
        view.displayErrorMessage(e.getMessage());
    }
        
    }
    
    private int getMenuSelection() {
    return view.printMenuAndGetSelection();
    }

    private void createStudent() throws StudentQuizDaoException {
    view.displayCreateStudentBanner();
    Student newStudent = view.getNewStudentInfo();
    dao.addStudent(newStudent.getStudentId(), newStudent);
    view.displayCreateSuccessBanner();
    }

    private void listStudents() throws StudentQuizDaoException{
    view.displayDisplayAllBanner();
    List<Student> studentList = dao.getAllStudents();
    view.displayStudentList(studentList);
    }

    private void viewStudent() throws StudentQuizDaoException {
    view.displayDisplayStudentBanner();
    String studentId = view.getStudentIdChoice();
    Student student = dao.getStudent(studentId);
    view.displayStudent(student);
    }

    private void removeStudent() throws StudentQuizDaoException {
    view.displayRemoveStudentBanner();
    String studentId = view.getStudentIdChoice();
    Student removedStudent = dao.removeStudent(studentId);
    view.displayRemoveResult(removedStudent);
    }

    private void unknownCommand() {
    view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
    view.displayExitBanner();
    }

    private void getScore1() {
        
        
        
        
        
    }

    private void getScore2() {
        
    }

    private void ListofScore() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ViewAverage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
