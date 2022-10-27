/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentQuizScore;

import StudentQuizController.StudentQuizController;
import StudentQuizDao.StudentQuizDao;
import StudentQuizDao.StudentQuizDaoFileImpl;
import StudentQuizUI.StudentConsoleImpl;
import StudentQuizUI.StudentIO;
import StudentQuizUI.StudentQuizView;

/**
 *
 * @author rskandru
 */
public class StudentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         StudentIO myIo = new StudentConsoleImpl();
         StudentQuizView myView = new StudentQuizView(myIo);
         StudentQuizDao myDao =  new StudentQuizDaoFileImpl();
         StudentQuizController controller =   new StudentQuizController(myView, myDao);
         controller.run();
        
    }
    
}
