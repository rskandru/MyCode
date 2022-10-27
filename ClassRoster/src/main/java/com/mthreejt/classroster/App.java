
package com.mthreejt.classroster;

import com.mthreejt.classroster.controller.ClassRosterController;
import com.mthreejt.classroster.dao.ClassRosterDao;
import com.mthreejt.classroster.dao.ClassRosterDaoFileImpl;
import com.mthreejt.classroster.ui.ClassRosterView;
import com.mthreejt.classroster.ui.UserIO;
import com.mthreejt.classroster.ui.UserIOConsoleImpl;

/**
 *
 * @author rskandru
 */
public class App {
    
    public static void main(String[] args) {
        UserIO myIO = new UserIOConsoleImpl();
        ClassRosterView myView = new ClassRosterView(myIO);
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        ClassRosterController controller = new ClassRosterController(myDao, myView);
        controller.run();       
    }
    
}
